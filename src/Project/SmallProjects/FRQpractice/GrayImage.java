package Project.SmallProjects.FRQpractice;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  1/7/2025
 * <p>
 * Assignment:   	FRQ practice
 * <p>
 * Attribution: I worked with BOOOOOM, and we finished these questions to the best of our ability
 * <p>
 * General Description:  It takes a 2d array of numbers from 0 to 255 displaying colors, and counts the
 * amount that are 255 and does some strange math to redetermine the values of the peices.
 * <p>
 * Advanced:  	Nothing really I just did the questions
 *
 */

public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /** The 2-dimensional representation of this image. Guaranteed not to be null.
     * All values in the array are within the range [BLACK, WHITE], inclusive.
     */
    private int[][] pixelValues;

    public GrayImage(int[][] pixels)
    {
        pixelValues = new int[pixels.length][];
        for (int r = 0; r < pixels.length; r++)
            pixelValues[r] = java.util.Arrays.copyOf(pixels[r], pixels[r].length);
    }

    // Part (a)

    /** @return the total number of white pixels in this image.
     *    Postcondition: this image has not been changed.
     */
    public int countWhitePixels()
    {
        int count = 0;

        for (int r = 0; r < pixelValues.length; r++)
        {
            for (int c = 0; c < pixelValues[0].length; c++)
            {
                if (pixelValues[r][c] == 255)
                {
                    count++;
                }
            }
        }

        return count;
    }

    // Part (b)

    /** Processes this image in row-major order and decreases the value of each pixel at
     * position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
     * Resulting values that would be less than BLACK are replaced by BLACK.
     * Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
     */
    public void processImage()
    {
        for (int x = 0; x < pixelValues.length; x++)
        {
            for (int y = 0; y < pixelValues[0].length; y++)
            {
                if (x + 2 < pixelValues.length && y + 2 < pixelValues[0].length)
                {
                    pixelValues[x][y] = Math.max(0, pixelValues[x][y] - pixelValues[x + 2][y + 2]);
                }
            }
        }
    }

    /**
     * Converts a GrayImage into an output String.
     * To test this code run TestImage main() method class.
     */
    public String toString()
    {
        String s = "";
        for (int[] row : pixelValues)
        {
            for (int x : row)
                s += String.format(" %3d", x);
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args)
    {
        //YOUR TEST CASE
        int [][] pixels1 = {
                {255, 184, 178,  84, 129},
                { 84, 255, 255, 130,  84},
                { 78, 255,   0,   0,  78},
                { 84, 130, 255, 130,  84}
        };

        GrayImage image = new GrayImage(pixels1);
        System.out.println(image.countWhitePixels());

        int[][] pixels2 = {
                {221, 184, 178,  84, 135},
                { 84, 255, 255, 130,  84},
                { 78, 255,   0,   0,  78},
                { 84, 130, 255, 130,  84}
        };

        image = new GrayImage(pixels2);
        System.out.println();
        System.out.println(image);
        image.processImage();
        System.out.println();
        System.out.println(image);

        //MY TEST CASE
        int[][] pixels3 = {
                {255, 255, 255,  84, 129},
                {255,   0, 255, 130,  84},
                { 78, 255,  84,   0,  78},
                { 84, 130,  84, 130,  84}
        };

        image = new GrayImage(pixels3);
        System.out.println();
        System.out.println(image);
        System.out.println("White Pixels Count: " + image.countWhitePixels());
        image.processImage();
        System.out.println();
        System.out.println(image);

    }
}

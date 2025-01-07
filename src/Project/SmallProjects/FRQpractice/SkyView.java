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
 * General Description:  It takes an array of doubles and makes it a 2d array and finds the average of them.
 * <p>
 * Advanced:  	Nothing really I just did the questions
 *
 */

public class SkyView
{
    /** A rectangular array that holds the data representing a rectangular area of the sky. */
    private double[][] view;

    // Part(a)

    /** Constructs a SkyView object from a 1-dimensional array of scan data.
     *  @param numRows the number of rows represented in the view
     *         Precondition: numRows > 0
     *  @param numCols the number of columns represented in the view
     *         Precondition: numCols > 0
     *  @param scanned the scan data received from the telescope, stored in telescope order
     *         Precondition: scanned.length == numRows * numCols
     *  Postcondition: view has been created as a rectangular 2-dimensional array
     *                 with numRows rows and numCols columns and the values in
     *                 scanned have been copied to view and are ordered as
     *                 in the original rectangular area of sky.
     */
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double [numRows][numCols];
        int m = 0;

        for (int x = 0; x < numRows; x++)
        {
            for (int y = 0; y < numCols; y++)
            {
                view[x][y] = scanned[m];
                m++;
            }

            if (x < numRows - 1)
            {
                x++;

                for (int y = numCols - 1; y > -1; y--)
                {
                    view[x][y] = scanned[m];
                    m++;
                }
            }
        }
    }

    // Part(b)

    /** Returns the average of the values in a rectangular section of view.
     *  @param startRow the first row index of the section
     *  @param endRow the last row index of the section
     *  @param startCol the first column index of the section
     *  @param endCol the last column index of the section
     *  Precondition: 0 <= startRow <= endRow < view.length
     *  Precondition: 0 <= startCol <= endCol < view[0].length
     *  @return the average of the values in the specified section of view
     */
    public double getAverage(int startRow, int endRow,
                             int startCol, int endCol)
    {
        double num = 0.0;
        int place = (endRow - startRow + 1) * (endCol - startCol + 1);

        for (int x = startRow; x <= endRow; x++)
        {
            for (int y = startCol; y <= endCol; y++)
            {
                num += view[x][y];
            }
        }
        return num / place;
    }

    /*******************************************************************************/

    public static void main(String[] args)
    {
        double[] scanned = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};

        SkyView test = new SkyView(4, 3, scanned);

        for (int r = 0; r < 4; r++)
        {
            for (int c = 0; c < 3; c++)
            {
                System.out.printf("%3.1f ", test.view[r][c]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Average = " + test.getAverage(1, 2, 0, 1));

        System.out.println();

        //MY TEST CASE:
        double[] scanned3 = {2.1, 1.7, 0.9, 3.4, 2.5, 1.1, 4.2, 3.8, 1.3, 2.9, 3.1, 2.0, 1.8, 4.5, 0.7, 3.6};

        SkyView test3 = new SkyView(4, 4, scanned3);

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                System.out.printf("%3.1f ", test3.view[r][c]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Average = " + test3.getAverage(1, 3, 1, 2));

    }
}
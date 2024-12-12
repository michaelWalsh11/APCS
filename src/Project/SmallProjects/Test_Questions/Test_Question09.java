package Project.SmallProjects.Test_Questions;

public class Test_Question09 {


    public static void main(String[] args) {

        //translate testing with stuff off the sheet
        int [] binary1 = {0, 0, 0, 1, 0, 1};
        int [] binary2 = {0, 0, 1, 0, 0, 1};
        int [] binary3 = {0, 0, 1, 0, 1, 1};
        int [] binary4 = {1, 1, 1, 1, 1, 1};

        System.out.println(translate(binary1) + "A:  5");
        System.out.println(translate(binary2) + "A:  9");
        System.out.println(translate(binary3) + "A:  11");
        System.out.println(translate(binary4) + "A:  63");

    }

    /**
     * this method should translate the information from
     * binary to a number
     * @param binary the binary series with each number in a
     *               different index
     * @return the number that the binary string represents
     */
    public static int translate(int[] binary)
    {
        int output = 0;

        for (int x = 0; x < binary.length; x++)
        {
            if (binary[binary.length - x - 1] == 1)
            {
                output += (int) Math.pow(2, x);
            }
        }

        return output;
    }



    public static void nextGeneration(boolean[] strand)
    {

    }
}

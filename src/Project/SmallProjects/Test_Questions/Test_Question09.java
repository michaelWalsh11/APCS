package Project.SmallProjects.Test_Questions;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  10/23/24
 * <p>
 * Assignment:   	Ch09 code for test
 * <p>
 * Attribution: Just from what I know and my old code
 * <p>
 * General Description:   Answers the two test questions that are on the sheet I was given
 * <p>
 */

import java.util.Arrays;

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

        //GAME OF LIFE (1d version)
        boolean [] strand = {true, false, false, false, true, false, true};
        boolean [] strand2 = {false, true, false, true, false, true, false};
        nextGeneration(strand);
        nextGeneration(strand2);
        System.out.println(Arrays.toString(strand) + " TTFTFFT");
        System.out.println(Arrays.toString(strand2) + " TFFFFFT");

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


    /**
     * assume it is a circular array and the last connects
     * to the first. If it is surrounded by true then it will be
     * false. If it is surrounded by falses then it will be false.
     * If there is a true on one side and a false on the other than
     * it will become true.
     * @param strand a strand of trues and falses to edit
     */
    public static void nextGeneration(boolean[] strand)
    {

        Boolean [] nextGen = new Boolean[strand.length];

        nextGen[0] = strand[strand.length - 1] ^ strand[1];

        for (int x = 1; x < strand.length - 1; x++)
        {
            nextGen[x] = strand[x - 1] ^ strand[x + 1];
        }

        nextGen[strand.length - 1] = strand[strand.length - 2] ^ strand[0];

        for (int x = 0; x < strand.length; x++)
        {
            strand[x] = nextGen[x];
        }
    }
}

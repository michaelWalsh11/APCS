package Project.SmallProjects.TestTakeHome;

import java.util.Arrays;

public class TakeHomeTest {

    public static int [] sumColumns(int [][] mat)
    {
        int [] output = new int[mat[0].length];
        for (int x = 0; x < mat[0].length; x++)
        {
            for (int y= 0; y < mat.length; y++)
            {
                output[x] += mat[y][x];
            }
        }
        return output;
    }



    public static void main(String [] args)
    {
        int[][] array = {
                {0, 1, 2, 3, 4},
                {0, 2, 3, 4, 5},
                {3, 0, 4, 3, 3},
                {1, 1, 0, 1, 7},
                {0, 1, 0, 3, 8}
        };

        int [] output = sumColumns(array);
        System.out.println(Arrays.toString(output));
    }
}

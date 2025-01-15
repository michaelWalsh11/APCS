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


    public static void crossStuff(int [][] grid)
    {
        int num = 0;
        for (int x = 0; x < grid.length; x++)
        {
            for (int y = 0; y < grid[0].length; y++)
            {
                int shouldPrint = scanXY(grid, x, y);
                if (shouldPrint > -1)
                {
                    printXY(x, y, shouldPrint);
                }
            }
        }
    }

    private static void printXY(int x, int y, int num)
    {
        System.out.println("(" + x + ", " + y + ")" + "     " + num);
    }

    private static int scanXY(int [][] grid, int x, int y)
    {
        int numX = 0;
        int numY = 0;
        for (int i = 0; i <= 9; i++)
        {
            for (int x1 = 0; x1 < grid.length; x1++)
            {
                if (grid[x1][y] == i)
                {
                    numX++;
                }
            }

            for (int y1 = 0; y1 < grid.length; y1++)
            {
                if (grid[x][y1] == i)
                {
                    numY++;
                }
            }

            if (numX >= 3 && numY >= 3)
            {
                return i;
            }
            numX = 0;
            numY = 0;
        }
        return -1;
    }

    public static int[][] makeMagicSquare(int n)
    {
        if (n % 2 == 0)
            return null;

        int[][] grid = new int[n][n];

        int num = 1;

        int x = 0;
        int y = n / 2;

        while (num <= Math.pow(n, 2))
        {
            //place num in resting spot
            grid[x][y] = num;
            num++;

            //assign temp vars
            int nX = x - 1;
            int nY = y + 1;

            //if goes under 0 wrap
            if (nX < 0)
                nX = n - 1;

            //if outOfBounds wrap around
            if (nY == n)
                nY = 0;

            //if occupied
            if (grid[nX][nY] != 0)
            {
                //go down one;
                nX = x + 1;
                nY = y;

                //if out of bounds wrap
                if (nX == n)
                    nX = 0;
            }

            //replace temp vars
            x = nX;
            y = nY;
        }
        return grid;
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

        crossStuff(array);

        int [][] test = makeMagicSquare(3);
        for (int [] row : test)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}

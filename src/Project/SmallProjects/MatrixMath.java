package Project.SmallProjects;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  1/9/2025
 * <p>
 * Assignment:   	Matrix Math
 * <p>
 * Attribution: I did this about 2 months ago and I reused some code I also worked with BOOOOM and Jack.
 * <p>
 * General Description:   Matrix Addition and muliplication
 * <p>
 * Advanced:  	N/A
 *
 */

import java.util.Arrays;

public class MatrixMath {


    /**
     *  This prints out the matrix
     * @param mat matrix to print
     */
    public static void printMatrix(int[][] mat) {
        if (mat != null)
        {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println(); // Move to the next line after printing each row
            }
        }
        else {
            System.out.println("NULL");
        }
    }



    /**
     * @param a matrix 1
     * @param b matrix 2
     * @return
     *
     * this method should add two
     * matrices and return the output
     */

    public static int [][] matrixAddition(int [][] a, int [][] b)
    {
        if (a.length != b.length || a[0].length != b[0].length)
        {
            return null;
        }

        int [][] temp = new int[a.length][a[0].length];

        for (int x = 0; x < a.length; x++)
        {
            for (int y = 0; y < a[0].length; y++)
            {
                temp[x][y] = a[x][y] + b[x][y];
            }
        }

        return temp;
    }

    /**
     *
     * this should multiply matrices
     *
     * @param a matrix 1
     * @param b matrix 2
     * @return multiplied matrix
     */
    public static int [][] matrixMultiplcation(int [][] a, int [][] b)
    {

        if (a[0].length != b.length)
        {
            return null;
        }

        int [][] output = new int[a.length][b[0].length];

        for (int r = 0; r < a.length; r++)
        {
            for (int c = 0; c < b[0].length; c++)
            {
                output[r][c] = multiplyIndex(a, b, r, c);
            }
        }

        return output;
    }

    /**
     * @param a
     * @param b
     * @param r
     * @param c
     * @return
     *
     * helper method to the last
     * method
     */
    public static int multiplyIndex(int [][] a, int [][] b, int r, int c)
    {
        int output = 0;
        for (int x = 0; x < a[0].length; x++)
        {
            output += a[r][x] * b[x][c];
        }

        return output;
    }

    public static void main(String [] args)
    {
        System.out.println();
        System.out.print("#1: ");
        // Test Case 1: Basic Case (2x3 matrix * 3x2 matrix)
        int[][] a1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b1 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int [][] output1 = matrixMultiplcation(a1, b1);
        int [][] output1b = matrixAddition(a1, b1);

        System.out.println();
        System.out.println("Addition: ");
        printMatrix(output1b);

        System.out.println();
        System.out.println("Multiplication: ");
        printMatrix(output1);

        System.out.println();
        System.out.print("#2: ");
        // Test Case 2: Identity Matrix
        int[][] a2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] b2 = {
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13}
        };

        int [][] output2 = matrixMultiplcation(a2, b2);
        int [][] output2b = matrixAddition(a2, b2);

        System.out.println();
        System.out.println("Addition: ");
        printMatrix(output2b);

        System.out.println();
        System.out.println("Multiplication: ");
        printMatrix(output2);

        System.out.println();
        System.out.print("#3: ");
        // Test Case 3: Multiplication by a Zero Matrix
        int[][] a3 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b3 = {
                {0, 0},
                {0, 0},
                {0, 0}
        };

        int [][] output3 = matrixMultiplcation(a3, b3);
        int [][] output3b = matrixAddition(a3, b3);

        System.out.println();
        System.out.println("Addition: ");
        printMatrix(output3b);

        System.out.println();
        System.out.println("Multiplication: ");
        printMatrix(output3);

        System.out.println();
        System.out.print("#4: ");
        // Test Case 4: Incompatible Matrix Dimensions
        int[][] a4 = {
                {1, 2},
                {3, 4}
        };

        int[][] b4 = {
                {5, 6}
        };

        int [][] output4 = matrixMultiplcation(a4, b4);
        int [][] output4b = matrixAddition(a4, b4);

        System.out.println();
        System.out.println("Addition: ");
        printMatrix(output4b);

        System.out.println();
        System.out.println("Multiplication: ");
        printMatrix(output4);

        System.out.println();
        System.out.print("#5: ");
        // Test Case 5: Square Matrices
        int[][] a5 = {
                {2, 4},
                {3, 4}
        };

        int[][] b5 = {
                {1, 2},
                {3, 4}
        };

        int [][] output5 = matrixMultiplcation(a5, b5);
        int [][] output5b = matrixAddition(a5, b5);

        System.out.println();
        System.out.println("Addition: ");
        printMatrix(output5b);

        System.out.println();
        System.out.println("Multiplication: ");
        printMatrix(output5);

        System.out.println();
        System.out.print("#6: ");
        // Test Case 6: Single Row Matrix * Single Column Matrix
        int[][] a6 = {
                {1, 2, 3}
        };

        int[][] b6 = {
                {4},
                {5},
                {6}
        };

        int [][] output6 = matrixMultiplcation(a6, b6);
        int [][] output6b = matrixAddition(a6, b6);

        System.out.println();
        System.out.println("Addition: ");
        printMatrix(output6b);

        System.out.println();
        System.out.println("Multiplication: ");
        printMatrix(output6);
    }
}

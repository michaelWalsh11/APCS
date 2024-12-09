package Chapters.CWord;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  10/23/24
 * <p>
 * Assignment:   	Array Questions in google classroom
 * <p>
 * Attribution: Christian helped me out with some things and I used chatgpt to make test
 * cases for the matrix multiplcation becuase it would be annoying to write on my own
 * <p>
 * General Description:   This file consists of many different helper methods for other projects and
 * is about basic information to do with arrays
 * <p>
 * Advanced:  	2d matrix multiplcation
 *
 */

import java.util.Arrays;

//Sample Start File
public class ArrayReview {

    //#1
    /**
     * @param a
     * this should fill a given
     * array with random values from
     * 1 to 100
     */
    public static void fillRandom(int[] a) {
        int rand = 0;
        for (int x = 0;  x < a.length; x++)
        {
            rand = (int)((Math.random() * 100) + 1);
             a[x] = rand;
        }
    }

    //#2
    /**
     * @param arr
     * this method should fill the array
     * with each index having the value of
     * the given index
     */
    public static void fillInOrder(int [] arr)
    {
        for (int x = 0; x < arr.length; x++)
        {
            arr[x] = x;
        }
    }

    //#3
    /**
     * @param arr
     * @param x
     * this method should fill the array
     * with each index having the value of
     * the given index plus the value
     * of x
     */
    public static void fillInOrder(int [] arr, int x)
    {
        for (int a = 0; a < arr.length; a++)
        {
            arr[a] = a + x;
        }
    }


    //#4

    /**
     * @param arr
     *
     * this method should take an array
     * and turn it into a string with brackets
     * on either side seperated by a comma and a
     * space then return the value as a String
     * @return
     */
    public static String arrayToString(int [] arr)
    {
        String output = "[";

        for (int x = 0; x < arr.length - 1; x++)
        {
            output += arr[x] + ", ";
        }

        return output + arr[arr.length - 1] + "]";
    }

    //#5

    /**
     * @param arr
     * @return
     *
     * the method takes the sum of
     * all of the values in the array
     * and returns them
     *
     */
    public static int sumTotal(int [] arr)
    {
        int sum = 0;

        for (int x = 0; x < arr.length; x++)
        {
            sum += arr[x];
        }

        return sum;
    }


    //#6

    /**
     *
     * @param arr
     * @param target
     * @return
     *
     * find if target is equal to an
     * index of the array and if so
     * then return the value of target
     * otherwise return -1
     */
    public static int find(int [] arr, int target)
    {
        for (int x = 0; x < arr.length; x++)
        {
            if (arr[x] == target)
            {
                return target;
            }
        }
        return -1;
    }


    //#7
    /**
     *
     * @param arr
     * @return
     *
     * find the minimun value
     * in the array and return
     * it
     */
    public static int min(int [] arr)
    {
        int min = Integer.MAX_VALUE;

        for (int x = 0; x < arr.length; x++)
        {
            if (arr[x] < min)
            {
                min = arr[x];
            }
        }
        return min;
    }

    //#8
    /**
     *
     * @param arr
     * @return
     *
     * find the maximum value
     * in the array and return
     * it
     */
    public static int max(int [] arr)
    {
        int max = Integer.MIN_VALUE;

        for (int x = 0; x < arr.length; x++)
        {
            if (arr[x] > max)
            {
                max = arr[x];
            }
        }
        return max;
    }

    //#9

    /**
     * @param arr
     * @return
     *
     * create an integer that counts
     * the number of odd numbers and
     * returns them
     */
    public static int countOdds(int [] arr)
    {
        int numOdds = 0;

        for (int x = 0; x < arr.length; x++)
        {
            if (arr[x] % 2 != 0)
            {
                numOdds++;
            }
        }
        return numOdds;
    }

    //#10

    /**
     * @param arr
     *
     * this should take an array and
     * shift all of the values to the left
     * and put the first index at the end
     * of the array
     */
    public static void shift(int [] arr)
    {
        int storage = arr[0];

        for (int x = 0; x < arr.length - 1; x++)
        {
            arr[x] = arr[x + 1];
        }

        arr[arr.length - 1] = storage;
    }

    //#11
    /**
     * @param arr
     * @param n
     *
     * shift all of the indicies of the
     * array down n times
     */
    public static void shift(int [] arr, int n)
    {
        for (int x = 0; x < n; x++)
        {
            shift(arr);
        }
    }

//#12
    /**
     * @param arr
     * @return
     *
     * if the array is in an increasing
     * order then return true otherwise
     * return false
     */
    public static boolean isIncreasing(int [] arr)
    {
        for (int x = 0; x < arr.length - 1; x++)
        {
            if (!(arr[x] < arr[x + 1]))
            {
                return false;
            }
        }

        return true;
    }

    //#13
    /**
     * @param arr
     * @param x
     * @param y
     *
     * swap x and y in an array
     */
    public static void swap(int [] arr, int x, int y)
    {
        int storage = arr[x];
        arr[x] = arr[y];
        arr[y] = storage;
    }

    //#14
    /**
     * @param arr
     *
     * this method should put all of the
     * odd values to the left of the array
     * and put all of the even values on the
     * right of the array
     */
    public static void split(int [] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right)
        {
            if (arr[left] % 2 == 0 && arr[right] % 2 != 0)
            {
                swap(arr, left, right);
                left++;
                right--;
            }
            else if (arr[left] % 2 != 0)
            {
                left++;
            }
            else if (arr[right] % 2 == 0)
            {
                right--;
            }
        }
    }

    //#15

    /**
     * @param arr
     *
     * sort it so that the small
     * numbers are on the left and the
     * big numbers are on the right and
     * they are in asscending order
     */
    public static void sort(int [] arr)
    {
        while (!isIncreasing(arr))
        {
            for (int x = 0; x < arr.length - 1; x++) {
                if (arr[x] > arr[x + 1])
                {
                    swap(arr, x, x + 1);
                }
            }
        }
    }

    //#16
    /**
     * @param arr
     * @param num
     *
     * if the absulute value of an index
     * of an array is greater than num then
     * set its value to be 0
     */
    public static void filter(int [] arr, int num)
    {
        for (int x = 0; x < arr.length; x++)
        {
            if (Math.abs(arr[x]) > num)
            {
                arr[x] = 0;
            }
        }
    }

    //#17
    /**
     * @param arr
     * @param sub
     * @return
     *
     * if the second array is contained
     * inside of the first array return
     * the index of the start of the second
     * array in the first array otherwise
     * return -1
     */
    public static int match(int [] arr, int [] sub)
    {

        int count = 0;

        if (arr.length < sub.length)
        {
            return -1;
        }

        for (int x = 0; x < arr.length - sub.length; x++)
        {
            for (int y = 0; y < sub.length; y++)
            {
                if (arr[x + y] == sub[y])
                {
                    count++;
                }
                else {
                    count = 0;
                }


            }
            if ( count == sub.length)
            {
                return x;
            }
            count = 0;
        }

        return -1;
    }

    // int [][][] output = new int[3][3][3];
    // int [][][][] output2 = new int[3][3][3][3];
    //int [][][][][][][][][][] tenDemensionalArray = new int[3][3][3][3][3][3][3][3][3][3];

    //#18
    /**
     * @param a
     * @param b
     * @return
     *
     * this method should multiply two
     * matrices and return the output
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

    //#19
    /**
     * @param fiveArray
     *
     * this does not work the idea
     * was going to be to populate a 5d
     * array with and x, y, and a set of
     * rgb values and use that to draw colored
     * pixels but then I think i realized a
     * major flaw in my understanding of
     * post 3-dimensional arrays and it does
     * not work
     */
    public static void populate5d(int [][][][][] fiveArray)
    {

        for (int x1 = 0;  x1 < fiveArray.length; x1++) {
            for (int y1 = 0; y1 < fiveArray[0].length; y1++) {
                for (int r1 = 0; r1 < fiveArray[x1][y1].length; r1++) {
                    for (int g1 = 0; g1 < fiveArray[x1][y1][r1].length; g1++) {
                        for (int b1 = 0; b1 < fiveArray[x1][y1][r1][g1].length; b1++) {

                            int r = (int)((Math.random() * 255) + 1);
                            int g = (int)((Math.random() * 255) + 1);
                            int b = (int)((Math.random() * 255) + 1);

                            //does not do anything i want to but just populates it random i guess
                            fiveArray[x1][y1][r1][g1][b1] = r + g + b;

                        }
                    }
                }
            }
        }
    }





    public static void main(String[] args) {

        int[] arr = new int[10];

        //#1
        fillRandom(arr);
        System.out.println("Random values: " + Arrays.toString(arr));

        //#2
        fillInOrder(arr);
        System.out.println("Numbers in order: " + Arrays.toString(arr));

        //#3
        fillInOrder(arr, 1);
        System.out.println("Numbers in order starting from 1: " + Arrays.toString(arr));

        //#4
        System.out.println("Array as string: " + arrayToString(arr));

        //#5
        System.out.println("Total sum: " + sumTotal(arr));

        //#6
        System.out.println("Find 12 in array: " + find(arr, 12));

        //#7
        System.out.println("Minimum value: " + min(arr));

        //#8
        System.out.println("Maximum value: " + max(arr));

        //#9
        System.out.println("Odd numbers count: " + countOdds(arr));

        //#10
        shift(arr);
        System.out.println("Array after shift: " + arrayToString(arr));

        //#11
        shift(arr, 9);
        System.out.println("Array after shifting 9 times: " + arrayToString(arr));

        //#12
        System.out.println("Is array increasing? " + isIncreasing(arr));

        //#13
        swap(arr, 1, 2);
        System.out.println("Array after swapping index 1 and 2: " + arrayToString(arr));

        //#14
        split(arr);
        System.out.println("Array after splitting odds and evens: " + arrayToString(arr));

        //#15
        sort(arr);
        System.out.println("Sorted array: " + arrayToString(arr));

        //#17
        System.out.println("Match [0, 4] in array: " + match(arr, new int[] {0, 4}));
        System.out.println("Match [3, 4] in array: " + match(arr, new int[] {3, 4}));

        //#18
        aiGeneratedTestCases(); //for convenience because they would be a pain to write

//        int [][][][][] name = new int[2][2][2][2][2];
//        System.out.println(Arrays.deepToString(name));

    }

    public static void aiGeneratedTestCases()
    {
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

        int[][] expected1 = {
                {58, 64},
                {139, 154}
        };

        testMatrixMultiplication(a1, b1, expected1, "Test Case 1");

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

        int[][] expected2 = {
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13}
        };

        testMatrixMultiplication(a2, b2, expected2, "Test Case 2");

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

        int[][] expected3 = {
                {0, 0},
                {0, 0}
        };

        testMatrixMultiplication(a3, b3, expected3, "Test Case 3");

        // Test Case 4: Incompatible Matrix Dimensions
        int[][] a4 = {
                {1, 2},
                {3, 4}
        };

        int[][] b4 = {
                {5, 6}
        };

        testMatrixMultiplication(a4, b4, null, "Test Case 4");

        // Test Case 5: Square Matrices
        int[][] a5 = {
                {2, 4},
                {3, 4}
        };

        int[][] b5 = {
                {1, 2},
                {3, 4}
        };

        int[][] expected5 = {
                {14, 20},
                {15, 22}
        };

        testMatrixMultiplication(a5, b5, expected5, "Test Case 5");

        // Test Case 6: Single Row Matrix * Single Column Matrix
        int[][] a6 = {
                {1, 2, 3}
        };

        int[][] b6 = {
                {4},
                {5},
                {6}
        };

        int[][] expected6 = {
                {32}
        };

        testMatrixMultiplication(a6, b6, expected6, "Test Case 6");
    }

    public static void testMatrixMultiplication(int[][] a, int[][] b, int[][] expected, String testCaseName)
    {
        int[][] result = matrixMultiplcation(a, b);
        if (result == null && expected == null) {
            System.out.println(testCaseName + " passed: Matrices are incompatible.");
        } else if (result == null || expected == null) {
            System.out.println(testCaseName + " failed: Expected incompatible matrices.");
        } else {
            boolean isMatch = true;
            for (int i = 0; i < expected.length; i++) {
                for (int j = 0; j < expected[i].length; j++) {
                    if (result[i][j] != expected[i][j]) {
                        isMatch = false;
                        break;
                    }
                }
            }
            if (isMatch) {
                System.out.println(testCaseName + " passed.");
            } else {
                System.out.println(testCaseName + " failed: Incorrect result.");
            }
        }
    }
}
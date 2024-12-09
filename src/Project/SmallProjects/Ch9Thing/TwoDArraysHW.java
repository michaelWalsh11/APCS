package Project.SmallProjects.Ch9Thing;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  12/9/24
 * <p>
 * Assignment:   	TwoDArraysHW
 * <p>
 * Attribution: I worked with Max and Mathew Thornton
 * <p>
 * General Description:  Completes question 13 - 20 and tests them
 * <p>
 */

import java.util.Arrays;

public class TwoDArraysHW {

    /**
     * Outputs a given matrix to the screen in row-major order.
     * @param m
     */
    public static void printMatrix(int[][] m) {
        if (m==null)
            System.out.println("NULL");
        else
            for(int r=0; r<m.length; r++) {
                System.out.println(Arrays.toString(m[r])); //output a row
            }
    }

    /**
     * Outputs a given matrix to the screen in row-major order.
     * @param m
     */
    public static void printMatrix(char [][] m) {
        if (m==null)
            System.out.println("NULL");
        else
            for(int r=0; r<m.length; r++) {
                System.out.println(Arrays.toString(m[r])); //output a row
            }
    }

    /**
     * Outputs a given matrix to the screen in row-major order.
     * @param m
     */
    public static void printMatrix(String[][] m) {
        if (m==null)
            System.out.println("NULL");
        else
            for(int r=0; r<m.length; r++) {
                System.out.println(Arrays.toString(m[r])); //output a row
            }
    }

    /**
     * Outputs a given matrix to the screen in row-major order.
     * @param m
     */
    public static void printMatrix(double[][] m) {
        if (m==null)
            System.out.println("NULL");
        else
            for(int r=0; r<m.length; r++) {
                System.out.println(Arrays.toString(m[r])); //output a row
            }
    }

    /**
     * Outputs a given matrix to the screen in row-major order.
     * @param m
     */
    public static void printMatrix(boolean[][] m) {
        if (m==null)
            System.out.println("NULL");
        else
            for(int r=0; r<m.length; r++) {
                System.out.println(Arrays.toString(m[r])); //output a row
            }
    }


    /**
     * Outputs a given matrix to the screen in row-major order.
     * @param m
     */
    public static void fillMatrix(int [][] m)
    {
        for (int x = 0; x < m.length; x++)
        {
            for (int y = 0; y < m[0].length; y++)
            {
                m[x][y] = (int)((Math.random()* 1000) + 1);
            }
        }
    }

    /**
     * Outputs a given matrix to the screen in row-major order.
     * @param m
     */
    public static void fillMatrix(double [][] m)
    {
        for (int x = 0; x < m.length; x++)
        {
            for (int y = 0; y < m[0].length; y++)
            {
                m[x][y] = (Math.random()* 1000) + 1;
            }
        }
    }

    //#13

    /**
     * Tests if the part of an array is in one of the diagonals
     * @param i
     * @param j
     * @param length
     * @return
     */
    public static boolean isDiagonal(int i, int j, int length)
    {
        return i == j || i + j == length - 1;
    }



    //#14
    /**
     * Finds the maximum positive value in a 2D array of doubles.
     * If the largest value is negative, returns 0.
     * @param m
     * @return
     */
    public static double positiveMax(double [][] m)
    {
        double max = Integer.MIN_VALUE;
        for (int x = 0; x < m.length; x++)
        {
            for (int y = 0; y < m[0].length; y++)
            {
                if (m[x][y] > max)
                {
                    max = m[x][y];
                }
            }
        }
        if (max < 0)
        {
            return 0;
        }
        return max;
    }

    //#15
    /**
     * Fills a 2D char array with a checkerboard pattern, alternating 'x' and 'o'.
     * @param c
     */
    public static void fillCheckerBoard(char[][] c)
    {
        for (int x = 0; x < c.length; x++)
        {
            for (int y = 0; y < c[0].length; y++)
            {
                if (x % 2 == 0)
                {
                    if (y % 2 == 0)
                    {
                        c[x][y] = 'x';
                    }
                    else
                    {
                        c[x][y] = 'o';
                    }
                }
                else {
                    if (y % 2 == 0)
                    {
                        c[x][y] = 'o';
                    }
                    else
                    {
                        c[x][y] = 'x';
                    }
                }
            }
        }
    }

    //#16
    /**
     * Compares two 2D arrays and checks if more than half the elements in the first array
     * are greater than the corresponding elements in the second array.
     * @param m1
     * @param m2
     * @return
     */
    public static boolean covers(double [][] m1, double [][] m2)
    {
        int size = m1.length * m1[0].length;
        int count = 0;

        for (int x = 0; x < m1.length; x++)
        {
            for (int y = 0; y < m1[0].length; y++)
            {
                if (m1[x][y] > m2[x][y])
                {
                    count++;
                }
            }
        }
        return ((double) size / count >= 0.5);
    }

    //#17
    /**
     * Calculates the average value of an integer array.
     * @param nums
     * @return
     */
    public static double average(int[] nums)
    {
        int num = 0;

        for (int i : nums)
        {
            num += i;
        }

        return (double) num / nums.length;
    }


    //#18 For Loop HW Examples
    /**
     * Sums all the values in an integer array.
     * @param a
     * @return
     */
    public static int sumOfValues(int[] a)
    {
        int sum = 0;
        for (int nums : a)
        {
            sum += nums;
        }

        return sum;
    }

    /**
     * Calculates the sum of each row in a 2D array of integers.
     * @param table
     * @return
     */
    public static int[] sumsOfRows(int[][] table)
    {
        int [] sum = new int[table.length];
        int x = 0;
        for (int [] arr : table)
        {
             sum [x] = sumOfValues(arr);
             x++;
        }
        return sum;
    }

    //#19 Substrings Generator and Delayed Initialization
    /**
     * Generates all possible substrings of a given string.
     * @param word
     * @return
     */
    public static String[] allSubstrings(String word)
    {
        String [] arr = new String[(word.length() * (word.length() + 1)) / 2];
        int count = 0;
        for (int x = 0; x < word.length(); x++)
        {
            for (int y = 0; y < word.length() - x; y++)
            {
                arr[count] = word.substring(y, y + x + 1);
                count++;
            }
        }
        return arr;
    }


    /**
     * Generates all possible substrings for each word in an array of strings.
     * @param words
     * @return
     */
    public static String[][] allSubstrings2(String[] words)
    {
        String [][] name = new String[words.length][];

        for (int x = 0; x < name.length; x++)
        {
            name[x] = allSubstrings(words[x]);
        }
        return name;
    }


    //#20  Pascal's Triangle
    /**
     * Generates pascal's triangle up to and include row-n,
     * with row 0 representing the first row of the pattern.
     * @param n
     * @return
     */
    public static int[][] makePascalTriangle(int n)
    {
        if (n == 0)
        {
            return new int[][] {{1}};
        }

        int [][] pasc = new int[n + 1][];
        pasc [0] = new int[1];
        pasc [0][0] = 1;

        for (int x = 1; x <= n; x++)
        {
            pasc[x] = new int[x + 1];
            pasc[x][0] = 1;
            pasc[x][x] = 1;

            for (int y = 1; y < x; y++)
            {
                pasc[x][y] = pasc[x - 1][y - 1] + pasc[x - 1][y];
            }
        }

        return pasc;
    }

    public static void displayTriangle(int[][] t)
    {
        int n = t.length - 1;
        for (int r = 0; r <= n; r++)
        {
            for (int k = 0; k < n-r; k++)
                System.out.printf("  ");
            for (int c = 0; c <= r; c++)
                System.out.printf("%4d", t[r][c]);
            System.out.println();
        }
    }


    /**
     * @param args
     */
    public static void main(String[] args) {

        //make stuff to test
        int [][] thing1 = new int[10][10];
        int [][] thing2 = new int[10][10];
        double [][] thinger = new double [10][10];
        double [][] thingers = new double [10][10];
        char [][] ch = new char[10][10];

        int [] stuff = {100, 0, 50, 100, 0, 50, 11};

        // TODO
        //  selection sort
        //  insert sort
        //  partition

        //fill test matrices
        fillMatrix(thinger);
        fillMatrix(thing1);
        fillMatrix(thing2);

        //#13
        System.out.println(isDiagonal(1, 1, 1) + " " + isDiagonal(0, 1, 2));

        //#14
        System.out.println(positiveMax(thinger));

        //#15
        fillCheckerBoard(ch);
        printMatrix(ch);

        //#16
        System.out.println(covers(thinger, thingers));

        //#17
        System.out.println(average(stuff));

        //#18
        System.out.println(sumOfValues(thing1[0]));
        System.out.println(Arrays.toString(sumsOfRows(thing1)));


        //#19
        System.out.println(Arrays.toString(allSubstrings("Hello")));
        String [] he = {"Hello", "Hi", "Gutentaug"};
        String [][] nam = allSubstrings2(he);
        printMatrix(nam);


        //#20
        int[][] t0 = makePascalTriangle(0);
        displayTriangle(t0);
        System.out.println();

        int[][] t5 = makePascalTriangle(5);
        displayTriangle(t5);
        System.out.println();

        int[][] t12 = makePascalTriangle(12);
        displayTriangle(t12);
        System.out.println();
    }

}

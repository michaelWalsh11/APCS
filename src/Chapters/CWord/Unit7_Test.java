package Chapters.CWord;

import java.util.Scanner;

public class Unit7_Test {
    public static void amicable()
    {
        for (int x = 2; x < 1000; x++)
        {
            for (int y = x + 1; y - (1000 - x) < 1000; y++)
            {
                if (method(x) == y && method(y) == x)
                {
                    System.out.println("" + x + " and " + y + " are amicable");
                }
            }
        }
    }

    public static int getInput(Scanner scanner, int limit)
    {
        int x = 0;
        boolean isDone = false;
        do
        {
            System.out.println("Enter a positive Integer less than or equal to limit: ");
            x = scanner.nextInt();

            if (x <= limit && x > 0)
            {
                isDone = true;
            }
        } while (!isDone);

        return x;
    }

    public static void smallest()
    {
        boolean isDone = false;
        int k = 1;
        while (!isDone)
        {
            if ((int)(k * 0.01 * 100.0) != k)
            {
                isDone = true;
                System.out.println("the smallest number is " + k);
            }

            k++;
        }
    }

    public static int method(int n)
    {
        int num = 0;
        for (int x = 1; x < n; x++)
        {
            if (n % x == 0)
            {
                num += x;
            }
        }
        return num;
    }


    public static double sumMultiplePowerstest(double x, int n)
    {
        double sum = 0;
        double storage = 1;
        int exponent = 0;

        for (int k = 1; k <= n; k++)
        {
            sum += k * (Math.pow(x, k));
        }

        return sum;
    }



    public static double sumMultiplePowers(double x, int n)
    {
        double sum = 0;
        double storage = 1;

        for (int k = 1; k <= n; k++)
        {
            storage = storage * x;
            sum += storage * k;
        }

        return sum;
    }

    public static int savings()
    {
        double money = 1000;
        int years = 0;

        while (money < 3000)
        {
            money += ((money / 100) * 5);
            System.out.println(money);
            years++;
        }


        return years;
    }
}

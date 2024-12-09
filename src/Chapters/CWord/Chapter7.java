package Chapters.CWord;

import java.util.Scanner;

public class Chapter7 {

    public static void idk()
    {
        Scanner scanner = new Scanner(System.in);
        boolean stillTalking = true;

        while (stillTalking)
        {
            System.out.println("Enter Quantity: ");
            int number = scanner.nextInt();

            // Consume the leftover newline
            scanner.nextLine();

            int price = number * 26;

            if (number % 25 == 0)
            {
                System.out.println("You have ordered " + number + " ripples -- $" + price / 100 + "." + price % 100);
            }
            else
            {
                System.out.println("Only packs of 25.");
            }

            boolean makesSense = false;
            while (!makesSense)
            {
                System.out.println("Next customer (y/n): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("y"))
                {
                    makesSense = true;
                }
                else if (response.equalsIgnoreCase("n"))
                {
                    stillTalking = false;
                    makesSense = true;
                }
            }
        }

        scanner.close();
    }



    public static void checker(int num)
    {
        for (int x = 0; x < num; x++)
        {
            for (int y = 0; y < num; y++)
            {
                if ((y + x) % 2 == 0)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print("o");
                }
            }
            System.out.println("");
        }
    }

    public static int num7and9BoolStyle(int countTo)
    {
        boolean checker1;
        boolean checker2;
        int amt = 0;
        int storage;
        for (int x = 0; x < countTo; x++)
        {
            int num = 0;
            storage = x;
            checker1 = false;
            checker2 = false;
            while (storage > 0)
            {
                num = storage % 10;

                if (num == 7 && !checker1)
                {
                    checker1 = true;
                }
                if (num == 9 && !checker2)
                {
                    checker2 = true;
                }
                if (checker1 && checker2)
                {
                    amt++;
                }

                storage /= 10;
            }
        }
        return amt;
    }


    public static int num7and9(int countTo)
    {
        boolean checker = false;
        int amt = 0;
        int storage = 0;
        int str2;
        for (int x = 0; x < countTo; x++)
        {
            int num = 0;
            storage = x;
            checker = false;
            str2 = 0;
            while (storage > 0)
            {
                num = storage % 10;

                if (num == 7 && str2 != 7 && str2 != 16)
                {
                    str2 += 7;
                }
                if (num == 9 && str2 != 9 && str2 != 16)
                {
                    str2 += 9;
                }
                if (str2 == 16 && !checker)
                {
                    checker = true;
                    amt++;
                }
                storage /= 10;
            }
        }
        return amt;
    }

    public static double manualDiv(int a, int b)
    {
        System.out.println(a / b);
        double num = a;
        double quot = 0;

        int amt = 0;

        while (a >= b)
        {
            b += b;
            amt++;
        }
        return amt;
    }


    public static double goldenRatio(int n)
    {
        double x = 1.0;
        for (int i = 0; i <= n; i++)
        {
            x = 1 +  1 / x;
        }

        return x;
    }


    public static double sqrtEst(double a) {
        double x = a / 2;
        double diff;

        do
        {
            diff = Math.abs(x * x - a);
            x = (double) 1/2 * (x + a / x);
        }
        while (diff >= 0.01);

        return x;
    }

    public static int sum(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static double forn(int n)
    {
        double sum = 0;
        int x = 1;

        while (x < n)
        {
            sum += 1.0 /(x * x);
            x++;
        }

        return sum;
    }

    public static int product (int a, int b)
    {
        int sum = 0;
        for (int x = 0; x < a; x++)
        {
            sum += b;
        }
        return sum;
    }

    public static void bigFella(int n, String txt)
    {
        for (int x = 0; x < n; x++)
        {
            System.out.println(txt);
        }
    }

    public static String [] kevin()
    {
        double knowledge = 0;
        int months = 0;

        while (knowledge <= 95.0)
        {
            knowledge += (100.0 - knowledge) / 10.0;
            months++;
        }

        int years = months / 12;
        months = months % 12;

        String [] output = {"years: " + years, "Months: " + months};

        return output;
    }


    public static double fornt(int n)
    {
        double sum = 0;
        int x = 1;

        while (x < n) {
            if (x % 2 == 0)
            {
                sum -= 1.0 / x;
            }
            else
            {
                sum += 1.0 / x;
            }
            x++;
        }

        return sum;
    }
}

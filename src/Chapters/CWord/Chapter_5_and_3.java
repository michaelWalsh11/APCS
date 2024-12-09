package Chapters.CWord;

public class Chapter_5_and_3
{
    public Chapter_5_and_3()
    {

    }


    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double max3(double x, double y, double z)
    {
        double maxOf3 =  Math.max(Math.max(x, y), z);
        return maxOf3;
    }

    private static int convertToHumanAge(int dogYears)
    {
        return 13 + (int)(16.0 / 3.0 * (dogYears - 1) + 0.5);
    }

    public static double calculateBmi(int lbs, int inches)
    {
        double kilograms = lbs * .454;
        double meters = inches * .0254;

        return kilograms / (meters * meters);
    }

    public static int fifteen(int n)
    {
        if (n < 10)
        {
            return n * 10;
        }
        else
        {
            int one = n % 10;
            int ten = (n % 100 - one) / 10;
            int restOfNumber = n / 100 * 100;

            return restOfNumber + ((one * 10) + ten);
        }
    }


    public static double whatIsThis(int a, int b, int c)
    {
        double desc = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        double x1 = (-b + desc) / (2 * a);
        double x2 = (-b - desc) / (2 * a);

        System.out.println("Root 1: " + x1);
        System.out.println("Root 2: " + x2);

        return 0.0;
    }

    public static double feetToInches(int feet, int inches)
    {
        return inches + (feet * 12);
    }

    public static double negRound(double num)
    {
        return (int) (num - 0.5);
    }


    public static double calculation(int a, int b, int c, int d)
    {
        int output =  a % (b * (c + d));
        return output;
    }

    public static double calculation2(int a, int b, int c, int d)
    {
        return a * b + (c / d);
    }

    public static double intandDouble1()
    {
        int a = 10;
        int b = 20;
        int c = 30;
        double ad = 4.7;
        double bd = 8.12;

        return (a / b) + c + (ad * bd);
    }

    public static double intandDouble2()
    {
        int a = 18;
        int b = 21890;
        int c = 894;
        double ad = 982.47;
        double bd = 8.1212;

        return a % ((a * b * c) - (ad * bd));
    }

    public static int random(int low, int high)
    {
        int random = (int)(Math.random() * (high - low + 1)) + low;

        return random;
    }

    //im dumb and did this too
    public static void onesTensHundred(int num)
    {
        String one = String.valueOf(num);
        int onesDigit = Integer.valueOf(one.substring(one.length() - 1, one.length()));
        int tensDigit = Integer.valueOf(one.substring(one.length() - 2, one.length() - 1));
        int hundredsDigit = Integer.valueOf(one.substring(one.length() - 3, one.length() - 2));

        System.out.println("Ones = " + onesDigit + " Tens = " + tensDigit + " Hundreds = " + hundredsDigit);

    }

    public static void onesTensHundreds2(int n)
    {
        int ones = n % 10;
        int tens =(n % 100 - ones) / 10;
        int hundreds =(( n % 1000 - tens) - ones) / 100;
        int thousands = (n % 10000 - hundreds - tens - ones) / 1000;

        int output = (thousands * 10) + hundreds;
        System.out.println(ones + "    " + tens + "    " + hundreds + "    " + thousands + "    ");
        System.out.println(output);
    }

}

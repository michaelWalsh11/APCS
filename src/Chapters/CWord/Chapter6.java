package Chapters.CWord;

public class Chapter6
{

    public static boolean isTrue()
    {
        int a = (int) (Math.random() * (100 + 1));
        int b = (int) (Math.random() * (100 + 1));
        int c = (int) (Math.random() * (100 + 1));

        if (a == 0 || b == 0 || c == 0)
        {
            return false;
        }
        else if (a * c == b * b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isLeapYear(int year)
    {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
    {
        if (year1 > year2)
        {
            return true;
        }
        else if (year1 == year2 && month1 > month2)
        {
            return true;
        }
        else if (year1 == year2 && month1 == month2 && day1 > day2)
        {
            return true;
        }
        else {
            return false;
        }

    }

    public static char grade(int avg)
    {
        if (avg < 60)
        {
            return 'F';
        }
        else if (avg < 70)
        {
            return 'D';
        }
        else if (avg < 80)
        {
            return 'C';
        }
        else if (avg < 90)
        {
            return 'B';
        }
        else
        {
            return 'A';
        }
    }
}

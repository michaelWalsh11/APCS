/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  10/23/24
 * <p>
 * Assignment:   	Ch7 written test
 * <p>
 * Attribution: Notes and slide show
 * <p>
 * General Description:   I made I file that has many diffent methods that can be called in order to do the various questions.
 * <p>
 * Advanced:  	Nothing really I just did the questions
 *
 */

import java.util.Scanner;

public class APCS
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

    }

    public int countYZ(String str) {

        String [] hello = str.split(str);
        int count = 0;


        for (int x = 0; x < str.length() - 1; x++)
        {

            String lastLetter = str.substring(hello[x].length() - 1);
            if ((lastLetter.equals("y") || (lastLetter.equals("z"))) && Character.isAlphabetic(x + 1))
            {
                count++;
            }
        }

        return count;
    }
}
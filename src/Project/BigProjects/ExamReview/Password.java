package Project.BigProjects.ExamReview;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  12/18/24
 * <p>
 * Assignment:   	Exam Corrections problem
 * <p>
 * Attribution: The corrections sheet on OneNote and my test
 * <p>
 * General Description:   using the template I was given I write the methods to complete
 * the given project
 * <p>
 */

public class Password {


    /**
     * Returns true if password contains an uppercase letter;
     *  otherwise returns false.
     * @param password
     **/
    private static boolean hasUpper(String password)
    {
        for (int x = 0; x < password.length(); x++)
        {
            if (Character.isUpperCase(password.charAt(x)))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns true if password contains an lowercase letter;
     *  otherwise returns false.
     * @param password
     **/
    private static boolean hasLower(String password)
    {
        for (int x = 0; x < password.length(); x++)
        {
            if (Character.isLowerCase(password.charAt(x)))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns true if password contains a digit;
     *  otherwise returns false.
     * @param password
     **/
    private static boolean hasDigit(String password)
    {
        for (int x = 0; x < password.length(); x++)
        {
            if (Character.isDigit(password.charAt(x)))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Passwords should be 8 to 16 characters long and
     * include an uppercase letter, a lowercase letter, and
     * a digit.
     * Returns true if password is considered valid,
     *  as described above;  otherwise returns false.
     *  PRE: password is not null
     * @param password
     **/
    public static boolean isValid(String password)
    {
        return password.length() > 7 && password.length() < 17 && hasUpper(password)
                && hasLower(password) && hasDigit(password);
    }

    /**
     * Returns a String made up of the first letters of the words
     * in phrase.  (Builds an acronym.)
     * @param phrase
     * @return
     */
    public static String makePasswordLetters(String phrase)
    {
        String output = phrase.substring(0, 1);
        for (int x = 1; x < phrase.length(); x++)
        {
            if (phrase.charAt(x - 1) == ' ')
            {
                output += phrase.charAt(x);
            }
        }
        return output;
    }

    /**
     * Generates a password from phrase and n, as described in
     * part (c).  Takes a string generated from the first letters
     * of the words in phrase and appends to it the digits of n
     * taken in reverse order.
     * @param phrase
     * @param n
     * @return a valid password, or null, if one cannot be generated
     * with the inputs
     */
    public static String makePassword(String phrase, int n)
    {
        String password = makePasswordLetters(phrase) + n;
        if (isValid(password))
        {
            return password;
        }
        return null;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(makePassword("Then took the other, as just as fair", 1915));
        System.out.println(makePassword("I was tired", 1));
        System.out.println(makePassword("My Name Is Michael And This Is valid?", 71));

    }

}

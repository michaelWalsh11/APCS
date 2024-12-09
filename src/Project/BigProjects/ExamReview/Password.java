package Project.BigProjects.ExamReview;

public class Password {


    /**
     * Returns true if password contains an uppercase letter;
     *  otherwise returns false.
     * @param password
     **/
    private static boolean hasUpper(String password)
    {
        return Character.isUpperCase(password.charAt(0));
    }

    /**
     * Returns true if password contains an lowercase letter;
     *  otherwise returns false.
     * @param password
     **/
    private static boolean hasLower(String password)
    {
        return Character.isLowerCase(password.charAt(0));
    }

    /**
     * Returns true if password contains a digit;
     *  otherwise returns false.
     * @param password
     **/
    private static boolean hasDigit(String password)
    {
        return Character.isDigit(password.charAt(0));
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
        //implemented as part (a)
        return false;
    }

    /**
     * Returns a String made up of the first letters of the words
     * in phrase.  (Builds an acronym.)
     * @param phrase
     * @return
     */
    public static String makePasswordLetters(String phrase)
    {
        //must be implemented as part (b)
        return null;
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
        //implemented as part (c)
        return null;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(makePassword("Then took the other, as just as fair", 1915));

    }

}

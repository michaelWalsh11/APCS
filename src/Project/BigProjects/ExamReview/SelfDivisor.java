package Project.BigProjects.ExamReview;

public class SelfDivisor {

    /**
     *
     * @param number - the value to be tested
     * @return true if every decimal digit of number is a divisor of number; false otherwise.
     */
    public static boolean isSelfDivisor(int number)
    {
        for (int x = 0; x < String.valueOf(number).length(); x++)
        {
            int nums = 0;
            String storage = String.valueOf(number);
            nums = Integer.parseInt(storage.substring(x, x + 1));

            if (nums == 0 || number % nums != 0)
            {
                return false;
            }
        }
        return true;
    }


    /**
     *
     * @param start - starting point for values to be checked
     * @param num - the number of selfDivisors to find.
     * @return a String containing the first num integers>= start that
     * 	are self-divisors.  The format should be "[div1, div2, ..., divN]"
     */
    public static String firstNumSelfDivisors(int start, int num)
    {
        String output = "[";
        int numInOp = 0;
        while (numInOp < num)
        {
            if (isSelfDivisor(start))
            {
                if (output.length() == 1)
                {
                    output += start;
                }
                else {
                    output += ", " + start;
                }
                numInOp++;
            }
            start++;
        }
        return output + "]";
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(firstNumSelfDivisors(10,3));

        //Create a few more test statements.

    }

}

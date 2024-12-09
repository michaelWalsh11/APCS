package Project.BigProjects.ExamReview;

public class WordGuess
{
    private static final String hiddenWord = "HARPS";

    public static void main(String[] args)
    {
        System.out.println(getHint("AAAAA"));
        System.out.println(getHint("HELLO"));
        System.out.println(getHint("HEART"));
        System.out.println(getHint("HARMS"));
        System.out.println(getHint("HARPS"));
    }

    /**
     * @param guess this is the 'players' guess
     * @return return the string that has the letter
     *      if the letter matches in the index of hiddenWord
     *      if it is not in the word at all then put a "*" in
     *      the place of it and if it is in the word but a different
     *      location put a "+" in its place
     */
    public static String getHint(String guess)
    {
        String output = "";

        for (int x = 0; x < hiddenWord.length(); x++)
        {
            if (hiddenWord.substring(x, x + 1).equals(guess.substring(x, x + 1)))
            {
                output += hiddenWord.substring(x, x + 1);
            }
            else
            {
                boolean found = false;
                for (int y = 0; y < hiddenWord.length(); y++)
                {
                    if (hiddenWord.substring(y, y + 1).equals(guess.substring(x, x + 1)) && !found)
                    {
                        output += "+";
                        found = true;
                    }
                }
                if (!found)
                {
                    output += "*";
                }
            }
        }
        return output;
    }
}

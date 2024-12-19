package Project.BigProjects.ExamReview;
/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  12/18/24
 * <p>
 * Assignment:   	Exam Corrections problem
 * <p>
 * Attribution: My brain
 * <p>
 * General Description:   using the template I was given I write the methods to complete
 * the given project
 * <p>
 */
public class WordMatch {

    private String secret;

    public WordMatch(String word)
    {
        secret = word;
    }

    /**
     * Returns a score for guess as described
     * in part (a)
     * Pre: 0<guess.length() <=secret.length()
     * @param guess
     * @return
     */
    public int scoreGuess(String guess)
    {
        String temp = secret;
        int score = 0;
        while (temp.contains(guess))
        {
            score++;
            temp = temp.substring(temp.indexOf(guess) + 1);
        }
        return (int) (score * (Math.pow(guess.length(), 2)));
    }


    /**
     *  determines the better of two guesses
     * @param guess1 the first guess
     * @param guess2 the second guess
     * @return the better guess
     */
    public String findBetterGuess(String guess1, String guess2)
    {
        if (scoreGuess(guess1) > scoreGuess(guess2))
            return guess1;
        return guess2;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // Construct an object with secret words.
        WordMatch wm1 = new WordMatch("mississippi");
        WordMatch wm2 = new WordMatch("aaaabb");
        WordMatch wm3 = new WordMatch("concatenation");

        System.out.println("score of 'i' : " + wm1.scoreGuess("i"));
        System.out.println("Best guess is: " + wm3.findBetterGuess("ten","nation"));
        System.out.println("Best guess is: " + wm2.findBetterGuess("a", "aa"));
    }

}
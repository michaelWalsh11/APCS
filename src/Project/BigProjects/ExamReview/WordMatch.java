package Project.BigProjects.ExamReview;

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
        //code here
        return 0;
    }

    public String findBetterGuess(String guess1, String guess2)
    {
        //code here
        return "";
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // Construct an object with secret words.
        WordMatch wm1 = new WordMatch("mississippi");
        WordMatch wm2 = new WordMatch("aaaabb");
        WordMatch wm3 = new WordMatch("concatenation");

        // Call methods.
        System.out.println("score of 'i' : " + wm1.scoreGuess("i"));
        //test other guess in problem
        System.out.println("Best guess is: " + wm3.findBetterGuess("ten","nation"));
    }

}

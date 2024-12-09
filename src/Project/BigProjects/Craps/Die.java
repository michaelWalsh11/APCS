package Project.BigProjects.Craps;

public class Die {

    public int total = 0;

    public Die()
    {
        total = 0;
    }

    public void roll()
    {
        total = (int) (Math.random() * 6 - 1 + 1) + 1;
    }
    public int getNumDots()
    {
        return total;
    }
}

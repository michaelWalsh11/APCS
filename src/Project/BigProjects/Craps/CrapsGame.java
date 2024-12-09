package Project.BigProjects.Craps;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  9/18/2024
 * Assignment:  CrapsGame
 * <p>
 * Attribution: We worked on this together in class
 * <p>
 * General Description: This file performs the background logic for a game of craps
 * <p>
 * Advanced: I completed this assignment
 */

public class CrapsGame
{
  private int point = 0;
  private boolean hasBeenCalled = false;

  public int processRoll(int total)
  {
    if (!hasBeenCalled)
    {
      return firstTurn(total);
    }
    else
    {
      return notFirstTurn(total);
    }
  }

  public int firstTurn(int total)
  {
    if (total == 2 || total == 3 || total == 12)
    {
      return -1;
    }
    else if (total == 7 || total == 11)
    {
      return 1;
    }
    else
    {
      hasBeenCalled = true;
      point = total;
      return 0;
    }
  }

  public int notFirstTurn(int total)
  {
    if (total == point)
    {
      hasBeenCalled = false;
      return 1;
    }
    if (total == 7)
    {
      hasBeenCalled = false;
      return -1;
    }
    else
    {
      return 0;
    }
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}


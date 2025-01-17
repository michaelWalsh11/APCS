/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  9/20/2024
 * Assignment:   	take 1-3 game
 * <p>
 * Attribution: I read the instuctions and wrote the corresponding code
 * <p>
 * General Description:   You can play the game according to the rules given to us
 * <p>
 */

package Project.SmallProjects.RPS;// Chapter 6 Question 21

import java.util.Scanner;

public class Take1_3
{
  private static Scanner kboard;

  private int stonesLeft;

  public Take1_3(int n)
  {
    stonesLeft = n;
  }

  /*
   * Returns the correct number of stones to take
   * (according to the winning strategy) when nStones
   * remain in the pile; if such a move is not possible,
   * returns a random number of stones to take.
   * Precondition: nStones > 0
   */
  public int computerMove(int nStones)
  {
    if (nStones <= 3) {
      return nStones;
    }
    else
    {
      return (int) ((Math.random() * 3 - 1 + 1) + 1);
    }
  }

  /*
   * Prompts the user to take a number of stones;
   * If the move is valid, returns the number of stones
   * taken; otherwise, displays an error message --
   * "You are allowed to only take 1, 2, or 3 stones" or
   * "Can't take that many: only <nStones> left in the pile"
   * -- and returns -1:
   * Precondition: nStones > 0
   */
  public int humanMove(int nStones)
  {
    System.out.print("How many stones do you take? ");
    int n = kboard.nextInt();

    if ((n == 1 || n == 2 || n == 3) && nStones >= n)
    {
      return n;
    }
    else if (n > 3)
    {
        System.out.println("You are allowed to only take 1, 2, or 3 stones");
        return -1;
    }
    else if (nStones < n)
    {
      System.out.println("Can't take that many: only" + nStones + "left in the pile");
      return -1;
    }
    return -1;
  }

  /**
   * Plays the game
   */
  public void play()
  {
    while (stonesLeft > 0)
    {
      System.out.println(stonesLeft + " stone(s) left in the pile");

      int n = -1;
      while (n < 0)
        n = humanMove(stonesLeft);
      stonesLeft -= n;
      System.out.println("You took " + n + " stone(s)");
      if (stonesLeft == 0)
      {
        System.out.println("Congrats -- you won!");
      }
      else
      {
        n = computerMove(stonesLeft);
        stonesLeft -= n;
        System.out.println("I take " + n + " stone(s)");
        if (stonesLeft == 0)
          System.out.println("Hooray -- I won!");
      }
    }
  }

  /****************************************************************/

  public static void main(String[] args)
  {
    kboard = new Scanner(System.in);

    int n = 8 + (int)(4 * Math.random());
    Take1_3 game = new Take1_3(n);
    game.play();

    kboard.close();
  }
}

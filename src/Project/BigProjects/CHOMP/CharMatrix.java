package Project.BigProjects.CHOMP;
/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  12/2/24
 * <p>
 * Assignment:   	Chomp Game
 * <p>
 * Attribution: We worked together in class for part of this and the rest was done alone.
 * <p>
 * General Description:  All the 2d char matrix manipulation required for the chomp game.
 * <p>
 */
public class CharMatrix
{
  // Fields:
  private char [][] grid;

  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
    grid = new char[rows][cols];
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
    grid = new char[rows][cols];

    for (int x = 0; x < grid.length; x++)
    {
      for (int y = 0; y < grid[0].length; y++)
      {
        grid[x][y] = fill;
      }
    }
  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {

    return grid.length;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {

    return grid[0].length;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {

    return grid[row][col];
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
    grid[row][col] = ch;
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
    return grid[row][col] == ' ';
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for (int x = row0; x <= row1; x++)
    {
      for (int y = col0; y <= col1; y++)
      {
        grid[x][y] = fill;
      }
    }
  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    fillRect(row0, col0, row1, col1, ' ');
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
    int count = 0;
    for (char ch : grid[row])
    {
      if (ch != ' ')
      {
        count++;
      }
    }
    return count;
  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
    int count = 0;
    for (char ch : grid[col])
    {
      if (ch != ' ')
      {
        count++;
      }
    }
    return count;
  }
}

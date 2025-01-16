package Project.SmallProjects.TestTakeHome;

import java.util.Arrays;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  1/15/24
 * <p>
 * Assignment:   	TakeHomeTest
 * <p>
 * Attribution: My pure genius and the question sheet
 * <p>
 * General Description:  I filled out the class layout provided and filled in the methods along with testing them.
 * <p>
 * Advanced:  I completed all of them and tested them.
 *
 */
public class SudokuGrid {

	private int[][] grid;
	private final int EMPTY = 0;
	
	public SudokuGrid()
	{
		grid = new int[9][9];
	}
	
	//parts e-i

	/**
	 * gets a specified cell
	 * @param row row of cell
	 * @param col col of cell
	 * @return value of cell at points
	 */
	public int getCell(int row, int col)
	{
		return grid[row][col];
	}

	/**
	 * tests if there is a conflict for the number in the column at the point
	 * @param col col to check
	 * @param value value to check for conflicts
	 * @return returns true or false based on check
	 */
	public boolean isOkColumn(int col, int value)
	{
		for (int y = 0; y < grid[0].length; y++)
		{
			if (grid[col][y] == value)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * tests if there is a conflict for the number in the row at the point
	 * @param row row to check
	 * @param value value to check for conflicts
	 * @return returns true or false based on check
	 */
	public boolean isOkRow(int row, int value)
	{
		for (int x = 0; x < grid.length; x++)
		{
			if (grid[x][row] == value)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * checks the 3x3 box starting in the top left corner and scanning for conflicts
	 * @param row row of the box to check
	 * @param col col of the box to check
	 * @param value value of the box to check
	 * @return true or false based on check
	 */
	public boolean isOkSector(int row, int col, int value)
	{
		int topLeftRow = row - (row % 3);
		int topLeftCol = col - (col % 3);

		for (int x = topLeftRow; x < topLeftRow + 3; x++)
		{
			for (int y = topLeftCol; y < topLeftCol + 3; y++)
			{
				if (grid[x][y] == value)
				{
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * checks if the value of the cell will be legal and if so sets the value
	 * @param row row to set value
	 * @param col col to set value
	 * @param value value to set
	 */
	public void setCell(int row, int col, int value)
	{
		if (isOkColumn(col, value) && isOkRow(row, value) && isOkSector(row, col, value))
			grid[row][col] = value;
	}
	
	public void printGridToConsole()
	{
		if (grid==null)
			System.out.println("NULL");
		else
			for(int r=0; r<grid.length; r++) {
				System.out.println(Arrays.toString(grid[r])); //output a row
			}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SudokuGrid sudoku = new SudokuGrid();

		sudoku.printGridToConsole();

		System.out.println();

		//random numbers to test
		sudoku.setCell(0, 0, 5);
		sudoku.setCell(0, 1, 3);
		sudoku.setCell(1, 0, 6);
		sudoku.setCell(4, 4, 7);
		sudoku.setCell(8, 8, 9);

		//cant be uses because of conflicts
		sudoku.setCell(0, 1, 5);
		sudoku.setCell(1, 0, 5);
		sudoku.setCell(1, 1, 5);

		sudoku.printGridToConsole();

	}

}

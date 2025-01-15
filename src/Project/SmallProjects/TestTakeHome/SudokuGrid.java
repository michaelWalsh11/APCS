package Project.SmallProjects.TestTakeHome;

import java.util.Arrays;

/**
 * You should use this file to complete your Sudoku problem
 * as many of its components are related to Class Design.
 * Your task is to implement the required components of
 * maintaining and using information about the given "board".
 * You may find looking at the GameOfLife and Chomp to
 * be useful contexts for this work.
 * 
 * You are welcome to implement some testing device, if
 * you wish.
 */
/**
 * @author yoderr
 *	Note:  It will require some ingenuity and exploration on your part to actually "test" 
 *	this particular exercise because none of these methods are declared as static and
 *	we have not reinforced class design and class testing yet. (That is Ch10.)
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
	public int getCell(int row, int col)
	{
		return grid[row][col];
	}
	
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

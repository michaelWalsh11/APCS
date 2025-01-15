package Project.BigProjects.GameOfLife;

import java.awt.print.Printable;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  12/19/2024
 * <p>
 * Assignment:   	Conway's Game of Life
 * <p>
 * Attribution: Stuff from class
 * <p>
 * General Description:   This class does all the backend stuff and evolution for the game of life
 * <p>
 * Advanced:  	I added a way to check if a specific block has ever been alive or if it has always been dead
 *  I also made it so that the screen loops around.
 *
 */


public class LifeGrid
{

    private int [][] cells;
    private int [][] visitedCells;

    public LifeGrid(int width, int height)
    {
        cells = new int[width][height];
        visitedCells = new int[width][height];
    }

    /**
     *  Retrieves the value of a cell
     * @param x the x coordinate of the cell that the value is being retrieved from
     * @param y the y coordinate of the cell that the value is being retrieved from
     */
    public int getCell(int x, int y)
    {
        return cells[x][y];
    }

    /**
     *  Sets a cells coordinates to a specified value
     * @param x the x coordinate of the cell that is being changed
     * @param y the y coordinate of the cell that is being changed
     * @param z the value of the cell
     */
    public void setCell(int x, int y, int z)
    {
        cells[x][y] = z;
    }

    /**
     * Makes the next from of the game according to rules
     * It also uses a second 2d array to determine if it has ever
     * been occupied
     * <p>
     * (the rules are AI generated because I didn't want to write
     * them and I wanted to be able to see them)
     * The evolution is based on the following rules:
     * <ul>
     *   <li>Any live cell with fewer than two live neighbors dies, as if by underpopulation.</li>
     *   <li>Any live cell with two or three live neighbors survives to the next generation.</li>
     *   <li>Any live cell with more than three live neighbors dies, as if by overpopulation.</li>
     *   <li>Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.</li>
     * </ul>
     * After applying these rules to all cells in the grid,
     * the state is updated to reflect the next generation.
     */
    public void evolveOriginal() {
        int [][] temp = new int[cells.length][cells[0].length];

        for (int x = 0; x < temp.length; x++)
        {
            for (int y = 0; y < temp[0].length; y++) {
                int neighbors = getNumNeighbors(x, y);

                if (neighbors < 2 || neighbors > 3) {
                    temp[x][y] = 0;
                }
                else if (neighbors == 3 && cells[x][y] == 0) {
                    temp[x][y] = 1;
                    visitedCells[x][y]++;
                }
                else if (cells[x][y] == 1) {
                    temp[x][y] = 1;
                    visitedCells[x][y]++;
                }
            }
        }
        cells = temp;

    }


    /**
     * this method looks at a specific point of the array and find
     * its number of neighbors
     * @param x the x coordinate that it looks at
     * @param y the y coordinate that it looks at
     * @return returns the number of neighbors
     */
    public int getNumNeighborsOriginal(int x, int y)
    {
        int num = 0;
        for (int n = -1; n < 2; n++)
        {
            for (int m = -1; m < 2; m++)
            {

                int nx = (x + n + cells.length) % cells.length;
                int ny = (y + m + cells[0].length) % cells[0].length;

                if ((n != 0 || m != 0) && cells[nx][ny] != 0) {
                    num++;
                }
            }
        }
        return num;
    }



    //second method:
    /**
     * We changed evolve so that it uses while loops
     * we also made the logic in two distinct steps
     * where you decide if it is alive or dead and go
     * after that as opposed to one larger step
     */
    public void evolve() {
        int [][] temp = new int[cells.length][cells[0].length];

        int x = 0;

        while (x < temp.length) {
            int y = 0;
            while (y < temp[0].length) {

                int neighbors = getNumNeighbors(x, y);

                if (cells[x][y] == 1) {
                    if (neighbors == 2 || neighbors == 3)
                    {
                        temp[x][y] = 1;

                    }
                    else {
                        temp[x][y] = 0;
                    }
                }
                else {
                    if (neighbors == 3)
                    {
                        temp[x][y] = 1;

                    }
                    else {
                        temp[x][y] = 0;
                    }
                }
                y++;
            }
            x++;
        }
        cells = temp;

    }


    /**
     * we changed it so that it does not use loops but can
     * still wrap around properly combining all of our code
     * @param x the x coordinate that it looks at
     * @param y the y coordinate that it looks at
     * @return returns the number of neighbors
     */
    public int getNumNeighbors(int x, int y)
    {
        int count = 0;
        int left = (x - 1 + cells.length) % cells.length;
        int right = (x + 1 + cells.length) % cells.length;
        int above = (y + 1 + cells.length) % cells.length;
        int below = (y - 1 + cells.length) % cells.length;
        if(cells[left][above] == 1)
            count++;
        if(cells[left][y] == 1)
            count++;
        if(cells[left][below] == 1)
            count++;
        if(cells[right][above] == 1)
            count++;
        if(cells[right][y] == 1)
            count++;
        if(cells[right][below] == 1)
            count++;
        if(cells[x][above] == 1)
            count++;
        if(cells[x][below] == 1)
            count++;
        return count;
    }


    //second method:
    /**
     *  1) We moved the initialization of y outside the first loop
     *  2) In the outer while loop we changed it from greater than to less than
     *  3) In the inner while loop we changed it from greater than to less than
     *  4) on the line that is supposed to say cells = temp we inverted it, so it never actually updates
     *  5) In the second if statement we messed with DeMorgan's Law
     *  6) We did not put the y++ so it will not loop
     *  7) swapped x and y in the calling of a part of temp
     *  8) added a return statement to a void method
     */
    public void evolveBroken() {
        int [][] temp = new int[cells.length][cells[0].length];

        int x = 0;
        int y = 0;

        while (x > temp.length) {
            while (y > temp[0].length) {

                double neighbors = getNumNeighbors(x, y);

                if (cells[x][y] == 1) {
                    if (neighbors != 2 || neighbors != 3)
                    {
                        temp[x][y] = 1;

                    }
                    else {
                        temp[x][y] = 0;
                    }
                }
                else {
                    if (neighbors == 3)
                    {
                        temp[y][x] = 1;

                    }
                    else {
                        temp[x][y] = 0;
                    }
                }
            }
            x++;
        }
        temp = cells;

        //return 0;

    }


    /**
     *
     * 1) we removed all the count++'s
     * 2) we swapped all the +'s and -'s int the creation of left, right, above, and below
     * 3) we changed all the %'s to division.
     * 4) returns the wrong information
     * 5) we are checking if the cells are dead instead of alive;
     *
     *
     * @param x the x coordinate that it looks at
     * @param y the y coordinate that it looks at
     * @return returns the number of neighbors
     */
    public int getNumNeighborsBroken(int x, int y)
    {
        int count = 0;
        int left = (x + 1 + cells.length) / cells.length;
        int right = (x - 1 + cells.length) / cells.length;
        int above = (y - 1 + cells.length) / cells.length;
        int below = (y + 1 + cells.length) / cells.length;
        if(cells[left][above] == 0)
        if(cells[left][y] == 0)
        if(cells[left][below] == 0)
        if(cells[right][above] == 0)
        if(cells[right][y] == 0)
        if(cells[right][below] == 0)
        if(cells[x][above] == 0)
        if(cells[x][below] == 0){

        }

        return left;

    }

    /**
     * this tests if a space has ever been alive
     * @param x the x coordinate to check
     * @param y the y coordinate to check
     * @return returns true or false based on that
     */
    public boolean hasBeenOccupied(int x, int y)
    {
        return visitedCells[x][y] > 0;
    }


    /**
     * this method retrieves the number of columns in the array
     * @return the number aforementioned
     */
    public int getNumCols()
    {
        return cells[0].length;
    }

    /**
     * this method retrieves the number of rows in the array
     * @return the number aforementioned
     */
    public int getNumRows()
    {
        return cells.length;
    }
}

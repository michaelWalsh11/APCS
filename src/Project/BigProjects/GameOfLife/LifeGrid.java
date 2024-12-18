package Project.BigProjects.GameOfLife;

public class LifeGrid
{

    private int [][] cells;
    public LifeGrid(int width, int height)
    {
        cells = new int[width][height];
    }

    public int getCell(int x, int y)
    {
        return cells[x][y];
    }

    public void setCell(int x, int y, int z)
    {
        cells[x][y] = z;
    }

    /** AI GENERATED COMMENT
     * Advances the current state of the grid by one generation according to the rules of Conway's Game of Life.
     * <p>
     * The evolution is based on the following rules:
     * <ul>
     *   <li>Any live cell with fewer than two live neighbors dies, as if by underpopulation.</li>
     *   <li>Any live cell with two or three live neighbors survives to the next generation.</li>
     *   <li>Any live cell with more than three live neighbors dies, as if by overpopulation.</li>
     *   <li>Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.</li>
     * </ul>
     * After applying these rules to all cells in the grid, the state is updated to reflect the next generation.
     */
    public void evolve() {
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
                }
                else if (cells[x][y] == 1) {
                    temp[x][y] = 1;
                }
            }
        }
        update(temp);

    }

    public void update(int [][] temp)
    {
        for (int x = 0; x < cells.length; x++)
        {
            for (int y = 0; y < cells[0].length; y++)
            {
                cells[x][y] = temp[x][y];
            }
        }
    }

    public int getNumNeighbors(int x, int y)
    {
        int num = 0;
        for (int n = -1; n < 2; n++)
        {
            for (int m = -1; m < 2; m++)
            {

                int nx = x + n;
                int ny = y + m;

                if ((n != 0 || m != 0) && nx >= 0 && ny >= 0 && nx < cells.length
                        && ny < cells[0].length && cells[nx][ny] != 0) {
                    num ++;
                }
            }
        }
        return num;
    }



    public int getNumCols()
    {
        return cells[0].length;
    }

    public int getNumRows()
    {
        return cells.length;
    }
}

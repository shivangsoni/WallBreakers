package UnionFind;

public class noOfIsland {
    boolean[][] array;
    int c;
    public void island(char[][] grid,int i,int j,int count)
    {
        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length || grid[i][j] == '0' ||array[i][j] == true)
            return;
        if(count == 0)
            c++;
        array[i][j] = true;
        island(grid,i+1,j,count+1);
        island(grid,i-1,j,count+1);
        island(grid,i,j-1,count+1);
        island(grid,i,j+1,count+1);
    }
    public int numIslands(char[][] grid) {
        if(grid.length == 0)
            return 0;
        array = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                island(grid,i,j,0);
            }
        }
        return c;
    }
}

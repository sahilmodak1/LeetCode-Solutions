public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        
        int x=0,y=0;

        for (int i=0; i<grid.length;i++) 
            for (int j=0;j<grid[0].length;j++) 
                if (grid[i][j]==1) 
                {
                    x++;
                    if (i<grid.length-1 && grid[i+1][j]==1) 
                        y++; 
                    if (j<grid[0].length-1 && grid[i][j+1]==1) 
                        y++; 
                }
          
        return( x*4 - y*2);
    }
}
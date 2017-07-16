public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;
        
        if (r * c != rows * columns)
            return nums;
            
        int[][] reshaped = new int[r][c];
        for (int i = 0; i < r * c; i++)
            reshaped[i/c][i%c] = nums[i/columns][i%columns];
            
        return reshaped;
    }
}
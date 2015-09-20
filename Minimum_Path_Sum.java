public class Minimum_Path_Sum {
    public static int[][] minPathSum(int[][] grid) {
    	int m = grid.length, n = grid[0].length;
        int[][] res = new int[m][n];
        res[0][0] = grid[0][0];
         for(int i=1;i<m;i++)
        		res[i][0] = res[i-1][0] + grid[i][0];
        for(int i = 1; i< n;i++)
        		res[0][i] = res[0][i-1] + grid[0][i];
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        			res[i][j] = Math.min(res[i-1][j],res[i][j-1])+grid[i][j];  
        	}
        }
        return res;
    }
    
    
    public static void main(String[] args){
    	int[][] test = {{1,2,3},{4,0,2},{2,1,2}};
    	/* grid matrix:
    	 * 1 2 3
    	 * 4 0 2
    	 * 2 1 2
    	 */
    	int[][] res = minPathSum(test);
    	for(int i=0;i<3;i++){
    		for(int j=0;j<3;j++)
    	    	System.out.print(res[i][j]+" "); 
    		System.out.println();
    	/* output:
    	 * 1 3 6
    	 * 5 3 5
    	 * 7 4 6
    	 */
    	}
    		
    }
}

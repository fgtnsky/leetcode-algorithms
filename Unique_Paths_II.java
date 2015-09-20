// https://leetcode.com/problems/unique-paths-ii/

public class Unique_Paths_II { //DP, O(m*n)
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] res = new int[m][n];
        res[0][0] = (obstacleGrid[0][0] == 1)? 0:1;
         for(int i=1;i<m;i++){
        	if(obstacleGrid[i][0]==1) res[i][0] = 0;
        	else
        		res[i][0] = res[i-1][0];
        }
        for(int i = 1; i< n;i++){
        	if(obstacleGrid[0][i]==1) res[0][i] = 0;
        	else
        		res[0][i] = res[0][i-1];
        }
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        		if(obstacleGrid[i][j] == 1)
        			res[i][j] = 0;
        		else
        			res[i][j] = res[i-1][j] + res[i][j-1];  
        	}
        }
        return res[m-1][n-1];
    }
    
    public static void main(String[] args){
    	int[][] test = {{0,0,0},{0,1,0},{0,0,0}};
    	int res = uniquePathsWithObstacles(test);
    	System.out.println(res); // output: 2
    		
    }
}

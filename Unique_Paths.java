//  https://leetcode.com/problems/unique-paths/


public class Unique_Paths { //DP, O(m*n)
    public static int uniquePaths(int m, int n) {
    	if(m==0 || n ==0) return 0;
    	if(m > n) return uniquePaths(n,m);
        int[][] res = new int[m][n];
        res[0][0] = 0;
        for(int i=0;i<m;i++)
        	res[i][0] = 1;
        for(int i = 0; i< n;i++)
        	res[0][i] = 1;
        for(int k = 1; k< m;k++){
        	for(int i=k,j=k;j<n;j++)
        		res[i][j] = res[i-1][j] + res[i][j-1];
        	for(int j=k,i=k;i<m;i++)
        		res[i][j] = res[i-1][j] + res[i][j-1];
        }
        if(m>=2 && m<n){
        	for(int i=m-1,j=m-1;j<n;j++)
        		res[i][j] = res[i-1][j] + res[i][j-1];
        }
        	
        return res[m-1][n-1];
    }
    
    public static void main(String[] args){
    	System.out.println(uniquePaths(3,5)); // output: 15
    }
}

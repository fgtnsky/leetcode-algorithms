//  https://leetcode.com/problems/search-a-2d-matrix/

//binary search, O(log(n)), almost the same as regular binary search, but here we need a function
// to change the original array index to matrix index.
public class Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length==0) return false;
        int left = 0, right = matrix.length * matrix[0].length-1;
        while(left<right-1){
        	int mid = left + (right - left)/2;
        	if(idxToM(matrix,mid) == target) return true;
        	if(idxToM(matrix,mid) < target) left =  mid;
        	else
        		right = mid;
        }
        if(idxToM(matrix,left)==target || idxToM(matrix,right)==target) return true;
        return false;
    }
    
    public static int idxToM(int[][] matrix, int idx){
    	int m = matrix.length, n = matrix[0].length;
    	return matrix[idx/n][idx%n];
    }
    
    public static void main(String[] args){
    	int[][] test ={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		System.out.print(searchMatrix(test,20)); // output: true
    }
	
}

import java.util.LinkedList;
import java.util.List;

//  https://leetcode.com/problems/spiral-matrix-ii/

// The code below is almost the same as Spiral_Matrix. Actually this problem is easier as m = n.
// but I am so lazy...I do not want to modify the code...
public class Spiral_Matrix_II {
    public static int[][] generateMatrix(int n) {
    	  int[][] matrix = new int[n][n];
          if(matrix.length==0) return matrix;
          int m = n;
          int up = 0, down = m - 1, left = 0, right = n -1, sign = 0;
          int i =0, j =0;
          int value = 1;
          if(m == 1) {
          	for(int k=0;k<n;k++)
          		matrix[0][k] = value++;
          	return matrix;
          }

          		
          while(i>=up && i<= down && j>=left && j<= right){
          	matrix[i][j] = value++;
          	if(sign == 0){
          		if(j == right){
          			sign = 1;
          			up ++;
          			i++;
          		}
          		else
          			j++;
          	}
          	
          	else if(sign == 1){
          		if(i == down){
          			
          			sign = 2;
          			right --;
          			j --;
          		}
          		else
          			i++;
          	}
          	else if(sign == 2){
          		if( j == left){
          			sign = 3;
          			down --;
          			i --;
          		}
          		else
          			j--;

          	}
          	
          	else if(sign == 3){
          		if( i == up){
          			sign = 0;
          			left ++ ;
          			j++;
          		}
          		else
          			i--;
          	}
          	
          }
          return matrix;
          
    }
    
    public static void main(String[] args){
    	int[][] test =  generateMatrix(3);
    	
    	for(int i=0;i<test.length;i++){
    		for(int j=0;j<test.length;j++)
    			System.out.print(test[i][j]+" ");
    		System.out.println();
    		
    		/* output: 
    		 * 1 2 3
    		 * 8 9 4
    		 * 7 6 5
    		 */
    	}
    }

}

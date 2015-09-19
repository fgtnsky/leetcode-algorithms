// https://leetcode.com/problems/spiral-matrix/

import java.util.*;
public class Spiral_Matrix {  //O(n)
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<Integer>();
        if(matrix.length==0 || matrix[0].length==0) return res;
        int m = matrix.length;
    	int n = matrix[0].length;
        int up = 0, down = m - 1, left = 0, right = n -1, sign = 0;
        int i =0, j =0;
        if(m == 1) {
        	for(int k=0;k<n;k++)
        		res.add(matrix[0][k]);
        	return res;
        }
        
        if(n == 1){
        	for(int k=0;k<m;k++)
        		res.add(matrix[k][0]);
        	return res;
        }
        		
        while(i>=up && i<= down && j>=left && j<= right){
        	res.add(matrix[i][j]);
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
        return res;
        
    }
    
    public static void main(String[] args){
    	/*
    	 * 1  2  3  4
    	 * 5  6  7  8
    	 * 9  10 11 12
    	 * 13 14 15 16
    	 */
    	int[][] test = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    	// output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
    	System.out.println(spiralOrder(test));
    	
    }
}

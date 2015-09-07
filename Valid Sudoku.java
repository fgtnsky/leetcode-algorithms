/**************************************************************************************************
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
**************************************************************************************************/

import java.util.*;
public class Valid_Sudoku {
    public static boolean isValidSudoku(char[][] board) {
    	for(int i=0;i<9;i++){
    		if(!isValidLine(0,8,i,i,board)) return false;
    		if(!isValidLine(i,i,0,8,board)) return false;
    	}
    	for(int i=0;i<9;i+=3){
    		for(int j=0;j<9;j+=3){
    			if(!isValidLine(i,i+2,j,j+2,board)) return false;
    		}
    	}
    	return true;
        
    }
    
    public static boolean isValidLine(int x1,int x2, int y1, int y2,char[][] board){
    	HashSet hs = new HashSet();
    	for(int i=x1; i<= x2;i++){
    		for(int j=y1; j<= y2;j++){
    			if(board[i][j]!='.')
    				if(!hs.add(board[i][j]))
    					return false;
    		}
    	}
    	return true;
    }
    
    public static void main(String[] args){
    	// check the test board here: https://leetcode.com/problems/valid-sudoku/
    	char[][] test = {{5,3,'.','.',7,'.','.','.','.'},
    					  {6,'.','.',1,9,5,'.','.','.'},
    					  {'.',9,8,'.','.','.','.',6,'.'},
    					  {8,'.','.','.',6,'.','.','.',3},
    					  {4,'.','.',8,'.',3,'.','.',1},
    					  {7,'.','.','.',2,'.','.','.',6},
    					  {'.',6,'.','.','.','.',2,8,'.'},
    					  {'.','.','.',4,1,9,'.','.',5},
    					  {'.','.','.','.',8,'.','.',7,9}};
    	System.out.println(isValidSudoku(test));  // output: true
    }
}





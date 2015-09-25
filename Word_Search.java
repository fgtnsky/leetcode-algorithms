
import java.util.*;
public class Word_Search {
    public static boolean exist(char[][] board, String word) {
        if(word == "") return true;
        if(board.length ==0) return false;
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++){
        	for(int j = 0; j<n;j++){
        		if(exist_start(board,i,j,word))
        			return true;
        	}
        }
        
        return false;
        
    }
    
    
    public static boolean exist_start(char[][] board, int h, int k, String word) {
        if(word == "") return true;
        if(board.length ==0) return false;
        if(board[h][k] != word.charAt(0))
        	return false;
        if(word.length() == 1) return true;
        char temp = board[h][k];
        board[h][k] = '0';
        List<Integer> position = new ArrayList<Integer>();
        position = surround_grid(h,k,board);
        for(int i = 0; i< position.size();i += 2){
        	if(exist_start(board,position.get(i),position.get(i+1),word.substring(1)))
        		return true;
        }
        board[h][k] = temp;
        return false;        
    }
    
    public static List<Integer> surround_grid(int h, int k,char[][] board){
    	List<Integer> res = new ArrayList<Integer>();
    	if(board.length == 0) return res;
    	if(h -1 >=0) {res.add(h-1);res.add(k);}
    	if(h + 1 < board.length) {res.add(h+1);res.add(k);}
    	if(k - 1>=0) {res.add(h);res.add(k-1);}
    	if(k + 1<board[0].length) {res.add(h);res.add(k+1);}
    	return res;
    }
    
    public static void main(String[] args){
    	char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
    	/*
    	 *CAA
    	 *AAA
    	 *BCD
    	 */
    	System.out.println(exist(board,"AAB")); //output: true
    }
}

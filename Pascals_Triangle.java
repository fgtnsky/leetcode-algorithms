
/**************************************************************************************************
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*************************************************************************************************/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows==0) return res;
    	res.add(new ArrayList<Integer>(Arrays.asList(1)));
		ArrayList<Integer> temp1 = new  ArrayList<Integer>();
    	for(int i=1;i<numRows;i++){
    		 ArrayList<Integer> temp = new  ArrayList<Integer>();
    		 temp.add(1);
    		 for(int j=0;j<temp1.size()-1;j++)
    			 temp.add(temp1.get(j)+temp1.get(j+1));
    		 temp.add(1);			 
    	     temp1 = temp;
    	     res.add(temp);
    	}
    	
    	return res;
    	
    }
    
    public static void main(String[] args){
    	System.out.println( generate(5)); // output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
    }
}

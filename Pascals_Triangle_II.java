
/**************************************************************************************************

Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
*************************************************************************************************/

import java.util.LinkedList;
import java.util.List;
		
public class Pascals_Triangle_II {
	 public static List<Integer> getRow(int rowIndex) {
    	List<Integer> res = new LinkedList<Integer>();
        if(rowIndex<0) return res;
        res.add(1);
    	for(int i=1;i<=rowIndex;i++){
    		 res.add(0,1);
    		 for(int j=1;j<res.size()-1;j++)
    			 res.set(j, res.get(j) +res.get(j+1)) ;
    	}   	
    	return res;	    	
	 }
	    
	    public static void main(String[] args){
	    	System.out.println( getRow(5)); // output:[1, 4, 6, 4, 1]
	    }

}

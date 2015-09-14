/**************************************************************************************************
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*************************************************************************************************/
import java.util.*;
public class Summary_Ranges {
    public static List<String> summaryRanges(int[] nums) {
    	if(nums.length==0) return new ArrayList<String>();
    	List<String> res = new ArrayList<String>();
    	int start = nums[0], end = Integer.MIN_VALUE;
    	for(int i=1;i<nums.length;i++){
    		if(nums[i]!=nums[i-1]+1){
    			if(end==Integer.MIN_VALUE)
    				res.add(Integer.toString(start));
    			else {
    				end = nums[i-1];
    				res.add(start+"->"+end);
    			}
    			start = nums[i];
    			end = Integer.MIN_VALUE;
    		}
    		else
    			end = nums[i];
    	}
    	if(end==Integer.MIN_VALUE)
			res.add(Integer.toString(start));
    	else
    		res.add(start+"->"+end);
		return res;
        
    }
    
    public static void main(String[] args){
    	System.out.println(summaryRanges(new int[]{0,1,2,4,5,7})); // output:[0->2, 4->5, 7]
    }

}

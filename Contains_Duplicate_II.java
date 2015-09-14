/**************************************************************************************************
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
**************************************************************************************************/
import java.util.*;


public class Contains_Duplicate_II {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
    	if(nums.length==0) return false;
        HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(hs.containsKey(nums[i])){
        		if(i - hs.get(nums[i])<=k) return true;
        		else
        			hs.replace(nums[i], i);}
        	else
        		hs.put(nums[i], i);
        	
        }
        return false;
    }
    
    
    public static void main(String[] args){
    	int[] test = {1,2,3,4,2,3};
    	System.out.println(containsNearbyDuplicate(test,2)); //false

    }
}



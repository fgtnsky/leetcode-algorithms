
/**************************************************************************************************
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
**************************************************************************************************/

import java.util.*;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
    	if(nums.length==0) return false;
        HashSet hs = new HashSet();
        for(int i=0;i<nums.length;i++){
        	if(!hs.add(nums[i]))
        		return true;
        }
        return false;
    }
    
    
    public static void main(String[] args){
    	int[] test = {1,2,3,4,2,3};
    	System.out.println(containsDuplicate(test)); //false

    }
}

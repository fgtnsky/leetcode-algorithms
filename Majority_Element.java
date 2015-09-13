
/**************************************************************************************************
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
**************************************************************************************************/


public class Majority_Element {
	
    public static int majorityElement(int[] nums) {
    	if(nums.length==0) return Integer.MIN_VALUE;
    	int count = 1, major = nums[0];
    	for(int i=1; i<nums.length;i++){
    		if(nums[i]==major) count++;
    		else if(nums[i]!=major && count==0){
    			major = nums[i];
    			count++;
    		}
    		else
    			count--;
    	}
    	return major;
    }
	
	
	public static void main(String[] args){
		System.out.println(majorityElement(new int[] {1,2,2,2,1}));
	}

}

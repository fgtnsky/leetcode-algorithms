

//  1. two Sum: https://leetcode.com/problems/two-sum/
	
//	Given an array of integers, find two numbers such that they add up to a specific target number.
//
//	The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//
//	You may assume that each input would have exactly one solution.
//
//	Input: numbers={2, 7, 11, 15}, target=9
//	Output: index1=1, index2=2

import java.util.HashMap;

public class twoSum_2 {
	public static void main(String args[]){
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] res = twoSum(numbers,target);
		System.out.println("index1 = " + res[0] + ", index2 = " + res[1]);
		// output: index1 = 1, index2 = 2
	}
	
    public static int[] twoSum(int[] numbers, int target) {
        
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i=0; i< numbers.length; i++){
    		if(map.containsKey(target - numbers[i]))
    		{
    			return new int[] {map.get(target - numbers[i]) + 1, i + 1};
    		}
    		else
    			map.put(numbers[i], i);
    	}
    	
    	throw new RuntimeException("target not found");
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//  https://leetcode.com/problems/3sum-closest/

public class three3Sum_Closest {   
    // similar to two sum, O(n^2)
    public static int threeSumClosest(int[] nums, int target) {
    	int dis = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
        	int start = i+1, end = nums.length-1;
        	while(start<end){
        		int sum = nums[i]+nums[start]+nums[end]-target;
    			if(Math.abs(sum)<dis){
    				dis = Math.abs(sum);
    				res = sum + target;
    			}
        		if(sum==0)
        			return target;
        		else if(sum<0)
        			start++;
        		else
        			end--;
        	}
        }
        return res;
    }
    
    
    public static void main(String[] args){
    	 int res = threeSumClosest(new int[] {1,2,-2,-2,5,3,-6,-8,9,-3},20);
    	 
    	 System.out.println(res); // 17
    } 
}


/**************************************************************************************************
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*************************************************************************************************/
import java.util.*;
public class House_Robber { // DP, O(n)
	
    public static int rob(int[] nums) {
        if(nums.length==0) return 0;
    	int[] best = new int[nums.length];
    	for(int i=0;i<nums.length;i++){
    		if(i==0) best[i] = nums[0];
    		else if(i==1) best[i] = Math.max(nums[0], nums[1]);
    		else
    			best[i] = Math.max(best[i-1],nums[i]+best[i-2]);
    	}
    	
    	return best[nums.length-1];
    }
    public static void main(String[] args){
    	int[] res = new int[] {1,4,7,9,11,8,3};
    	System.out.println(rob(res)); //output: 22
	}
}

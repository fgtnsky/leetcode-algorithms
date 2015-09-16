// https://leetcode.com/problems/3sum/

import java.util.*;
public class three3Sum {
	// first method
    public static  List<List<Integer>> threeSum(int[] nums) { 
    	// worse time complexity O(n^3), if on average hashmap cost O(1) in find, then O(n^2)
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(hs.containsKey(nums[i]))
        		hs.replace(nums[i], hs.get(nums[i])+1);
        	else
        		hs.put(nums[i], 1);
        }
        for(int i=0;i<nums.length;i++)
        	for(int j=nums.length-1;j>i;j--){   
        		int request = -nums[i] - nums[j];
        		if(request ==nums[i]|| request ==nums[j]){
        			if(hs.get(request)>1)
        				res.add(new ArrayList(Arrays.asList(nums[i],request,nums[j])));
        		}
        		else if(request>nums[i] && request<nums[j]){
        			if(hs.containsKey(request))
        				res.add(new ArrayList(Arrays.asList(nums[i],request,nums[j])));
        		}        	
        }
        return res;
    }
    
    // second method: similar to two sum, O(n^2)
    public static List<List<Integer>> threeSum2(int[] nums) {
    List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2 && nums[i]<=0;i++){
            while(i>=1 && i< nums.length && nums[i]==nums[i-1])
                i++;
        	int start = i+1, end = nums.length-1;
        	while(start<end){
        		if(nums[i]+nums[start]+nums[end]==0){
        			res.add(new ArrayList(Arrays.asList(nums[i],nums[start],nums[end])));
        			start++;
        			while(start<end && nums[start]==nums[start-1])
        				start++;
        			end--;
        			while(start<end && nums[end]==nums[end+1])
        				end--;
        		}
        		else if(nums[i]+nums[start]+nums[end]<0)
        			start++;
        		else
        			end--;
        	}
        }
        return res;
    }
    
    
    public static void main(String[] args){
    	 List<List<Integer>> res = threeSum(new int[] {1,2,-2,-2,5,3,-6,-8,9,-3});
    	 List<List<Integer>> res2 = threeSum2(new int[] {1,2,-2,-2,5,3,-6,-8,9,-3});
    	 
    	 for(int i=0;i<res.size();i++){
    		 System.out.println(res.get(i));
    	 }
		 System.out.println("=============================");
    	 for(int i=0;i<res2.size();i++){
    		 System.out.println(res2.get(i));
    	 }
    	 
		   /* output:
		 [-8, 3, 5]
		[-6, -3, 9]
		[-6, 1, 5]
		[-3, -2, 5]
		[-3, 1, 2]
		=============================
		[-8, 3, 5]
		[-6, -3, 9]
		[-6, 1, 5]
		[-3, -2, 5]
		[-3, 1, 2]
		    */  
    }
}

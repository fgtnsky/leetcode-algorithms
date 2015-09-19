import java.util.Arrays;

// https://leetcode.com/problems/maximum-subarray/


public class Maximum_Subarray { // divide and conquer, O(n)
    public static int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return maxthree(nums[0], nums[1], nums[0]+nums[1]);  
        int[] firsthalf = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] secondhalf = Arrays.copyOfRange(nums, nums.length/2,nums.length);
        return maxthree(maxSubArray(firsthalf),maxSubArray(secondhalf),
        		maxStartArray(secondhalf)+maxEndArray(firsthalf));
    }
    
    public static int maxthree(int x1,int x2,int x3){
    	return Math.max(Math.max(x1, x2), x3);
    }
    
    public static int maxStartArray(int[] nums){  // O(n)
    	int largest = nums[0];
    	int sum = nums[0];
    	for(int i=1;i<nums.length;i++){
    		sum += nums[i];
    		if(sum>largest)
    			largest = sum;
    	}
    	return largest;        
    }
    
    public static int maxEndArray(int[] nums){  //O(n)
    	int largest = nums[nums.length-1];
    	int sum = nums[nums.length-1];
    	for(int i=nums.length-2;i>=0;i--){
    		sum += nums[i];
    		if(sum>largest)
    			largest = sum;
    	}
    	return largest;        
    }
    
    public static void main(String[] args){
    	int[] test = new int[] {-2,1,-3,4,-1,2,1,-5,4};
    	System.out.println(maxSubArray(test)); // output: 6
    }
    
}

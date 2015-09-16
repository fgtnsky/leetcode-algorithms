import java.util.Arrays;

//  https://leetcode.com/problems/next-permutation/

public class Next_Permutation { //O(n)
    public static void nextPermutation(int[] nums) {
      if(nums.length==0 || nums.length==1) return;
      int i;
      for(i = nums.length-2;i>=0;i--){
    	  if(nums[i]>=nums[i+1]) continue;
    	  else 
    		  break;
      }
      if(i<0) {
    	  for(int j =0;j<nums.length/2;j++){
    		  int temp = nums[j];
    		  nums[j] = nums[nums.length-1-j];
    		  nums[nums.length-1-j] = temp;
    	  }
    	  return;
      }
      int j;
      for(j = i+1;j<nums.length;j++){
    	  if(nums[j]> nums[i]) continue;
    	  break;
      }
      j--;
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      int front = i+1, back = nums.length-1;
      while(front<back){
    	  int flog = nums[front];
    	  nums[front] = nums[back];
    	  nums[back] = flog;
    	  front++;back--;
      }
      
    }
    
    public static void main(String[] args){
    	int [] test = new int[] {1,2,9,8,7};
    	nextPermutation(test);
    	for(int i=0;i<test.length;i++)
    		System.out.print(test[i]+" "); // 1 7 2 8 9 
    }

}

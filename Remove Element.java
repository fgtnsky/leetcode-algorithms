
public class Remove_Element {

/**************************************************************************************************
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
**************************************************************************************************/
	   public static int removeElement(int[] nums, int val) {
           if(nums.length==0) return 0;
		   int pre = 0;
		   for(int i=0;i<nums.length;i++){
			   if(nums[i]!=val)
				   nums[pre++] = nums[i];			   
		   }
		   return pre;
    }
	   
	   public static void main(String[] args){
		   int[] test = {3,4,4,5,5,5};
		   System.out.println(removeElement(test,4)); // output: 4
	   }

}




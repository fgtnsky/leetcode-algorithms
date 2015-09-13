/**************************************************************************************************
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
**************************************************************************************************/

public class Rotate_Array {
	
	// rotate in each circle, for example: nums=[1,2,3,4,5,6,7,8]
	// k = 2, then 1,4,8,3,6 is a group, and 2,5 is another group.
	// it is similar to the subgroup concept in abstract algebra.

	// method1: algorithm: O(n), space:O(1) 
    public static void rotate(int[] nums, int k) { 

        if(k == 0) return;
        int c = 0;
        for(int j = 0; j < k; j++) {
            int i = j;
            int t = nums[i];


            for (;;) {

                i = (i + k) % nums.length;

                int nt = nums[i];

                nums[i] = t;

                t = nt;

                c++;

                if (i == j) break;
            }

            if(c == nums.length) break;
        }
        
    }
    
 
    public static void print(int[] nums){
    	for(int i=0;i<nums.length;i++)
    		System.out.print(nums[i]+" "); 
		System.out.println(); 
		return;
    }
    
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums,3);
		print(nums); // output: 5 6 7 1 2 3 4 
	}

}

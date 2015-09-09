/**************************************************************************************************
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
**************************************************************************************************/

public class Merge_Sorted_Array {      //O(m)
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int sp = m+n-1, idx1 = m - 1, idx2 = n - 1;
        for(int i = sp; i>=0;i--){ // fill nums1 from the back to the front, from large number to small number
        	if(idx1 < 0)
        		nums1[i] = nums2[idx2--];
        	else if(idx1>=0 && idx2>=0)
        		nums1[i] = (nums1[idx1]>nums2[idx2])? nums1[idx1--]:nums2[idx2--];
        }
        return nums1;
    }
    
    public static void prt(int[] nums){  //define: print array:
    	for(int i=0;i<nums.length;i++){
    		System.out.print(nums[i]+" ");
    	}
    	System.out.println();
    }
    
    public static void main(String[] args){
    	prt(merge(new int[] {3,6,9,12,0,0},4,new int[] {7,11},2)); //output 3 6 7 9 11 12
    

    }

}







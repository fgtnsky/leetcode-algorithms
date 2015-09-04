
//  Median of Two Sorted Arrays
//  https://leetcode.com/problems/median-of-two-sorted-arrays/
// There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

public class findMedianSortedArrays {     //O(log(m+n))
	public static void main(String[] args){
		int[] a = {1,3,5,8,9};
		int[] b = {2,6,13};
		System.out.println(findMedianSortedArrays(a,b));
		// output 5.5
	}
	
	// in case the index is out of bound
	public static int value(int[] a, int i){
		if(i<0) return Integer.MIN_VALUE;
		if(i >= a.length) return Integer.MAX_VALUE;
		return a[i];
	}
	
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2){

		int lengthSum = nums1.length + nums2.length;
		int k = lengthSum/2;
		if(lengthSum % 2 == 1) return findKthSortedArrays(nums1,nums2,k);
		else return (findKthSortedArrays(nums1,nums2,k)+findKthSortedArrays(nums1,nums2,k-1))/2;
		
	}
	
	public static double findKthSortedArrays(int[] nums1, int[] nums2, int k){
		if(nums1.length ==0) return nums2[k];
		if(nums2.length ==0) return nums1[k];
		if(k ==0) return Math.min(nums1[0], nums2[0]);
		
		int start = 0;
		int end = nums1.length;
		
		while(start < end){
			int idx1 = (start + end)/2;
			int idx2 = k - idx1;
			if(nums1[idx1] <= value(nums2,idx2) && nums1[idx1] >= value(nums2,idx2-1)) return nums1[idx1];
			if(value(nums2,idx2) <= nums1[idx1] && value(nums2,idx2) >= value(nums1,idx1-1)) return nums2[idx2];
			if(nums1[idx1] < value(nums2,idx2) && value(nums1,idx1) < value(nums2,idx2-1)) start = idx1+1;
			if(value(nums2,idx2) < nums1[idx1] && value(nums2,idx2) < value(nums1,idx1-1)) end = idx1;
//			System.out.println("idx1 is:"+idx1+"idx2 is:"+idx2);

		}
		
		if(nums1[nums1.length-1]<nums2[0]) return nums2[k-nums1.length];
		else return findKthSortedArrays(nums2,nums1,k);
	}
	



}

// https://leetcode.com/problems/search-insert-position/

public class Search_Insert_Position { //O(n)  
	public static int searchInsert(int[] nums, int target) {
		if(nums.length==0) return 0;
		if (target > nums[nums.length - 1])
			return nums.length;
		if (target < nums[0])
			return 0;
		int left = 0, right = nums.length - 1, mid = 0;
		while (left < right - 1) {
			mid = (left + right) / 2;
			if (nums[mid] > target)
				right = mid;
			else if (nums[mid] < target)
				left = mid;
			else if (nums[mid] == target)
				return mid;
		}

		if (nums[left] == target)
			return left;
		else
			return right;
	}

	public static void main(String[] args) {
		int[] test = new int[] { 1, 2, 4, 5, 6 };
		int res = searchInsert(test, 3);
		System.out.println(res);
	}

}

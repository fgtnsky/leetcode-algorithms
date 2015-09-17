// https://leetcode.com/problems/search-for-a-range/

public class Search_for_a_Range { // O(log(n))
	public static int[] searchRange(int[] nums, int target) {
		if (target > nums[nums.length - 1] || target < nums[0])
			return new int[] { -1, -1 };
		int left = 0, right = nums.length - 1, mid = 0;
		while (left < right - 1) {
			mid = (left + right) / 2;
			if (nums[mid] > target)
				right = mid;
			else if (nums[mid] < target)
				left = mid;
			else if (nums[mid] == target)
				break;
		}
		if (left == right - 1) {
			if (nums[left] == target && nums[right] == target)
				return new int[] { left, right };
			else if (nums[left] != target && nums[right] == target)
				return new int[] { right, right };
			else if (nums[left] == target && nums[right] != target)
				return new int[] { left, left };
			else
				return new int[] { -1, -1 };
		}
		int mid1 = mid, mid2 = mid;
		while (left < mid - 1) {
			mid1 = (left + mid) / 2;
			if (nums[mid1] < target)
				left = mid1;
			else if (nums[mid1] == target)
				mid = mid1;
		}
		if (nums[left] != target)
			left = mid;
		mid = mid2;

		while (right > mid + 1) {
			mid2 = (right + mid) / 2;
			if (nums[mid2] > target)
				right = mid2;
			else if (nums[mid2] == target)
				mid = mid2;
		}
		if (nums[right] != target)
			right = mid;
		return new int[] { left, right };

	}

	public static void main(String[] args) {
		int[] test = new int[] { 1, 2, 3, 3, 3, 3, 5, 6 };
		int[] res = searchRange(test, 3);
		for (int i = 0; i < res.length; i++)
			System.out.println(res[i]); // {2 , 5}
	}
}

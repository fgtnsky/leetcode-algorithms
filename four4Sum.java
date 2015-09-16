//  https://leetcode.com/problems/4sum/
import java.util.*;

public class four4Sum {
	// O(n^3) modified from this sum
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList();
		Arrays.sort(nums);
		for (int j = 0; j < nums.length - 3; j++) {
			while (j >= 1 && j < nums.length && nums[j] == nums[j - 1])
				j++;
			for (int i = j + 1; i < nums.length - 2; i++) {
				while (i > j + 1 && i < nums.length && nums[i] == nums[i - 1])
					i++;
				int start = i + 1, end = nums.length - 1;
				while (start < end) {
					if (nums[j] + nums[i] + nums[start] + nums[end] - target == 0) {
						res.add(new ArrayList(Arrays.asList(nums[j], nums[i], nums[start], nums[end])));
						start++;
						while (start < end && nums[start] == nums[start - 1])
							start++;
						end--;
						while (start < end && nums[end] == nums[end + 1])
							end--;
					} else if (nums[j] + nums[i] + nums[start] + nums[end] - target < 0)
						start++;
					else
						end--;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		List<List<Integer>> res = fourSum(new int[] { 0, 4, -5, 2, -2, 4, 2, -1, 4 }, 12);

		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}

		/*
		 * output:[0, 4, 4, 4] [2, 2, 4, 4]
		 */
	}
}

// https://leetcode.com/problems/single-number/

import java.util.*;
public class Single_Number { //O(n)
    public int singleNumber(int[] nums) {
        HashSet hs = new HashSet();
        for(int i=0;i<nums.length;i++){
        	if(!hs.add(nums[i]))
        		hs.remove(nums[i]);
        }
        return (Integer) hs.toArray()[0];
    }
}

import java.util.HashMap;

// Longest Substring without Repeating Characters

// https://leetcode.com/problems/longest-substring-without-repeating-characters/

//Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

public class lengthOfLongestSubstring {
	public static void main(String[] args) {
		String a = "aaaaaaa";
		System.out.println(lengthOflongestSubstring(a));
		String b = "abcabccd";
		System.out.println(lengthOflongestSubstring(b));
		// output 1   3
	}
	
	public static int lengthOflongestSubstring(String s) {
		if(s == null) return 0;
		if(s.length()==0) return 0;
		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 int startIndex = 0;
		 int endIndex = 1;
		 int longestlength = 1;
		 map.put(s.charAt(0), 0);
		 while(endIndex < s.length()) {
			 if(map.containsKey(s.charAt(endIndex)))
				 startIndex = Math.max(startIndex, map.get(s.charAt(endIndex))+1);
			 map.put(s.charAt(endIndex),endIndex);
			 longestlength = Math.max(longestlength, endIndex - startIndex + 1);
			 endIndex += 1;
		 }
		return longestlength;
	}
}

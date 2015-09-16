
//   https://leetcode.com/problems/generate-parentheses/

import java.util.*;

public class Generate_Parentheses {
	public static List<String> generateParenthesis(int n) {
		HashSet<String> res = new HashSet<String>();
		if (n == 0)
			return new ArrayList<String>(res);
		if (n == 1) {
			res.add("()");
			return new ArrayList<String>(res);
		}

		for (String s : generateParenthesis(n - 1)) {
			res.add("(" + s + ")");
			res.add("()" + s);
			res.add(s + "()");
		}

		for (int i = 2; i < n - 1; i++) {
			for (String s1 : generateParenthesis(i))
				for (String s2 : generateParenthesis(n - i))
					res.add(s1 + s2);
		}
		return new ArrayList<String>(res);
	}

	public static void main(String[] args) {
		List<String> test = generateParenthesis(3);
		for (int i = 0; i < test.size(); i++)
			System.out.println(test.get(i));
		/*
		 * ()()() (()()) ()(()) ((())) (())()
		 */
	}
}

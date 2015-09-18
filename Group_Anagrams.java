//  https://leetcode.com/problems/anagrams/

import java.util.*;
public class Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList();
        Arrays.sort(strs);
        HashMap<String,LinkedList<String>> hs = new HashMap<String,LinkedList<String>>();
        for(int i=0;i<strs.length;i++){
        	char[] array = strs[i].toCharArray();
        	Arrays.sort(array);
        	String str = String.valueOf(array);
        	if(hs.containsKey(str))
        		hs.get(str).add(strs[i]);
        	else{
        		LinkedList<String> element = new LinkedList<String>();
        		element.add(strs[i]);
        		hs.put(str, element);
        	}
        }
        Iterator<LinkedList<String>> iter =hs.values().iterator();
        while(iter.hasNext())
        	res.add(iter.next());       
        return res;
        
    }
    
    public static void main(String[] args){
        System.out.println(groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
        // output:  [[ate, eat, tea], [bat], [nat, tan]]
    }
}

//  https://leetcode.com/problems/permutations/

import java.util.*;
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {

	    List<List<Integer>> res = new LinkedList();
	    if(nums.length==0)
	        return res;
	    if(nums.length==1){
	    	List<Integer> ele = new LinkedList<Integer>();
	    	ele.add(nums[0]);
	        res.add(ele);
	        return res;
	    }
	    for(List<Integer> ele : permute(Arrays.copyOfRange(nums, 1, nums.length))){
	    	for(int i=0;i<=ele.size();i++){
	    		List<Integer> element = new LinkedList<Integer>();	    		
	    		element = copylist(ele);
	    		element.add(i, nums[0]);
	    		res.add(element);	    		
	    	}
	    }
	    Collections.sort(res, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
            	for(int i=0;i<l1.size();i++){
            		if(l1.get(i)!=l2.get(i))
                        return l1.get(i).compareTo(l2.get(i));
            	}
            	return l1.get(0).compareTo(l2.get(0));           	
            }
        });
	    return res;	    	
    }
    
    
    
    public static List<Integer> copylist(List<Integer> l){
    	List<Integer> res = new LinkedList<Integer>();
    	for(int i=0;i<l.size();i++)
    		res.add(l.get(i));
    	return res;
    }
    
    public static List<List<Integer>> permute2(int[] num) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (int n : num) {
            int size = res.size();
            for (; size > 0; size--) {
                List<Integer> r = res.pollFirst();
                for (int i = 0; i <= r.size(); i++) {
                    List<Integer> t = new ArrayList<Integer>(r);
                    t.add(i, n);
                    res.add(t);
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args){
    	System.out.println(permute(new int[] {1,2,3}));
    	System.out.println(permute2(new int[] {1,2,3}));

    }
}

//  https://leetcode.com/problems/combination-sum/

import java.util.*;
public class Combination_Sum {
	public static List<List<Integer>> combinationSum(int[] candidates, int target) { 
		Arrays.sort(candidates);  // sort candidates
		return combinationSum2(candidates,target);
	}
	
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	
        List<List<Integer>> res = new LinkedList();
    	if(candidates.length==0 || target<candidates[0]) return res;
    	int i;
        for(i=candidates.length-1;i>=0;i--){  // we do not care the candidates which are greater than target
        	if(target<candidates[i])
        		continue;
        	break;
        }
    	for(int j=0;j*candidates[i]<=target;j++){
    		if(target == j*candidates[i]){  // add the element that is formed of candidates[i] only
     			List<Integer> ele = new LinkedList<Integer>();
    			for(int k=0;k<j;k++)
    				ele.add(candidates[i]);
    			res.add(ele);
    		}
    		if(i>=1){  // add the element that if formed of the elements before i.
        		for(List<Integer> ele:combinationSum2(Arrays.copyOf(candidates, i),target-j*candidates[i])){
        			for(int k=0;k<j;k++)
        				ele.add(candidates[i]);
        			res.add(ele);
        		}
    		}
    	}
        return res;
    }
    
    public static void main(String[] args){
    	int[] test = new int[] {1,2,3,4};
    	List<List<Integer>> res = combinationSum(test,5);
    	System.out.println(res);
    	//  [[1, 1, 1, 1, 1], [1, 1, 1, 2], [1, 2, 2], [1, 1, 3], [2, 3], [1, 4]]
    }
}

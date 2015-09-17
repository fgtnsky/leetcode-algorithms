import java.util.*;


// https://leetcode.com/problems/combination-sum-ii/

public class Combination_Sum_II {
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) { 
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int i=0;i<candidates.length;i++){
			if(hs.containsKey(candidates[i]))
				hs.replace(candidates[i], hs.get(candidates[i])+1);
			else
				hs.put(candidates[i], 1);
		}
		Object[] array =  hs.keySet().toArray();
		int[] res = new int[array.length];
		for(int i=0;i<array.length;i++)
			res[i] = (Integer) array[i];
		Arrays.sort(res);
		return combinationSum(res,target,hs);
	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target,HashMap<Integer,Integer> hs) {
    	
        List<List<Integer>> res = new LinkedList();
    	if(candidates.length==0 || target<candidates[0]) return res;
    	int i;
        for(i=candidates.length-1;i>=0;i--){  // we do not care the candidates which are greater than target
        	if(target<candidates[i])
        		continue;
        	break;
        }
    	for(int j=0;j<=hs.get(candidates[i]);j++){ 
    		if(target == j*candidates[i]){  // add the element that is formed of candidates[i] only
     			List<Integer> ele = new LinkedList<Integer>();
    			for(int k=0;k<j;k++)
    				ele.add(candidates[i]);
    			res.add(ele);
    		}
    		if(i>=1){  // add the element that if formed of the elements before i.
        		for(List<Integer> ele:combinationSum(Arrays.copyOf(candidates, i),target-j*candidates[i],hs)){
        			for(int k=0;k<j;k++)
        				ele.add(candidates[i]);
        			res.add(ele);
        		}
    		}
    	}
        return res;
    }
    
    
    public static void main(String[] args){
    	int[] test = new int[] {1,2,2,3,4};
    	List<List<Integer>> res = combinationSum2(test,5);
    	System.out.println(res);
    	//  [[1, 2, 2], [2, 3], [1, 4]]
    }
}

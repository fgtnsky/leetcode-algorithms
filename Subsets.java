//  https://leetcode.com/problems/subsets/

import java.util.*;


public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        if(nums.length==0) return res;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<=n;i++){
        	for(List<Integer> l:combine(nums,n,i))
        		res.add(l);
        }
        return res;
    }


  public static List<List<Integer>> combine(int[] num, int n, int k) {
      List<List<Integer>> res = new LinkedList();
      if(k ==0) {
      	List<Integer> l = new LinkedList<Integer>();
      	res.add(l);
      	return res;
      }
      else if(n<k) return res;
      else if(n == k) {
      	List<Integer> l = new LinkedList<Integer>();
      	for(int i=0;i<n;i++)
      		l.add(num[i]);
      	res.add(l);
      	return res;
      }
      else{
      	for(List<Integer> l:combine(num,n - 1, k))
      		res.add(l);
//      	System.out.println("part1 "+res);
      	for(List<Integer> l:combine(num,n-1,k-1)){
      		l.add(num[n-1]);
      		res.add(l);
      	}
//      	System.out.println("part2 "+res);
      }
      
      return res;
  }
  
  public static void main(String[] args){
	   int[] test = new int[] {2,3,4};
	  	System.out.println(subsets(test));
	  	
	  // output:  [[], [2], [3], [4], [2, 3], [2, 4], [3, 4], [2, 3, 4]]
  }
}


  

  


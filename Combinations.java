//https://leetcode.com/problems/combinations/

import java.util.*;

public class Combinations { // backtracking, 
    public static List<List<Integer>> combine(int n, int k) {
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
        		l.add(i + 1);
        	res.add(l);
        	return res;
        }
        else{
        	for(List<Integer> l:combine(n-1,k))
        		res.add(l);
  //      	System.out.println("part1 "+res);
        	for(List<Integer> l:combine(n-1,k-1)){
        		l.add(n);
        		res.add(l);
        	}
  //      	System.out.println("part2 "+res);
        }
        
        return res;
    }
    
 
    
    public static void main(String[] args){
    	System.out.println(combine(4,2));
    }
}
// https://leetcode.com/problems/permutation-sequence/

import java.util.*;

public class Permutation_Sequence { //O(n^2)
	// k = (n -1)!* a1 + (n -2)!* a2 + ... + 1* an
	// then first choose (a1)th number, then (a2)th number in the remaining n-1 numbers, etc
    public static String getPermutation(int n, int k) {
    		if(n ==0 ) return "";
	        int[] array = new int[n];
	        k--;
	        for(int i=0;i<n;i++){
	        	array[i] = k/factorial(n -1 -i) + 1;
	        	k %= factorial(n -1 - i);
	        }
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++){
	        	int temp = array[i] - 1;
	        	int j = 0;
	        	while(true){
	        		if(arr[j]!=0) 
	        			array[i]++;
	        		else if(temp == 0 && arr[j]==0){
	        			arr[j] = array[i];
	        			break;
	        		}
	        		else if(arr[j] == 0)
	        			temp--;
	        		j++;        				        		
	        	}
	        }
	        String res = "";
	        for(int i=0;i<n;i++)
	        	res += Integer.toString(array[i]);
	        
	        return res; 
    }
    
    public static int factorial(int n){

    	if(n == 1 || n == 0) return 1;
    	return n*factorial(n-1);
    	
    }
    
    public static void main(String[] args){
    	String s = getPermutation(3,3);
    	System.out.println(s); // output: 213
    	
    }
}


/**************************************************************************************************
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*************************************************************************************************/

public class Implement_strStr { //apply KMP, O(n+m)
    public static int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        int n = hay.length;
        int m = need.length;
        if(m==0) return 0;
        int[] fail = computeFailKMP(need);
        int j=0;
        int k=0;
        while(j<n){
        	if(hay[j]==need[k]){
        		if(k==m-1) return j-m+1;
        		j++; k++;
        	}else if(k>0)
        		k = fail[k-1];
        	else
        		j++;
        }
        return -1;
    }
    
    public static int[] computeFailKMP(char[] need){
    	int[] res = new int[need.length];
    	int len = 0;
    	for(int i=1;i<need.length;i++){
    		if(need[i]==need[len]){
    			len++;
    			res[i] = len;
    		}
    		else{
    			len = 0;
    			res[i] = len;
    		}
    	}
    	return res;
    }
    
    public static void main(String[] args){
    	System.out.println(strStr("abcbabcabcccc","abca")); // output:4
	}
}



/**************************************************************************************************
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
**************************************************************************************************/


public class Compare_Version_Numbers {
	
    public static int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int len1 = 0; int len2 = 0;
        while(len1<s1.length || len2<s2.length){
        	int temp1 = (len1<s1.length)? Integer.parseInt(s1[len1]):0;
        	int temp2 = (len2<s2.length)? Integer.parseInt(s2[len2]):0;
        	if(temp1>temp2) return 1;
        	else if(temp1<temp2) return -1;
        	len1++;len2++;
        }
        	return 0;
        
    }	
	
	public static void main(String[] args){
		int res = compareVersion("23.34.24","23.34.24.1");
		System.out.println(res);
	}

}

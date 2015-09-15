
/**************************************************************************************************
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*************************************************************************************************/

public class Plus_One {

	
        public static int[] plusOne(int[] digits) {
        	int flog = 1;
            for(int i=digits.length-1;i>=0;i--){
            	int temp = digits[i];
            	if(digits[i]+flog>=10)
            		digits[i] = digits[i]+flog-10;
            	else{
            		digits[i] = digits[i] + flog;
            		flog = 0;
            	}
            }
            if(flog==0) return digits;
            else{
            	int[] res = new int[digits.length+1];
            	res[0] = 1;
            	for(int i=0;i<digits.length;i++)
            		res[i+1] = digits[i];
            	return res;
            }
            
        }
        public static void main(String[] args){
        	int[] res = plusOne(new int[] {1,4,7,9});
        	for(int i=0;i<res.length;i++)
        		System.out.println(res[i]);
    	}
}

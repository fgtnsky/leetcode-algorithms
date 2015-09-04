/**************************************************************************************************
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
**************************************************************************************************/
		
public class ZigZag_Conversion {
	   public static String convert(String s, int numRows){  // O(n) = O(numRows) * O(periods)
	        if(numRows == 1) return s;		   // return original string if numRows = 1
			String zig = ""; // zig is our return string
			// the zigzag pattern repeated after a period, from the example above, pattern repeated
			// for every two columns, and 2*numRows - 2 chars in every period
			int period = 2*numRows - 2;  
			// calculate the chars in each line, the initial index for each line increase 1.
			for(int init=1;init<=numRows;init++){
			// calculate the index in each period for each line
				for(int circle = 0; init+circle*period<=s.length();circle++){
			// only one char in each line each period for the first and last line		
					if(init == 1 | init == numRows){
						zig += s.charAt(init+circle*period-1);
					}
			// two chars in each line each period other than the first and last line
					if(init != 1& init != numRows){
						zig += s.charAt(init+circle*period-1);
			// if the index is not out of the length of original string
						if(2*numRows - init+circle*period-1<s.length()){
							zig += s.charAt(2*numRows - init+circle*period-1);
						}
					}
				}

			}
			return zig;
	   }


	public static void main(String[] args){
		System.out.println(convert("PAYPALISHIRING",3));
		// output:  PAHNAPLSIIGYIR
		System.out.println(convert("PAYPALISHIRING",4));
		// output:  PINALSIGYAHRPI
	}
}







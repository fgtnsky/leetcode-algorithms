// https://leetcode.com/problems/integer-to-roman/

public class Integer_to_Roman {
    public String intToRoman(int num) {
    	String[] M = {"","M","MM","MMM"};
    	String[] D = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    	String[] L = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    	String[] V = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    	return M[num/1000]+D[(num/100)%10]+L[(num/10)%10]+V[(num)%10];
    }
}

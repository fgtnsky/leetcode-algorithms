
/**************************************************************************************************
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
**************************************************************************************************/
//based on article here: https://en.wikipedia.org/wiki/Digital_root
public class Add_Digits {
    public int addDigits(int num) {
        return (num - 9 * ((num-1)/9));
    }
}

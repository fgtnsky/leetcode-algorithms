// https://leetcode.com/problems/powx-n/

public class Pow_x_n { //O(log(n))
    public double myPow(double x, int n) {
        if(n ==0) return 1;
        if(n ==-1) return 1/x;
        if(n == 1) return x;
        if(n > 0) return (n%2==0)? myPow(x*x, n/2):x*myPow(x*x,n/2);
        if(n < 0) return (n%2==0)? myPow(x*x, n/2):1/x*myPow(x*x,n/2);
        return 1;
    }
}

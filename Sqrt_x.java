//  https://leetcode.com/problems/sqrtx/


public class Sqrt_x {
    public static int mySqrt(int x) {
        if(x<=0) return 0;
      int left = 1, right = x, mid  = 0;
      while(left < right-1){
      	mid = left + (right - left)/2;
      	if((mid-1)>x/(mid-1))
      		right = (mid -1) ;
      	else if(mid <= x/mid)
      		left = mid;
      	else if(mid > x/mid && (mid-1)<=x/(mid-1))
      		return (mid - 1);
      }
      if(right<=x/right) return right;
      return left;
    }
    
    public static void main(String[] args){
    		System.out.println(mySqrt(2147395600)); // output: 46340
    }
}

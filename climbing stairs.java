/**************************************************************************************************

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
**************************************************************************************************/

public class climbing_stairs {   
    public static int climbStairs(int n) { //DP: algorithm below is very slow as we need to re-calculate many times
        if(n<=0) return 0;
        else if(n==1) return 1;
        else if(n==2) return 2;
        else
        	return climbStairs(n-1)+climbStairs(n-2);
    }
    
    public static int climbStairs2(int n) { //It is like Fibonacci number, and we record the previous two numbers
        if(n<=0) return 0;
        else if(n==1) return 1;
        else if(n==2) return 2;
        else{
        	int L1 = 1, L2 = 2;
        	for(int i=1; i<n; i++){
        		int temp = L1 + L2;
        		L1 = L2;
        		L2 = temp;
        	}
        	return L1;
        }
        	
    }
    
    public static void main(String[] args){
    	System.out.println(climbStairs(5)); //output: 8
    	System.out.println(climbStairs2(5)); //output: 8

    }

}







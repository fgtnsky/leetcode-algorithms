import java.util.*;

/**************************************************************************************************
Description:

Count the number of prime numbers less than a non-negative number, n.
**************************************************************************************************/

public class Count_Primes { // use the algorithm: Sieve of Eratosthenes, O(n*log(log(n)))
    public static int countPrimes1(int n) {
    	boolean[] isPrime = new boolean[n];
    	for (int i = 2; i<n ;i++)
    		isPrime[i] = true;
    	for(int i=2;i<n;i++){
    		if(isPrime[i])
    			for(int j=2;i*j<n;j++)
    				isPrime[j*i] = false;
    	}
    	int count = 0;
    	for(int i=2;i<n;i++)
    		if(isPrime[i]==true)
    			count++;
    	return count;
        
    }
    

    
    public static void main(String[] args){
    	System.out.println(countPrimes1(1000)); //output: 168
    }

}

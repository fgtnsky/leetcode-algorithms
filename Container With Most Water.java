
/**************************************************************************************************

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.
**************************************************************************************************/

// the algorithm complexity is O(n):


public class Container_With_Most_Water {
    public static int maxArea(int[] height) {
    	int left =0, right = height.length -1;
    	int mx = (right - left) *Math.min(height[left], height[right]);
    	while(left < right){
    		if(height[left]<=height[right]) 
    			left++;
    		else
    			right--;
			mx = Math.max(mx,(right - left) *Math.min(height[left], height[right]));    			
    	}
    	return mx; 	

   }
// here is the reason why this algorithm can give the best container:
// if height(left) < height(right), then when right decreases, the capacity for all the containers with left
// is less than that for the container with this left and right stick.
// so we just need to handle the stick that left++ until height(left)>height(right), than try to find the most
// right stick which is higher than the left. for example:
// if int[]={3,4,6,2,7,5}, the comparation order is(3,5),(4,5),(6,5),(6,4),(6,7)
// (3,5) is the best for 3 and (3,4)is the best for 4, and we compared (6,5),(6,7) to find out the best component
// for 6. and when we find 7, we do not need to compared (6,2) as 7 is bigger and righter than 2.
    
    
    public static void main(String[] args){
    	
    	int test[] = {10,20,30,40,50,60};
    	System.out.println(maxArea(test)); 
    }
}

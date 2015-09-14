/**************************************************************************************************
Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

read more here:https://leetcode.com/problems/rectangle-area/
**************************************************************************************************/

public class Rectangle_Area {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int x = 0,y = 0;
        if(H<B ||D<F) return (D-B)*(C-A)+(G-E)*(H-F);
        x = Math.min(D, H) - Math.max(B, F);
        
        if(E>C || G<A) return (D-B)*(C-A)+(G-E)*(H-F);
        y = Math.min(C, G) - Math.max(E, A);
        return (D-B)*(C-A)+(G-E)*(H-F)-x*y;
        
    }
    
    
    public static void main(String[] args){
    	System.out.println(computeArea(-3,0,3,4,0,-1,9,2)); // output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
    }

}

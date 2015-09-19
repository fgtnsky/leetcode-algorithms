//  https://leetcode.com/problems/jump-game/

public class Jump_Game {
    public static boolean canJump(int[] nums) {
      int max_jump = 0;
      for(int i = 0;i<=max_jump;i++){
    	  max_jump = Math.max(max_jump,i+nums[i]);
    	  if(max_jump>= nums.length-1) break;
      }
      if(max_jump<nums.length-1)
    	  return false;
      return true;
      
    }
    
    public static void main(String[] args){
    	int[] test = new int[] {2,3,1,1,4};
    	System.out.println(canJump(test)); // output: true
      	int[] test2 = new int[] {3,2,1,0,4};
    	System.out.println(canJump(test2)); // output: false
    }
}

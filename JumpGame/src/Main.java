public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = new int[]{3,2,1,0,4};
        canJump(nums);
    }

    public static boolean canJump(int[] nums) {
      int goal = nums.length-1;
        for (int i = nums.length-2; i >=0; i--) {
            if(i + nums[i] >= goal){
                goal = i ;
            }
        }
        return  goal ==0;
    }
}
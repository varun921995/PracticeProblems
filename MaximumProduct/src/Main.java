public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = new int[]{9,2,3,5,2,6,9,7,9,4,5,5,10,8,9};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int result = 0;
        int m1 = nums[0];
        int m2 = nums[1];
        int i = 2;
        while(i<nums.length){
          if((m1 <= m2) && (nums[i] > m1)){
              m1 = nums[i];
          }else if((m2<m1) && (nums[i] > m2)){
              m2 = nums[i];
          }
           i++;
        }

        return (m1-1) * (m2-1);
    }
}
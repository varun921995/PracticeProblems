import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5},-2));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            int a = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = a + nums[left] + nums[right];
                if(target > sum){
                    left++;
                }else{
                    right--;
                }
                if(sum == target){
                    return sum;
                }
                if(Math.abs(sum - target) < d  && Math.abs(sum - target) >=0){
                    d = Math.abs(sum - target);
                    closestSum = sum;
                }
            }
        }
        return closestSum;
    }
}
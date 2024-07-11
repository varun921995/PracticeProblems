
public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 3, 4, 5, 7, 10, 11 };
        int target = 9;
        int result[] = twoSum(numbers, target);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if ((nums[i] + nums[j]) == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
            if ((nums[i] + nums[j]) > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}

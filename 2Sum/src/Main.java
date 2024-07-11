import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/

class Main {

    public static void main(String[] args) {
        int[] numbers = new int[] { 3, 2, 4 };
        int target = 6;
        int result[] = twoSum(numbers, target);
        System.out.println(result.toString());
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = record.get(target - nums[i]);
                return result;
            }
            record.put(nums[i], i);
        }

        return result;
    }
}
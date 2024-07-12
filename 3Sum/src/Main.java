import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { -2, 0, 1, 1, 2 };
        threeSum(numbers);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        for (int i = 0; i < nums.length - 1; i++) {

            int a = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if ((a + nums[left] + nums[right]) == 0) {
                    List<Integer> subResult = new ArrayList<Integer>();
                    subResult.add(a);
                    subResult.add(nums[left]);
                    subResult.add(nums[right]);
                    result.add(subResult);
                    left++;
                    right--;
                }
                if ((a + nums[left] + nums[right]) < 0) {
                    left++;
                } else if ((a + nums[left] + nums[right]) > 0) {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = new int[]{};
        searchRange(nums, 6);
    }

    public static int[] searchRange(int[] nums, int target) {
            int[] result = new int[]{-1,-1};
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = (left + right)/2;
                if (nums[mid] == target) {
                    left = mid;
                    right = mid;
                    result[0] = left;
                    result[1] = right;
                    while (left >= 0 && nums[left] == target  ) {
                        result[0] = left;
                        left--;
                    }
                    while (right <= nums.length - 1 && nums[right] == target  ) {
                        result[1] = right;
                        right++;
                    }
                    break;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return result;
    }
}
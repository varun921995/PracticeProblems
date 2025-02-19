public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = new int[]{3, 4,5,8,10};
        System.out.println( searchInsert(nums, 8));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if(target <= nums[left] ) {
            return left;
        }
        if(target >= nums[right]) {
            return nums.length;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                if(nums[mid - 1] < target){
                    return mid;
                }
                right = mid - 1;
            }else if(nums[mid] < target){
                if(nums[mid + 1] > target){
                    return mid+1;
                }
                left = mid + 1;
            }else{
                return mid;
            }
        }
    return 0;
    }

}
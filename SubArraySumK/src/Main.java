import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Subarray Sum Equals K");

        int[] nums = new int[]{1,2,3};
        System.out.println(subarraySum(nums,3));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixSumCount = new HashMap<>();
        int currentSum = 0 ;
        int result = 0;
        prefixSumCount.put(0,1);

        for (int i : nums){
            currentSum += i;
            if (prefixSumCount.containsKey(currentSum-k)){
                result += prefixSumCount.get(currentSum-k);
                prefixSumCount.put(currentSum, (prefixSumCount.getOrDefault(currentSum,0))+1);
            }else{
                prefixSumCount.put(currentSum, (prefixSumCount.getOrDefault(currentSum,0))+1);
            }
        }
        return result;
    }
}
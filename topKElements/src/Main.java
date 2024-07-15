import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.println(result.toString());
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        Map<Integer, List<Integer>> frequencycountMap = new TreeMap<Integer, List<Integer>>(Collections.reverseOrder());
        for (int i : nums) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        for (int i : frequencyMap.keySet()) {
            if (frequencycountMap.containsKey(frequencyMap.get(i))) {
                frequencycountMap.get(frequencyMap.get(i)).add(i);
            } else {
                frequencycountMap.put(frequencyMap.get(i), new ArrayList<Integer>());
                frequencycountMap.get(frequencyMap.get(i)).add(i);
            }
        }
        int resultLength = 0;
        for (int i : frequencycountMap.keySet()) {
            for (int j = 0; j < frequencycountMap.get(i).size(); j++) {
                if (resultLength == k) {
                    return result;
                }
                result[resultLength++] = frequencycountMap.get(i).get(j);
            }
        }
        return result;
    }
}

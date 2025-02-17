import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElement {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] nums = {7, 10, 4, 3, 20, 15};
        findSmallestKElements(pq, nums, 3);

    }

    private static void findSmallestKElements(PriorityQueue pq, int[] nums, int k) {
        for(int n : nums) {
            pq.add(n);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println(new ArrayList<>(pq));
    }
}

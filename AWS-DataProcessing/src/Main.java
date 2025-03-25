import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] data = new int[100000];
        Arrays.fill(data, 10);
        int K = 100;
        System.out.println(minProcessingTime(data, K));
    }

    public static int minProcessingTime(int[] data, int K) {
        // Implement logic here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(K);

        for (int datum : data) {
            if (minHeap.size() < K) {
                minHeap.add(datum);
            } else {
                Integer min = minHeap.poll();
                minHeap.add(min + datum);
            }
        }
        int maxTime = 0;
        for (int load : minHeap) {
            maxTime = Math.max(maxTime, load);
        }
        return maxTime;
    }
}
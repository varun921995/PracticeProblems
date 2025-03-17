import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
// Optimize Server Allocation
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int n = 3;
        Integer[] tasks = {5, 5, 5, 5, 5};
        System.out.println(calculateMinimumMaximumTime(n, tasks));
    }

    private static int calculateMinimumMaximumTime(int n, Integer[] tasks) {

        Arrays.sort(tasks, Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>(n);
        int i = 0;
        while(i<=tasks.length-1){
            if(pq.size()<n){
                pq.add(tasks[i]);
                i++;
                continue;
            }
            int availableServer = pq.poll();
            availableServer += tasks[i];
            pq.add(availableServer);
            i++;
        }
        int maxFinishTime = 0;
        maxFinishTime = Math.max(maxFinishTime, pq.poll());
        return pq.isEmpty() ? 0 : (int) pq.toArray()[pq.size()-1];
    }

}
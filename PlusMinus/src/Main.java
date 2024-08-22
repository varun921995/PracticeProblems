import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> arr = Arrays.asList(0, 100, 35, 0, 94, 40, 42, 87, 59, 0);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        Map<Integer,Integer> count = new HashMap<>();

        for (int i : arr){
            if(i < 0 ){
                count.put(-1, count.getOrDefault(-1,0)+1);
            }else if(i > 0 ){
                count.put(1, count.getOrDefault(1,0)+1);

            }else{
                count.put(0, count.getOrDefault(0,0)+1);
            }

        }
        System.out.printf("%.6f%n",(double) count.getOrDefault(1,0)/arr.size());
        System.out.printf("%.6f%n",(double) count.getOrDefault(-1,0)/arr.size());
        System.out.printf("%.6f%n",(double) count.getOrDefault(0,0)/arr.size());
    }
}
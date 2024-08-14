import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> scores = new ArrayList<>(Arrays.asList( 3,4,21,36, 10, 28, 35, 5, 24, 42));
        System.out.println(breakingRecords(scores).toString());
    }


    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        int max = scores.get(0);
        int min = scores.get(0);
        int maxCount = 0;
        int minCount = 0;
        for (int score : scores){
            if(score > max){
                max = score;
                maxCount++;
            }
            if(score < min){
                min = score;
                minCount++;
            }
        }
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
}
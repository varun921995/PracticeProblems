import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> timepoints = Arrays.asList("12:12","00:13");
        findMinDifference(timepoints);
    }

    public static int findMinDifference(List<String> timePoints) {
        List<Integer> numericTimePoint = new ArrayList<>();
        for (String timepoint : timePoints) {
            numericTimePoint.add(timeInMinutes(timepoint));
        }

        Collections.sort(numericTimePoint);
        int result = 24*60 - numericTimePoint.get(numericTimePoint.size()-1) + numericTimePoint.get(0);
        for (int i = 0; i < numericTimePoint.size()-1; i++) {
            int current = numericTimePoint.get(i+1);
            int previous = numericTimePoint.get(i);
            int difference = current - previous;
            result = Math.min(result,difference);
            if(result == 0){
                return 0;
            }
        }
        return result;
    }

    public static int timeInMinutes(String timepoint){
        int timeInMinutes = 0;
        Integer[] intValue = Arrays.stream(timepoint.split(":")).map(Integer::valueOf).toArray(Integer[]::new);
       return intValue[1] + intValue[0] * 60;
    }
}
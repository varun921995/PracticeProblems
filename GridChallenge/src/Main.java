import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> grid = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
        gridChallenge(grid);

    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        List<char[]> charArray = new ArrayList<>();
        for (String  s : grid){
            char []arr = s.toCharArray();
            Arrays.sort(arr);
            charArray.add(arr);
        }

        for (int j = 0; j < charArray.get(0).length ; j++) {
            for (int k = 0; k < charArray.size()-1; k++) {
                System.out.println();
                System.out.println(charArray.get(k+1)[j]);
                if(charArray.get(k)[j] > charArray.get(k+1)[j] ){
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
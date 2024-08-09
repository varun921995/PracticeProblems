import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int s = 7; int t = 10; int a = 4; int b = 12;
        List<Integer> m = Arrays.asList(2,3,-4);
        List<Integer> n = Arrays.asList(3,-2,-4);
        countApplesAndOranges(s,t,a,b,m,n);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appleCount = 0;
        int orangeCount = 0;
        for (int i = 0; i < apples.size(); i++) {
            if((apples.get(i)+a) < s || (apples.get(i)+a)>t){
                continue;
            }
            appleCount++;
        }
        for (int i = 0; i < oranges.size(); i++) {
            if((oranges.get(i)+b) < s || (oranges.get(i)+b)>t){
                continue;
            }
            orangeCount++;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

}
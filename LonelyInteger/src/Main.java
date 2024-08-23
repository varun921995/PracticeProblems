import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> arr = Arrays.asList(1,2,3,4,3,2,1);
        System.out.println(lonelyinteger(arr));

    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int start = 0;
        int end = a.size()-1;
        List<Integer> result = new ArrayList<>();
        while(start<a.size()){
            if(result.contains(a.get(start))){
                result.remove(a.get(start));
            }
            else{
                result.add(a.get(start));
            }
            start++;
        }
        return result.get(0);
    }
}
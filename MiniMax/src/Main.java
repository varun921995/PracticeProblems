import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> arr = Arrays.asList(769082435, 210437958, 673982045, 375809214, 380564127
        );
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long sum = 0;
        for(long i : arr){
            sum += i;
        }


       System.out.println(String.valueOf(sum - (long)arr.get(arr.size()-1)) + " "+ String.valueOf(sum - (long)arr.get(0)) ) ;
    }
}
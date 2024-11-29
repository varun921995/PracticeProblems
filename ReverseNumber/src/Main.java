import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverse(123));

    }

    public static int reverse(int x) {
        try{
            if (x == 0) return 0;
            boolean isNegative = x<0;
            if(isNegative){
                x = x* -1;
            }
            while(x%10 == 0){
                x = x/10;
            }
            char[] number = String.valueOf(x).toCharArray();
            int left = 0, right = number.length-1;
            while(left<right){
                char a = number[left];
                number[left] = number[right];
                number[right] = a;
                left++;
                right--;
            }
            String r = new String(number);
            if(isNegative){
                x = Integer.parseInt(r) * -1;
                return x;
            }
            return Integer.parseInt(r) ;
        }catch (Exception ex){
            return 0;
        }

    }
}
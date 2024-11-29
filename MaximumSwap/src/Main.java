import java.util.Arrays;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        System.out.println( maximumSwap(98368));
    }

    public static int maximumSwap(int num) {
        String[] s = String.valueOf(num).split("");
        int currentMaxIndex = s.length - 1;
        int[] maxIndex = new int[s.length] ;
         maxIndex[s.length-1] = s.length - 1;
        for (int i = s.length-1; i >= 0 ; i--) {
           if(Integer.parseInt(s[i]) > Integer.parseInt(s[currentMaxIndex])){
               currentMaxIndex = i;
               maxIndex[i] = currentMaxIndex;
           }else{
               maxIndex[i] = currentMaxIndex;
           }
        }
        for (int i =0; i < s.length ; ++i) {
            if(Integer.parseInt(s[maxIndex[i]]) > Integer.parseInt(s[i])){
             String temp  = s[maxIndex[i]];
             s[maxIndex[i]] = s[i];
             s[i] = temp;
             break;
            }
        }
        return Integer.parseInt(String.join("", s));

    }
}
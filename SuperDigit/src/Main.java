import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        String content = new String(Files.readAllBytes(Paths.get("SuperDigit/src/test.txt")));
        superDigit(content, 100000);
    }

    public static int superDigit(String n, int k) {
        // Write your code here
        long superNumber = 0;
        int start = 0;
        int end = n.length() -1;
        String[] values = n.split("");
        while(start < end){
            superNumber += Integer.parseInt(values[start]);
            superNumber += Integer.parseInt(values[end]);
            start++;
            end--;
        }
        if(start == end){
            superNumber += Integer.parseInt(values[start]);
        }
        superNumber = superNumber *k;
        while(superNumber/10!=0){
           superNumber = sumOfDigits(superNumber);
        }
        return (int) superNumber;

    }

    private static long sumOfDigits(long superNumber) {
        long sum = 0;
        while(superNumber !=0){
            long d = superNumber % 10;
            sum  += d;
            superNumber = superNumber  /10;
        }
        return sum;
    }
}
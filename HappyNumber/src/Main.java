import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }


        public static boolean isHappy(int n) {
            Set<Integer> visited = new HashSet<>();
            while(!visited.contains(n)){
                visited.add(n);
                n = sumOfSquare(n);
                if(n  == 1){
                    return true;
                }

            }
            return false;
        }

        private static int sumOfSquare(int n) {
            int sum = 0;
            while(n !=0){
                int d = n % 10;
                sum = sum + (d*d);
                n = n  /10;
            }
            return sum;
        }

}
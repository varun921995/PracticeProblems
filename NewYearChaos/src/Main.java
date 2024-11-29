import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> q = Arrays.asList(1,2,5,3,7,8,6,4);
        minimumBribes(q);
    }

    private static void minimumBribes(List<Integer> q) {
        int bribe = 0;

        for (int i = 0; i < q.size(); i++) {
            int diff = q.get(i) -i;
            if(diff <= 3){
                if(diff <= 1){
                    continue;
                }
                bribe += q.get(i) -i -1;
            }else{
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println( bribe);
    }

//    public static void minimumBribes(List<Integer> q) {
//        // Write your code here
//       int bribe =  0 ;
//        for (int i = q.size() -1; i >=0 ; i--) {
//            if(q.get(i) != i+1){
//                if(q.get(i-1) == i+1){
//                    bribe += 1;
//                    int temp = q.get(i-1);
//                    q.set(i-1,q.get(i));
//                    q.set(i, temp);
//                }else if(q.get(i-2) == i+1){
//                    bribe += 2;
//                    int temp = q.get(i-2);
//                    q.set(i-2, q.get(i-1));
//                    q.set(i-1, q.get(i));
//                    q.set(i, temp);
//                }else{
//                    System.out.println("Too chaotic");
//                    return;
//                }
//            }
//        }
//        System.out.println(bribe);
//    }
}
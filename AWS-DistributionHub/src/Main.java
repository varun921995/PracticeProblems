import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int n = 2;
        List<Integer> warehouseCapacity = Arrays.asList(1, 2);
        List<List<Integer>> queries = Arrays.asList(
               // Arrays.asList(5, 8),
                Arrays.asList(1,2)
        );

        List<Integer> results = processQueries(n, warehouseCapacity, queries);
    }

    public static List<Integer> processQueries(int n, List<Integer> warehouseCapacity, List<List<Integer>> queries) {

        List<Integer> results = new ArrayList<>();

        for (List<Integer> query : queries) {
            int l = warehouseCapacity.size()-1;
            int r = Integer.MAX_VALUE;
            int cost = 0;
            while(l>=0){
                if(isDH(l,query,n)){
                    r=l;
                }
                cost = cost + (warehouseCapacity.get(r)-warehouseCapacity.get(l));
                l--;
            }
            results.add(cost);
        }

        return results;
    }

    public static boolean isDH(int currentIndex, List<Integer> query,int numberOfWarehouse){
        return query.contains(currentIndex+1) || currentIndex+1==numberOfWarehouse;
    }

}
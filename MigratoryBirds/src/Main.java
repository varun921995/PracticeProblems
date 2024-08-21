import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> arr = Arrays.asList(1,2,3,4,5,4,3,2,1,3,4);
        migratoryBirds(arr);
    }

    public static void migratoryBirds(List<Integer> arr) {

        Map<Integer,Integer> birdsCount = new HashMap<>();
        for(int i : arr){
            if(birdsCount.containsKey(i)){
                birdsCount.put(i, birdsCount.get(i) + 1);
            }
            else{
                birdsCount.put(i,1);
            }
        }
        TreeMap<Integer, Integer> resultSet = new TreeMap<>();
        for(int j : birdsCount.keySet()){
            if(resultSet.containsKey(birdsCount.get(j))){
                if(resultSet.get(birdsCount.get(j)) > j){
                    resultSet.put(birdsCount.get(j), j );
                }
            }else{
                resultSet.put(birdsCount.get(j), j);
            }
        }

        System.out.println( resultSet.lastEntry());
    }
}
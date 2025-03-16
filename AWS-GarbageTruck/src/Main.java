import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] garbage = {"GGG", "GG", "G"};
        int[] travel = {2, 3};
        System.out.println(totalGarbageCollectionTime(garbage, travel));
    }

    public static int totalGarbageCollectionTime(String[] garbage, int[] travel) {
        // Your code goes here
        int result = 0;
        int Gtruck = 0;
        int Mtruck = 0;
        int Ptruck = 0;
        Set<Character> truckSet = new HashSet<Character>();
        int travelPoint = travel.length-1;
        for(int i = garbage.length - 1; i >= 0; i--) {
            Map<Character, Long> garbageType = garbage[i].chars() // Convert string to IntStream of characters
                    .mapToObj(c -> (char) c) // Convert int back to Character
                    .collect(Collectors.groupingBy(
                            c -> c, // Group by the character itself
                            Collectors.counting() // Count occurrences
                    ));
            if(garbageType.containsKey('G') || truckSet.contains('G')) {
                Gtruck = garbageType.containsKey('G') ? (int) (Gtruck + garbageType.get('G')) : Gtruck;
                truckSet.add('G');
                if(truckSet.contains('G')){
                    Gtruck = travelPoint >= 0 ? Gtruck+travel[travelPoint] : Gtruck;
                }

            }
            if(garbageType.containsKey('M') || truckSet.contains('M')) {
                Mtruck = garbageType.containsKey('M') ? (int) (Mtruck + garbageType.get('M')) : Mtruck;
                truckSet.add('M');
                if(truckSet.contains('M')){
                    Mtruck = travelPoint >= 0 ? Mtruck+travel[travelPoint] : Mtruck;
                }

            }
            if(garbageType.containsKey('P') || truckSet.contains('P')) {
                Ptruck = garbageType.containsKey('P') ? (int) (Ptruck + garbageType.get('P')) : Ptruck;
                truckSet.add('P');
                if(truckSet.contains('P')){
                    Ptruck = travelPoint >= 0 ? Ptruck+travel[travelPoint] : Ptruck;
                }

            }
            travelPoint--;

        }
        return Gtruck+Mtruck+Ptruck;
    }
}
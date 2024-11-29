package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked Hash Map usage");

        Map<String, String> linkedHashMap = new LinkedHashMap<>(6,0.75f,true);


        linkedHashMap.put("1","Hello");
        linkedHashMap.put("2","Varun");
        linkedHashMap.put("3","How");
        linkedHashMap.put("4","are");
        linkedHashMap.put("5","you");
        linkedHashMap.get("3");
        linkedHashMap.put("6", "I");
        linkedHashMap.put("7","am");

        System.out.println(linkedHashMap.toString());
    }


}
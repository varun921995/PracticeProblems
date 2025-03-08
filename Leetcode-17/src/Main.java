import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        letterCombinations("");
    }

    public static List<String> letterCombinations(String digits) {
        if(digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        int index =0;
        StringBuilder combination = new StringBuilder();
        Map<Integer,String> letterMap = Map.of(
            2, "abc",
            3 , "def",
            4 , "ghi",
            5 , "jkl",
            6, "mno",
            7,"pqrs",
            8 , "tuv",
            9 , "wxyz"
        );
        List<String> result = new ArrayList<>();
        getCombination(digits, index, combination, letterMap, result);
        System.out.println(result);
        return result;
    }

    private static void getCombination(String digits, int index, StringBuilder combination, Map<Integer, String> letterMap, List<String> result) {
        if(index == digits.length()) {
            result.add(combination.toString());
            return;
        }
        Integer digit = Integer.parseInt(String.valueOf(digits.charAt(index)));
        for (char c : letterMap.get(digit).toCharArray()){
            combination.append(c);
            getCombination(digits, index + 1, combination, letterMap, result);
            combination.deleteCharAt(combination.length()-1);
        }

    }
}
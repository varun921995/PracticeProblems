import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String words[] = new String[] { "bella", "label", "roller" };
        commonChars(words);
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<String>();
        char[] firstWordCharArr = words[0].toCharArray();
        Map<Character, Integer> charCountMap = characterCounter(firstWordCharArr);

        for (String s : words) {
            Map<Character, Integer> frequency = characterCounter(s.toCharArray());
            for (char c : charCountMap.keySet()) {
                charCountMap.put(c, Math.min(charCountMap.get(c), frequency.getOrDefault(c, 0)));
            }
        }
        for (char c : charCountMap.keySet()) {
            for (int i = 0; i < charCountMap.get(c); i++) {
                result.add(c + "");
            }
        }
        return result;

    }

    public static Map<Character, Integer> characterCounter(char[] charArray) {
        Map<Character, Integer> charFrequencyMap = new HashMap<Character, Integer>();
        for (char c : charArray) {
            if (charFrequencyMap.containsKey(c)) {

                charFrequencyMap.put(c, charFrequencyMap.get(c) + 1);
            } else {
                charFrequencyMap.put(c, 1);
            }

        }
        return charFrequencyMap;

    }
}

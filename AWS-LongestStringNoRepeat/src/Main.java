import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s = "abcbed";
        String result = longestSubStringNoRepeatation(s);
        System.out.println(result);
    }

    private static String longestSubStringNoRepeatation(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLen = 0;
        int start = 0;

        while (right < s.length()) {
            char current = s.charAt(right);
            if (!set.contains(current)) {
                set.add(current);
                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    start = left;
                }
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}
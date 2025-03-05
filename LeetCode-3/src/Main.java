import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println( lengthOfLongestSubstring("abcddefgh"));

    }

    public static int lengthOfLongestSubstring(String s) {
        Queue<String> queue = new LinkedList<>();
       int maxLength = 0;
        for(char c : s.toCharArray()){
            if(queue.contains(String.valueOf(c))){
                maxLength = Math.max(maxLength, queue.size());
                while(queue.contains(String.valueOf(c))){
                  queue.remove();
                }
            }
            queue.add(String.valueOf(c));
        }
        return Math.max(maxLength, queue.size());

    }
}
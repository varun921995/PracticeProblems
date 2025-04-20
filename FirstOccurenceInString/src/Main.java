import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(strStr("mississippi","ababc"));
    }

    public static int strStr(String haystack, String needle) {
        //calculate LPS
       List<Integer> LPS =  calculateLSP(needle);

       return 0;
    }

    private static List<Integer> calculateLSP(String needle) {

        List<Integer> list = new ArrayList<>();
        list.add(0);
        int len = 0;
        int j = 1;
        while (j < needle.length()) {
            if(needle.charAt(j) == needle.charAt(len)) {
                list.add(++len);
                j++;
            }else{
                if(len == 0) {
                    list.add(0);
                    j++;
                }else{
                    len = list.get(len - 1);
                }
            }
        }
        return list;
    }
}
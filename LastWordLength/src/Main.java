//https://leetcode.com/problems/length-of-last-word/submissions/1356971661/


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "   fly me   to   the moon  ";
        lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {

        int l = s.length() - 1;
        char[] c = s.toCharArray();
        int result = 0 ;
        while(l >= 0){
            if(c[l] == ' '){
                if(result !=0){
                    break;
                }
                l--;
                continue;
            }
            result++;
            l--;
        }
        return result;
    }

}
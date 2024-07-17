public class Main {
    public static void main(String[] args) {
        char[] charArray = new char[] { 'h', 'e', 'l', 'l', 'o' };
        reverseString(charArray);
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s.toString());
    }
}

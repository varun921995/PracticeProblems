public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            int j = 0;
            StringBuilder result = new StringBuilder();
            while(j < s.length() && j < sb.length()) {
                if(s.charAt(j) == sb.toString().charAt(j)) {
                    result.append(sb.charAt(j));
                    j++;
                }else{
                    break;
                }

            }
            sb = result;

        }
        return sb.toString();

    }

}
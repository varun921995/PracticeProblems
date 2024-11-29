public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(myAtoi(" -1-3   "));
    }

    public static int myAtoi(String s) {
        // 0. remove leading whitespaces
        s= s.trim();
        // 1. check if string empty.
        if (s.isEmpty()) {
            return 0;
        }
        // 2. Check if sign exists;
        char[] testString = s.toCharArray();
        boolean isNegative = !Character.isDigit(testString[0]) && testString[0] == '-';
        int i = 0;

        StringBuilder sb = new StringBuilder();
        while(i < testString.length){
            if(i==0 && (testString[i] == '-' || testString[i] == '+')){
                i++;
                continue;
            }
            if(Character.isDigit(testString[i])){
                sb.append(testString[i]);
                i++;
            }else{
               break;
            }
        }
        if(sb.isEmpty()){
            return 0;
        }try{
            if(isNegative){
                return Integer.parseInt(sb.toString()) * -1;
            }
            return Integer.parseInt(sb.toString());
        }catch (NumberFormatException exception) {
            if (isNegative) {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(myAtoi("+01"));
    }

    public static int myAtoi(String s) {
        if((s.isEmpty())){
            return 0;
        }
        char[] testString = s.toCharArray();
        boolean isWhitespace = false;
        int i = 0;
        while (i < testString.length) {
            if (testString[i] == ' ') {
                i++;
            } else {
                break;
            }
        }
        boolean isNegative = false;
        if(testString[i] == '-'){
            isNegative = true;
            i++;
        }else if(testString[i] == '+'){
            isNegative = false;
            i++;
        }
        while (i < testString.length) {
            if (testString[i] == '0') {
                i++;
            } else {
                break;
            }
        }
        StringBuffer sb = new StringBuffer();
        while (i < testString.length) {
            if (Character.isDigit(testString[i])) {
                sb.append(testString[i]);
                i++;
            } else {
                break;
            }
        }
        if(sb.isEmpty()){
            return 0;
        }
        try{
            int d = Integer.parseInt(sb.toString());
            if(isNegative){
                return  (int)d  * -1;
            }
            return (int)d;
        }catch (NumberFormatException exception){
            if(isNegative){
                return Integer.MIN_VALUE;
            }
            return  Integer.MAX_VALUE;

        }


    }
}
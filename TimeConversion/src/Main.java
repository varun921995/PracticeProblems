public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String time = "07:05:45PM";
        timeConversion(time);

    }

    public static String timeConversion(String s) {
       char t = s.charAt(s.length() - 2);
        System.out.println(t);
        StringBuffer sb = new StringBuffer();
        if(t == 'P'){
            if(s.startsWith("12")){
                sb.append(s,0,s.length()-2);
            }else{
                int hour = Integer.parseInt(s.substring(0,2));
                hour = hour + 12;
                sb.append(String.valueOf(hour) );
                sb.append(s, 2, s.length()-2);
            }
        }else{
            if(s.startsWith("12")){
                sb.append("00");
                sb.append(s, 2, s.length()-2);
            }else{
                sb.append(s,0,s.length()-2);
            }
        }

        return sb.toString();
    }
}
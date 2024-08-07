public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] garbage = new String[]{"G","P","GP","GG"};
        int[] travel = new int[]{2,4,3};
        System.out.println(garbageCollection(garbage, travel));
    }

    public static int garbageCollection(String[] garbage, int[] travel) {

        int m=0,p=0,g=0;
        boolean fm=false,fp=false, fg=false;
        for(int i=garbage.length-1;i>=0;i--){
            String s=garbage[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='M'){
                    m++;
                    fm=true;
                }
                else if(s.charAt(j)=='P'){
                    p++;
                    fp=true;
                }else{
                    g++;
                    fg=true;
                }
            }
            if(i>0){
                if(fm) m+=travel[i-1];
                if(fp) p+=travel[i-1];
                if(fg) g+=travel[i-1];
            }
        }
        return m+p+g;

    }
}
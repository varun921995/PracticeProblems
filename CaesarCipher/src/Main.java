public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String message = "!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U";
        caesarCipher(message,62);
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        k = k % 26;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            int i = 0;
            if (c >= 65 && c <= 90){
               i = c+k;
                if(i > 90){
                    i = i - 26;
                }
                sb.append((char)i);
                continue;
            }
            if(c>= 97 && c<= 122){
                i = c+k;
                if(i > 122){
                    i = i - 26;
                }
                sb.append((char)i);
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}

// !w-bL`-yX!.a`mVKmFlX/MaCyyvSS!CSwts.!g/`be`edk1DaZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E
// !w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E
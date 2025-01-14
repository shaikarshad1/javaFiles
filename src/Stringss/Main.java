package Stringss;

public class Main {
    static String rr="";
    public static void main(String[] args) {
        String res="";
        res=removeAlpha('a',"achandua","");
        System.out.println(res);
        removeAlpha1("achandua");
        System.out.println(rr);

    }

    static String removeAlpha(char c,String org,String res) {
        if (org.isEmpty()) {
            return "";
        }
        if (org.charAt(0) == c) {
            return removeAlpha(c, org.substring(1), res);
        } else {
            return res + org.charAt(0) + removeAlpha(c, org.substring(1), res);
        }
    }
        static void removeAlpha1(String org) {
            if (org.isEmpty()) {
                return ;
            }
            if (org.charAt(0) == 'a') {
                removeAlpha1(org.substring(1));
            } else {
               rr= rr + org.charAt(0) ;
                removeAlpha1(org.substring(1));
            }
        }


}

package aBasics;

public class Plaindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(plaindrome(s));
    }

    private static boolean plaindrome(String s) {
        int len=s.length()-1;
        if(s.isEmpty() || s.length()==1){
            return true;
        }
        if(s.charAt(0)==s.charAt(len)){
           return plaindrome(s.substring(1,len));
        }

        return false;
    }
}

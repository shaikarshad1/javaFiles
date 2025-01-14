package Stringss;

public class DupCount {
    public static void main(String[] args) {
        String a="aaabbcc";
        String b=""+a.charAt(0);
        int c=1;
        for(int i=1;i<a.length();i++){
            String d=""+a.charAt(i);
            if(b.contains(d)){
                c+=1;
            }else{
                b+=""+c+a.charAt(i);
                c=1;
            }
        }
        b+=c;
        System.out.println(b);
        System.out.println(c);
    }
}

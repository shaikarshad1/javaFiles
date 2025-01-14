package Stringss;

import java.util.ArrayList;
import java.util.List;

public class PermString {
    public static void main(String[] args) {
        String og="abc",res="";
        List<String> bb=new ArrayList<>();
//        perms(og,"",bb);
        for(int i=0;i<og.length();i++){
            res=res+og.charAt(i);
            String a=""+og.charAt(i);
            String b=""+og.charAt(i);
            for(int j=0;j<og.length();j++){
                System.out.println(""+og.charAt(j));
                String ss=og.charAt(j)+"";
                if(!res.equals(ss)){
                    a=a+og.charAt(j);
                    b= og.charAt(j)+b;
                }

            }
            if(!bb.contains(a)){
            bb.add(a);}
            if(!bb.contains(b)){
            bb.add(b);}
            res="";

        }
        System.out.println(bb);
    }

    private static void perms(String og, String s, List<String> bb) {
        if(og.isEmpty()){
            if(bb.contains(s)){
                return;
            }
            bb.add(s);
            System.out.println(s);
            return;
        }
        perms(og.substring(1),s+og.charAt(0),bb);
        perms(og.substring(1),og.charAt(0)+s,bb);

    }
}

package Stringss;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PalnSubS {
    public static void main(String[] args) {
        String s="cbbd";
        System.out.println(s.charAt(s.length()-1));
        System.out.println(perm("",s).stream().max(Comparator.comparing(String::length)));
    }

    static List<String> perm(String p, String up){
//        int i,j;
        if(up.isEmpty()){
            System.out.println(p);
            int i=0,j=p.length()-1;
            List<String> dd=new ArrayList<>();
            while(i<j){
                if(p.charAt(i)!=p.charAt(j)){
                    break;
                }
                i++;
                j--;
            }
            if(i>=j){

                dd.add(p);
                return dd;
            }
            return dd;
        }
//        up.s
        List<String> first= perm(p+up.charAt(0),up.substring(1));
        List<String> second=  perm(p+up.charAt(up.length()-1),up.substring(0,up.length()-1));
        first.addAll(second);
        return first;
    }
}

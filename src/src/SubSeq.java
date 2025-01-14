package src;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {

    public static void main(String[] args) {
       System.out.println(subslist("abc",""));
    }

    static List<String> subslist(String s,String p){

        if(s.length()==0){
            List<String> l=new ArrayList<>();
            l.add(p);

             return l;
        }
        char c=s.charAt(0);
        List<String> left=subslist(s.substring(1),p+c);
        List<String> right=subslist(s.substring(1),p);
         left.addAll(right);
        return left;
    }

    static void subs(String s,String p){

        if(s.isEmpty()){
            System.out.println(p);
            return ;
        }
        char c=s.charAt(0);
        subs(s.substring(1),p+c);
        subs(s.substring(1),p);
    }
}

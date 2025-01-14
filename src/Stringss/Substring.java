package Stringss;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Substring {

	public static void main(String[] args) {
        String s="abbcccbbbcaaccbababcbcabca";
        System.out.println(s.charAt(s.length()-1));
        System.out.println(perm(s));
        System.out.println(perm(s).stream().max(Comparator.comparing(String::length)));
    }

    static List<String> perm(String up){
//        int i,j;
       
            int i=0,j=up.length()-1;
            List<String> dd=new ArrayList<>();
            while(i<=j){
                if(up.charAt(i)!=up.charAt(j)){
                    break;
                }
                i++;
                j--;
            }
            if(i>=j){

                dd.add(up);
                return dd;}
            
           
        
//        up.s
        List<String> first= perm(up.substring(1));
        List<String> second=  perm(up.substring(0,up.length()-1));
        first.addAll(second);
        return first;
    }
	
	

}

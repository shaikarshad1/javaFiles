package subSequences;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubseqPract {

    public static void main(String[] args) {
        String[] dd={"amazon","apple","facebook","google","leetcode"};
        String[] dd1={"l","e"};
        List<String> dfs=new ArrayList<>();
//        for (int i=0;i<dd1.length;i++){
//            for(int j=0;j<dd.length;j++){
//                if(!ds(dd[j],"",dd1[i])){
//                    dd[j]="";
//                }
//            }
//        }
//
//        for(int i=0;i<dd.length;i++){
//            if(!dd[i].isEmpty()){
//                dfs.add(dd[i]);
//            }
//        }
        ds("google","","m");
        System.out.println(dfs);

    }
     static boolean ds(String up,String p,String t){
         if(Objects.equals(p, t)){
             System.out.println(p);
             return true;
         }
        if(up.isEmpty()){
            System.out.println(p);
            return false;
        }

        return ds(up.substring(1),p,t) || ds(up.substring(1),p+up.charAt(0),t);


     }
}

package sort;

import java.util.*;

public class MaximumCountSort {
    public static void main(String[] args) {
        int[] n={-1,-1,-1};int max=n[0];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<n.length;i++){
            if(n[i]>max){
                max=n[i];
            }
        }

        List<Integer> re=new ArrayList<>();
        int[] co=new int[max+1];

        for(int i=0;i<n.length;i++){
            map.put(n[i],map.getOrDefault(n[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
           if(entry.getValue()>Math.ceil(n.length/3)){
               re.add(entry.getKey());
           }
        }
//        if(c>Math.ceil(n.length/3)){
//
//            re.add(n[n.length-1]);
//        }
//        return re;
        System.out.println(Arrays.toString(co));
        System.out.println(re);
    }
}

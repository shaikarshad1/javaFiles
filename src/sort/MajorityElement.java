package sort;

import java.util.ArrayList;
import java.util.List;

class MajorityElement {
    public static void main(String[] args) {
        MajorityElement m=new MajorityElement();
        int[] n={3,2,3};
        System.out.println(m.majorityElement(n));

    }
    public static List<Integer> majorityElement(int[] n) {
        List<Integer> re=new ArrayList<>();
        int c=1,index=n[0],max=0;
        if(n.length==1){
            re.add(n[0]);
            return re;
        }
        int last=n.length-1,j=0,k=2;
        while(j<last){
            for (int i = 0; i <=last; i++) {
                if (n[i] > n[max]) {
                    max = i;
                }
            }
            int temp=n[last];
            n[last]=n[max];
            n[max]=temp;
            last--;
            j++;

        }

        for(int i=1;i<n.length;i++){
            if(n[i-1]==n[i]){
                c++;
            }else {if(c>Math.ceil(n.length/3)){


                re.add(n[i-1]);}

                c=1;
            }
        }
        if(c>Math.ceil(n.length/2)){

            re.add(n[n.length-1]);
        }
        return re;

    }
}
package sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] n={1,2,0};
        int i=0,j=n.length-1;
        while(i<=j){
            if(n[i]==i){
                i=i+1;
            } else if (n[i]>n.length) {

            }
//            else if(n[i]>j){
//                int temp=n[i];
//               int last= n[j];
//                n[j]=temp;
//                n[i]=last;
////                i++;
//            }
            else{

                int temp=n[i];

//                if(n[temp]==temp){
//                    i++;
//                }else{

                n[i]=n[temp];
                n[temp]=temp;
            }

//            if(n[i]>n.length-1){
//
//                i=i+1;
//                int temp=n[i];
//                n[i]=n[temp-1];
//                n[temp-1]=temp;
//            }
//            if(n[i]==i ){
//                i=i+1;
//            }else{
//                int temp=n[i];
//                 n[i]=n[temp-1];
//                 n[temp-1]=temp;
//            }
        }
        System.out.println(Arrays.toString(n));
//        for(i=0;i<=j;i++){
//            if(n[i]<=0){
//                System.out.println( n[i]);
//
//            }
//        }
        int k=1;
        i=0;
        while(i<=j){
            if(n[i]<=0) {
                i++;
            }else if(n[i]!=k){
                System.out.println(k);
                break;
            }
            else {
                i++;
                k++;
            }
        }
        System.out.println(k);
    }
}

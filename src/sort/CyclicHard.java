package sort;

import java.util.Arrays;

public class CyclicHard {
    public static void main(String[] args) {
        int[] n = {1,1};
        int i=0,j=n.length-1;
        while(i<=j){
            int temp=n[i];
            if(temp==i+1 || temp>j || temp<=0 || (temp!=i+1 && n[temp-1]==temp)){
                i=i+1;
            }
            else{


                n[i]=n[temp-1];
                n[temp-1]=temp;
            }
        }
        System.out.println(Arrays.toString(n));
        for(i=0;i<=j;i++){

            if(n[i]!=i+1){
                System.out.println(i);
            }

        }
        System.out.println( n.length);




//        int[] n = {-1,-2};
//        int i = 0, j = n.length - 1;
//    if(n.length==1){
//        if(n[0]<=0 && n[0]>1){
//            System.out.println(1);
//        }
//        System.out.println(2);
//    }
//        while (i <= j) {
//            if (n[i] == i || (n[i]>j && n[j]==j) || (n[i]>j && n[j]>j)) {
//                i = i + 1;
//            } else if(n[i]>j) {
//                int te = n[i];
//                n[i] = n[j];
//                n[j] = te;
//
//            } else if(n[i]<0){
//                int te=n[i];
//                n[i]=n[0];
//                n[0]=te;
//
//            }
//            else {
//                int te = n[i];
//                n[i] = n[te];
//                n[te] = te;
//
//            }
//        }
//        System.out.println(Arrays.toString(n));
//        i=0;
//        int k=1;
//
//
//
//        while(i<=j){
//            if(n[i]<=0) {
//                i++;
//            }
//            else {
//                int t=n[i];
//                if(t==k && j>i) {
//                    k++;
//                }
//                i++;
//            }
//        }
//        System.out.println(k);
    }
}

//
//        int i=0,j=n.length-1;
//        while(i<=j){
//        if(n[i]==i+1 || n[i]>j ){
//i=i+1;
//        }
//        else{
//int temp=n[i];
//
//n[i]=n[temp];
//n[temp]=temp;
//            }
//                    }
//
//                    for(i=1;i<=j;i++){
//        if(n[i]!=i){
//        return i;
//            }
//
//                    }
//                    return n.length;
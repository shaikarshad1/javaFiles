package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] n={2,0,2,1,1,0};
        int i=0,j=n.length,c=0,index=0,max=0;
        merge(n,0,j);
        System.out.println(Arrays.toString(n));
        for(i=1;i<n.length;i++){
            if(n[i-1]==n[i]){
                c++;
            }
            else{
                if(c>max){
                    max=c;
                    index=n[i];
                }
                c=0;
            }

//            else{
//                index=n[i];
//                c=0;
//            }
        }
    }

    static void merge(int[] n,int s,int e){
        if(e-s==1){
            return;
        }
        int m=(s+e)/2;
        merge(n,s,m);
        merge(n,m,e);
        System.out.println(s +" "+e);
       mergeArray(n,s,e,m);
//       return 0;
    }

    static void mergeArray(int[] n,int n1,int m,int mid){
        int res[]=new int[m-n1];
        int i=n1,j=mid;
        int k=0;
        while(i<mid && j<m) {
            if (n[i]<n[j]) {
                res[k]=n[i];
                k++;
                i++;
            }
           else {
                res[k]=n[j];
                k++;
                j++;
            }
        }

        while(i<mid){
            res[k]=n[i];
            k++;
            i++;
        }

        while(j<m){
            res[k]=n[j];
            k++;
            j++;
        }

        for (i=0;i<res.length;i++){

            n[n1+i]=res[i];
        }


    }
}

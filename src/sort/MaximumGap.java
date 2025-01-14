package sort;

import java.util.Arrays;

class MaximumGap {
    // i64
    public static void main(String[] args) {
        int[] n={15252,16764,27963,7817,26155,20757,3478,22602,20404,6739,16790,10588,16521,6644,20880,15632,27078,25463,20124,15728,30042,16604,17223,4388,23646,32683,23688,12439,30630,3895,7926,22101,32406,21540,31799,3768,26679,21799,23740};
        merge(n,0,n.length);
        int max=0;
        for(int i=1;i<n.length;i++){
            if(n[i]-n[i-1]>max){
                max=n[i]-n[i-1];
                System.out.println(n[i]);
            }
        }
        System.out.println(max);

        System.out.println(Arrays.toString(n));
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
//    public static int maximumGap(int[] nums) {
//        return 0;
//    }
//
//    static void quick(int[] n,int low,int high){
//        if(low>=high){
//            return;
//        }
//        int p=(low+high)/2;
//        int s=low;
//        int e=high;
//        while(s<=e){
//            while (n[s]<n[p]){
//                s++;
//            }
//            while(n[p]<n[e]){
//                e--;
//            }
//
//            if(s<=e){
//                int temp=n[s];
//                n[s]=n[e];
//                n[e]=temp;
//                s++;
//                e--;
//            }}
//        quick(n,low,p-1);
//        quick(n,p+1,high);
//    }
}
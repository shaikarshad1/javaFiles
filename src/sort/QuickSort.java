package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] n={4,1,3,1,3,3,1,2,3,2,4,2,1,4,4,4,4,4};
        quick(n,0,n.length-1);
        System.out.println(Arrays.toString(n));
    }

    static void quick(int[] n,int low,int high){
        if(low>=high){
            return;
        }
        int p=(low+high)/2;
        int s=low;
        int e=high;
        while(s<=e){
        while (n[s]<n[p]){
            s++;
        }
        while(n[p]<n[e]){
            e--;
        }

            if(s<=e){
            int temp=n[s];
            n[s]=n[e];
            n[e]=temp;
            s++;
            e--;
        }}
        quick(n,low,e);
        quick(n,s,high);
    }
}

package search;

import java.util.Arrays;

public class FirstAndLast2 {
    public static void main(String[] args) {
        int[] n={1,2,3,3,3,3,4,5,9};
        int[] r=new int[2];
        int s=0,e=n.length-1,t=3;
        while(s<=e){
            int mid=(s+e)/2;
            if(n[mid]==t){
                r[0]=mid;r[1]=mid;
                minIndex(n,s,mid-1,t,r);
                maxIndex(n,mid+1,e,t,r);
                s=e+1;
            } else if (n[mid]>t) {
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        System.out.println(Arrays.toString(r));
    }

    private static void maxIndex(int[] n, int s, int e,int t,int[] r) {
        while(s<=e){
            int mid=(s+e)/2;
            if(n[mid]==t){
                r[1]=mid;
                s=mid+1;

            } else if (n[mid]>t) {
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
    }

    private static void minIndex(int[] n, int s, int e,int t,int[] r) {
        while(s<=e){
            int mid=(s+e)/2;
            if(n[mid]==t){
                r[0]=mid;
                e=mid-1;

            } else if (n[mid]<t) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
    }
}

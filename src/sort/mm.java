package sort;

import java.util.Arrays;

public class mm {
    public static void main(String[] args) {
        int[] n={2,0,2,1,1,0};
        int s=0,e=n.length;
        merge1(n,s,e);
        System.out.println(Arrays.toString(n));
    }

    private static void merge1(int[] n, int s, int e) {
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        merge1(n,s,mid);
        merge1(n,mid,e);
        mergeArraya(n,s,mid,e);

    }

    private static void mergeArraya(int[] n,int s,int m,int e) {
        int i=s,j=m,k=0;
        int[] re=new int[e-s];
        while(k<re.length){
            while (i<m && j<e){
                if(n[i]<n[j]){
                    re[k]=n[i];
                    i++;
                } else {
                    re[k]=n[j];
                    j++;
                }
                k++;
            }
            while (i<m){
                re[k]=n[i];
                i++;
                k++;
            }
            while (j<e){
                re[k]=n[j];
                j++;
                k++;
            }

        }
        for (i=0;i<re.length;i++){

            n[s+i]=re[i];
        }
    }
}

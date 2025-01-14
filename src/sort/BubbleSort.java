package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] n={3,1,5,4,2};
        int last=n.length-1,i=0,j=1;
        while(i<last){
            while(j<=last){
                if(n[i]>n[j]){
                    int temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
                i++;j++;
            }
            last--;
            i=0;j=1;
            System.out.println(Arrays.toString(n));
        }
        System.out.println(Arrays.toString(n));
    }
}

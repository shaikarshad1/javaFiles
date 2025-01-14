package sort;

import java.util.Arrays;
import java.util.List;

public class InseartionSort {
    public static void main(String[] args) {
        int[] n={1,2,3,4,5};
        int i=0,j=0;
        while(i<=n.length-2){
            j=i+1;
            while(j>0){
                if(n[j-1]>n[j]){
                    int temp=n[j];
                    n[j]=n[j-1];
                    n[j-1]=temp;
                    j--;

                }else {

                    break;
                }
            }
            i++;

        }

        List.of(n);


        System.out.println(Arrays.toString(n));
    }
}

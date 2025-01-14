package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] n={4,5,4};
        int last=n.length-1,max=0,j=0,k=2;
        while(j<=last){
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
        System.out.println(n[max]);

        System.out.println(Arrays.toString(n));
    }
    }


package Trees;

import java.util.Arrays;

public class SecondMain {
    public static void main(String[] args) {
        int[] arr={8798794,93,77,-1,0,-5};

        for(int i=0;i<arr.length-1;i++){


            int last=arr.length-i-1;
            int maxIndex=dsdds(arr,last);
            swap(arr,maxIndex,last);


//            last--;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static int dsdds(int[] arr,int la){
        int max=arr[0],maxIndex=0;
        for(int j=1;j< la;j++) {
            if (arr[j] > max) {
                maxIndex = j;
            }
        }
        return maxIndex;
    }

    public static void swap(int[] arr,int first,int last){
        int temp=arr[last];
        arr[last]=arr[first];

        arr[first]=temp;
    }
}

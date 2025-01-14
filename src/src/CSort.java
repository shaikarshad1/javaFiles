package src;

import java.util.ArrayList;
import java.util.Arrays;

public class CSort {
    static int sum=0;
    public static void main(String[] args) {
//        int[] arr={3,5,2,1,4};
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=i+1){
//                int index=arr[i];
//                int temp=arr[index-1];
//                arr[index-1]=index;
//                arr[i]=temp;
////    i--;
//            }
//            if(arr[i]!=i+1){
//            i--;}
//        }
//        totalDigitReverse(1342);
//        System.out.println(linearSearch(new int[]{1,6,2,4,5},1,0));
//        System.out.println(   sum);
//        System.out.println(Arrays.toString(arr));
        int[] arr=new int[]{5,4,3,2,1};
//        selectionsort(arr,arr.length-1,0,0);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(multipleIndexesSearch(new int[]{1,6,2,4,1,5},10,0,new ArrayList()));

        System.out.println(Arrays.toString(mergesort(arr)));

    }

    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i< first.length&& j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while (j< second.length){
            mix[k]=second[j];
            k++;
            j++;
        }

        return mix;
    }

    static void selectionsort(int[] arr,int r ,int c,int max){
        if(r==0){
            return;
        }
        if(c<=r){

            if(arr[max]<arr[c]){
                max=c;
            }
            selectionsort(arr,r,c+1,max);

        }else{
            int temp=arr[r];
            arr[r]=arr[max];
            arr[max]=temp;

            selectionsort(arr,r-1,0,0);
        }
    }

    static void buubleSort(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            buubleSort(arr,r,c+1);
        }else{
            buubleSort(arr,r-1,0);
        }
    }

    static int binarySearchRotated(int[] arr, int s,int e,int t){
        int mid=s+(e-s)/2;
        if(arr[mid]==t){
            return mid;
        }else if(arr[mid]>t && arr[s]<=t)  {
            if(arr[s]<=t){
                return binarySearchRotated(arr,s,mid-1,t);
            }else{
                return binarySearchRotated(arr,mid+1,e,t);
            }

        }else if(arr[mid]<t && arr[e]<=t){
            return binarySearchRotated(arr,mid+1,e,t);
        }
        return -1;
    }

    static ArrayList multipleIndexesSearch(int[] arr,int ta,int i,ArrayList list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==ta){
            list.add(i);
        }
        return multipleIndexesSearch(arr,ta,i+1,list);
    }


    static  boolean linearSearch(int[] arr,int target,int index){
        if(arr[index]==target){
            return true;
        } else if (index==arr.length-1) {
            return false;
        }else {
            return linearSearch(arr,target,index+1);
        }
    }






    static boolean sort(int[] arr,int index){
        if(index+1!= arr.length){
            if(arr[index]>arr[index+1]){
                return false;
            }
            else{
                return sort(arr,index+1);
            }
        }
        return true;
    }




    static void fun(int n){
        if(n==0) {
            return;
        }
        fun(n-1);
        System.out.println(n);
    }

    static void totalDigitReverse(int num){
        if(num==0){
            return;
        }
        int rem=num%10;
        num=num/10;
        sum=sum*10+rem;
        totalDigitReverse(num);
    }

    static int totalDigitSum(int num){
        if(num>0 && num<10){
            return num;
        }
        int rem=num%10;
        num=num/10;
        return rem *totalDigitSum(num);
    }
}

package search;

public class Ceiling {
    public static void main(String[] args) {
//        int[] nums={2,3,5,9,14,18};
//        int s=0,end= nums.length-1,mid=0,t=10;
//        while(s<=end){
//            mid=(end+s)/2;
//            if(nums[mid]==t){
//                System.out.println(nums[mid]);
//                break;
//            }
//            else if (nums[mid]<t){
//                s=mid+1;
//            }else {
//                end=mid-1;
//            }
//        }
//        System.out.println(nums[end]);

        char[] cc={'c','f','j'};
        int s=0,end=cc.length-1;
        while(s<=end){
            int mid=(s+end)/2;
            if(cc[mid]<'a'){
                s=mid+1;

            } else if (cc[mid]>'a') {
                end=mid-1;
            }else{
                System.out.println(cc[mid]);
            }
        }
        System.out.println(cc[s]);
    }
}

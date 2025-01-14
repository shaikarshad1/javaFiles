package search;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int s=0,e=nums.length-1,mid;
        int[] res={-1,-1};
        while(s<=e){
            mid=(s+e)/2;
            if(nums[mid]==6){
//                if(mid+1!= nums.length-1 && nums[mid+1]==6){
//                    res[0]=mid;
//                    res[1]=mid+1;
//                }else{
//                    res[0]=mid-1;
//                    res[1]=mid;
//                }
//                break;
                res[0]=mid;
                res[1]=mid;
                bb(nums,s,mid-1,res);
                bb(nums,mid+1,e,res);
            }
            else if (nums[mid]>6){
                e=mid-1;
            } else {
                s=mid+1;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    private static void bb(int[] nums, int s, int e, int[] res) {
        int mid=(s+e)/2;
        while (s<=e){
            mid=(s+e)/2;
            if(nums[mid]==6){
//                if(mid+1!= nums.length-1 && nums[mid+1]==6){
//                    res[0]=mid;
//                    res[1]=mid+1;
//                }else{
//                    res[0]=mid-1;
//                    res[1]=mid;
//                }
//                break;
                res[0]=mid;
                res[1]=mid;
                bb(nums,s,mid-1,res);
                bb(nums,mid+1,e,res);
            }
            else if (nums[mid]>6){
                e=mid-1;
            } else {
                s=mid+1;
            }

        }

    }

//    static void bb(int)
}

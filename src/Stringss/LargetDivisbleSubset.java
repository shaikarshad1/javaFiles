package Stringss;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargetDivisbleSubset {
    public static void main(String[] args) {
        List<Integer> ss=new ArrayList<>();
        int nums[]={1,2,4,8};
        if(nums.length==1){

//            return List.copyOf(nums);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++) {
                if (nums[i] % nums[j] == 0 || nums[j] % nums[i] == 0) {
                    if(!ss.contains(nums[i])){
                    ss.add(nums[i]);}
                    if(!ss.contains(nums[j])){
                        ss.add(nums[j]);}

                }
            }
        }
        System.out.println(ss);
    }
}

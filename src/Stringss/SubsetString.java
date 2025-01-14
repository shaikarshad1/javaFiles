package Stringss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetString {
    public static void main(String[] args) {
        List<List<Integer>> res =new ArrayList<>();
        List<List<Integer>> res1 =new ArrayList<>();
        int[] nums=new int[]{1,2,2};
//        numsArray(nums,res);
        List rr=new ArrayList<>();
        res.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){

            int lll= res.size();
            for(int j=0;j<lll;j++){

                List<Integer> rrr=new ArrayList<>(res.get(j));


                rrr.add(nums[i]);
//                rrr.add(nums[i]);

                res.add(rrr);

            }


        }
        System.out.println(subbList("","ahbgdc"));
//        System.out.println(res);
        res1.add(new ArrayList<>());

int s=0;
int lll1=0;
        for(int i=0;i<nums.length;i++){
            s=0;
            if(i!=0 && nums[i]==nums[i-1]){
                s=lll1+1;
            }
            lll1= res1.size()-1;

            for(int j=s;j<=lll1;j++){

                List<Integer> rrr=new ArrayList<>(res1.get(j));


                rrr.add(nums[i]);

                res1.add(rrr);

            }


        }
        System.out.println(res1);

    }

    static List<List<String>> subb(String res, String og){
        if(og.isEmpty()){
            List ab=new ArrayList<>();
            List<List<String>> lll=new ArrayList<>();
            if(res!=""){
//            System.out.println(res);

            ab.add(res);
            lll.add(ab);}
            return lll;
        }

        List left=subb(res+og.charAt(0),og.substring(1));

        List right=subb(res,og.substring(1));
        left.addAll(right);

    return left;
    }

    static List<String> subbList(String res, String og){
        if(og.isEmpty()){
            List ab=new ArrayList<>();
            if(res!=""){
//            System.out.println(res);

                ab.add(res);
                }
            return ab;
        }

        List left=subbList(res+og.charAt(0),og.substring(1));

        List right=subbList(res,og.substring(1));
        left.addAll(right);
        System.out.println(left.contains(""));
        return left;
    }

    static void numsArray(int[] nums,List<List<Integer>> res){
        List<Integer> ll=new ArrayList<>();
        if(nums.length==0){


            res.add(ll);
            ll.remove(0);
            return;
        }
    ll.add(nums[0],0);
        numsArray(Arrays.copyOfRange(nums,1,nums.length),res);

        ll.add(nums[0],0);
        numsArray(Arrays.copyOfRange(nums,1,nums.length),res);

    }
}

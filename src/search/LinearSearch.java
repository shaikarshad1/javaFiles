package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,10,100,112,134,156};
//        linerSearch(nums);
        binraySearch(nums);
    }

    private static void binraySearch(int[] nums) {
        int start=0,end= nums.length,c=0;
//        for (int i=start;i<end;i++){
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]==156){


                System.out.println(mid);
                break;
            }else if(nums[mid]<156){
                start=mid+1;

            }else{
                end=mid;
            }
        }
    }

    private static void linerSearch(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==7){
                System.out.println(i);
            }
        }
    }
}

package search;

public class BinaryS {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,10,100,112,134,156};

        int s=0,e= nums.length-1,m=0,t=100;
        while(s<=e){
            m=(s+e)/2;
            if(nums[m]==t){
                System.out.println(m);
                System.out.println(nums[m]);
                return;
            } else if (nums[m]>t) {

                e=m;
            } else if (nums[m]<t) {
                s=m+1;
            }
        }
        System.out.println(nums[e]);
        System.out.println("----end-----");
    }
}

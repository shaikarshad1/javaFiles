package search;

public class RotatedBinary {
    public static void main(String[] args) {
        int[] n={3,5,1};
        int s=0,e=n.length-1,t=3;
        int pivotIndex=pivot(n,0,e);

        if(pivotIndex==-1){
            System.out.println(binary(n,0,e,t));
        }
        System.out.println(n[pivotIndex]);
        if(n[pivotIndex]==t){
            System.out.println(pivotIndex);
        }
        if(n[s]<=t){
            System.out.println(binary(n,0,pivotIndex-1,t));
        }
        System.out.println(binary(n,pivotIndex+1,e,t));

    }

    static int binary(int[] nums,int s,int e,int t){
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]==t){

                return m;
            } else if (nums[m]>t) {

                e=m;
            } else if (nums[m]<t) {
                s=m+1;
            }
        }
        return -1;
    }

    static int pivot(int[] n,int s,int e){
        while(s<=e){
            int m=(s+e)/2;
            if(m<e && n[m]>n[m+1]){
                return m;

            } else if (s<m && n[m]<n[m-1]) {
                return m-1;

            } else if (n[m]<=n[s]) {
                e=m-1;

            }else {
                s=m+1;
            }


    }
        return -1;
    }
}

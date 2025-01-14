package search;



public class FindInMountainArray {

    public static void main(String[] args) {
        int[] n={1,2,3,4,5,3,1};
        int s=0,e=n.length-1,t=2,r=-1,p=0;
        while (s<e){
            int m=(s+e)/2;
            if (n[m]<n[m+1]){
            s=m+1;
        }else{
            e=m;
        }}
        p=n[s];
        s=0;e=n.length-1;
        while(s<e) {
            int m=(s+e)/2;

            if(n[m]==p) {
              int mi=  minIndex(n,0,m,t);
                if(mi!=-1){
                    System.out.println(mi);
                break;}

                System.out.println(maxIndex(n,m+1,n.length-1,t));
                break;
//               s=e+1;
            } else if (n[m]>n[m+1]) {
                e=m;
            }else {
                s=m+1;
            }
        }



        System.out.println(r);
    }

    private static int maxIndex(int[] n, int s, int e, int t) {
        while (s<=e){
            int m=(s+e)/2;
            if (n[m]==t){
               return m;
            }else if(n[m]>t){
                s=m+1;
            }else {
                e=m-1;
            }
        }
        return -1;
    }

    private static int minIndex(int[] n, int s, int e, int t) {
        while (s<=e){
            int m=(s+e)/2;
            if (n[m]==t){
                return m;
            }else if(n[m]>t){
                e=m-1;
            }else {
                s=m+1;
            }
        }
        return -1;
    }
}

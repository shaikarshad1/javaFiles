package search;

public class RevMoun {
    public static void main(String[] args) {
        int[] n={1,2,3,4,5,6,7,4,3,2};
        int s=0,e=n.length-1;
        while(s<e){
            int m=(s+e)/2;
            if(n[m]<n[m+1]){
                s=m+1;
            }else {
                e=m;
            }
        }
        System.out.println(n[s]);
    }
}

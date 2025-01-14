package search;

public class Cell {
    public static void main(String[] args) {
        int[] d={2,3,5,9,14,16,17,18};
        int s=0,e=d.length-1,t=15;
        while(s<=e){
            int mid=(e+s)/2;
            if(d[mid]>t){
                e=mid-1;
            } else if (d[mid]<t) {
                s=mid+1;

            }else {
                System.out.println(d[mid]);
                break;
            }
        }
        System.out.println(d[s]);
        System.out.println(d[e]);
    }
}

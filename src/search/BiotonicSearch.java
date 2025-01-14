package search;

public class BiotonicSearch {
    public static void main(String[] args) {
        int[] n = {3,5,3,2,0};
        int s = 0, e = n.length - 1,mo=0;
        while (s <= e) {
            int m = (s + e) / 2;
            if ( m - 1 >= 0 && m + 1 <= n.length - 1 && n[m] > n[m - 1] && n[m] > n[m + 1] ) {
                mo=m;
                s=e+1;
            }
            else if (m - 1 >= 0 && n[m] > n[m - 1] ) {
                s = m + 1;
            } else if ( m + 1 <= n.length - 1 && n[m] > n[m + 1] ) {
                e = m - 1;
            }
        }
        System.out.println(n[mo]);
    }
}

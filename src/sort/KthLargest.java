package sort;

class KthLargest {
    public int findKthLargest(int[] n, int k) {
        int i=0,last= n.length-1,max=0;
        while(i<k){
            for (int j = 0; j <=last; j++) {
                if (n[j] > n[max]) {
                    max = j;
                }
            }
            last--;
            max=0;
        }
        return k;
    }
}
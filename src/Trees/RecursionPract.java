package Trees;

public class RecursionPract {
    public static void main(String[] args) {
        int n=30,count=0;
        double multiply=1;
        for(int i=n;i>=1;i--){
            multiply*=i;
        }
        System.out.println(multiply);
        while(multiply>0){
            double iszero=multiply%10;
            if(iszero==0) {
                count++;
            }else{
                break;
            }
            multiply/=10;
        }
        System.out.println(multiply);
        System.out.println(count);
    }

    public int multiple(int n){
        if(n==1){
            return 1;
        }
        return n*multiple(n-1);
    }
}

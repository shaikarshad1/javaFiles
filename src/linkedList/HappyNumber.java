package linkedList;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);

        if(fast==1){
            return true;
        }
        return false;
    }

    static int  square(int n){
        int r=0;
        while(n>0){
            int rem=n%10;
            r=r+(rem*rem);
            n=n/10;
        }
        return r;
    }
}

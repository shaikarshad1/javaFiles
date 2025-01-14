package aBasics;

public class Fibnacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    static int fib(int n){
//        if(n<=0){
//            return 0;
//        } else if (n==1) {
//            return 1;
//        }

        return n<=0? 0:n==1? 1:fib(n-1)+fib(n-2);
//        return fib(n-1)+fib(n-2);
    }
}

package threads;

public class Main {

    public static void main(String[] args) {
//        Thread t1=new Thread(()->{
//            for(int i=0;i<20;++i){
//                System.out.println(i+"T 1");
//            }
//        });
//
//        Thread t2=new Thread(()->{
//            for(int i=0;i<20;++i){
//                System.out.println(i+"T 2");
//            }
//        });

//        t1.start();
//        t2.start();

        DemoThread dt= new DemoThread();
        Thread t1=new Thread(dt);
        t1.start();
        Thread t2=new Thread(dt);
        t2.start();

//        DemoThread t2= new DemoThread();
//        t2.run();
    }
}

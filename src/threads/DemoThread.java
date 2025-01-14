package threads;

public class DemoThread extends  Thread{

//    @Override
    public void run(){
        synchronized (this){
        for(int i=0;i<5;++i){
            System.out.println(i+"T "+Thread.currentThread().getName());
        }}
    }

}

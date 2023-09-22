package p4;

import java.util.concurrent.locks.ReentrantLock;

public class CountThread implements Runnable{

    CommonResource commonResource;
    ReentrantLock reentrantLock;


    public CountThread(CommonResource commonResource, ReentrantLock reentrantLock) {
        this.commonResource = commonResource;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {

        reentrantLock.lock();

        try{
            commonResource.x = 1;
            for (int i=1; i<5; i++){
                System.out.println(Thread.currentThread().getName() + ": " + commonResource.x);
                commonResource.x++;
                Thread.sleep(100);
        }}catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }finally {
            reentrantLock.unlock();
        }
    }
}

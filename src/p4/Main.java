package p4;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock reentrantLock = new ReentrantLock();
        for(int i=1; i<6; i++){
            Thread thread = new Thread(new CountThread(commonResource, reentrantLock));
            thread.setName("Th_"+i);
            thread.start();
        }
    }

}

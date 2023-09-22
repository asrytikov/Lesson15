package p3;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        CommonResource commonResource = new CommonResource();
        new Thread(new CountThread(commonResource, semaphore, "Th_1")).start();
        new Thread(new CountThread(commonResource, semaphore, "Th_2")).start();
        new Thread(new CountThread(commonResource, semaphore, "Th_3")).start();

    }
}

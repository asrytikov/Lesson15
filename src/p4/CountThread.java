package p3;


import java.util.concurrent.Semaphore;

public class CountThread implements Runnable{

    CommonResource commonResource;
    Semaphore semaphore;
    String name;

    public CountThread(CommonResource commonResource, Semaphore semaphore, String name) {
        this.commonResource = commonResource;
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try{
            System.out.println(name + " wait approve");
            semaphore.acquire();
            commonResource.x = 1;
            for (int i=1; i<5; i++){
                System.out.println(this.name + ": " + commonResource.x);
                commonResource.x++;
                Thread.sleep(100);
        }}catch (InterruptedException exception){}
        System.out.println(name + " notify approve");
        semaphore.release();

    }
}

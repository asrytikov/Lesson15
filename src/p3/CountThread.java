package p1;

public class CountThread implements Runnable{

    CommonResource commonResource;

    public CountThread(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {

        commonResource.increment();

    }
}

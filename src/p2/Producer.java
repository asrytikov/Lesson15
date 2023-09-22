package p2;

import static java.lang.Thread.sleep;

public class Producer implements Runnable{

    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for(int i = 1; i<10; i++){
            store.put();
        }
    }
}

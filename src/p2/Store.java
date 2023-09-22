package p2;

public class Store {

    private int product = 0;

    public synchronized void put(){
        while (product >=3){
            try {
                wait();
            }catch (InterruptedException exception){}
        }
        product++;
        System.out.println("Producer put 1 product");
        System.out.println("Products in store: " + product);
        notify();
    }

    public synchronized void get(){
        while (product < 1){
            try {
                wait();
            }catch (InterruptedException exception){}
        }
        product--;
        System.out.println("Comsumer get 1 product");
        System.out.println("Products in store: " + product);
        notify();
    }


}

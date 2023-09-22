package p1;

public class Main {
    public static void main(String[] args) {
       CommonResource commonResource = new CommonResource();
       for (int i =1; i<6; i++){
           Thread thread = new Thread(new CountThread(commonResource));
           thread.setName("Th_"+i);
           thread.start();
       }
    }
}
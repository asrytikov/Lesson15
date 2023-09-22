package p5;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {-5, -3, -2, 0, 1, 2 ,3, 4, 5};
        int count = 0;
        for (int i: numbers){
            if (i>0) count++;
        }
        System.out.println(count);

        long count2 = IntStream.of(-5, -3, -2, 0, 1, 2 ,3, 4, 5).filter(w->w>0).count();
        System.out.println(count2);

    }

}

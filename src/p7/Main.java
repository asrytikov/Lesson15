package p7;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 14", 250_000),
                new Phone("Samsung Galaxy Z", 200_000), new Phone("Xiaomi 13", 50_000));

        //phoneStream.filter(phone -> phone.getPrice()>50_000).forEach(phone -> System.out.println(phone.getName()));

        //phoneStream.map(phone -> "Name: " + phone.getName() + " price: "+phone.getPrice()).forEach(System.out::println);

        phoneStream.flatMap(phone -> Stream.of(
                String.format("Name: %s price without discount: %d", phone.getName(), phone.getPrice()),
                String.format("Name: %s price with discount: %d", phone.getName(), phone.getPrice() - (int)(phone.getPrice()*0.1))
        )).forEach(System.out::println);


    }
}

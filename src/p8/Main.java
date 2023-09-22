package p8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 13", "Xiaomi 13", "Samsung Galaxy Z");
        phones.stream()
                .sorted()
                .forEach(System.out::println);

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 14", 250_000),
                new Phone("Samsung Galaxy Z", 200_000), new Phone("Xiaomi 13", 50_000));

        phoneStream.sorted(new PhoneComparator())
                .forEach(System.out::println);





    }

}

class PhoneComparator implements Comparator<Phone>{

    @Override
    public int compare(Phone a, Phone b) {
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}

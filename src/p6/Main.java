package p6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Paris", "London", "Samara");
        cities.stream()
                .filter(s->s.length()==6)
                .forEach(System.out::println);

        Stream<String> citiesStream = cities.stream();
        citiesStream = citiesStream.filter(s->s.length()==6);
        citiesStream.forEach(System.out::println);

        Stream<String> cStream = Arrays.stream(new String[]{"Paris", "London", "Samara"});
        cStream.forEach(System.out::println);

        IntStream intStream = Arrays.stream(new int[]{1,2,3});

        Stream<String> citStream = Stream.of("Paris", "London", "Samara");
        citStream.forEach(System.out::println);
        String[] cities2 = {"Paris", "London", "Samara"};
        Stream<String> stream = Stream.of(cities2);
    }

}

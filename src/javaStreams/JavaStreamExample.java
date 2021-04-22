package javaStreams;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamExample {
    public static void main(String[] args) {
        Stream.iterate(1,i -> i+1 )
                .filter(integer -> integer%5 == 0)
                .limit(10)
                .forEach(System.out::println);
        // fetching price
        List<Integer> list = Stream.iterate(1, i -> i+1 )
                .filter(integer -> integer%5 == 0)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list);

        Integer totalNumber = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(totalNumber);

        long count = list.stream()
                .filter(n -> n % 10 == 0)
                .count();
        System.out.println(count);
        // IntStream, LongStream, DoubleStream available
        IntStream.generate(()-> (int) (Math.random() * 100))
                .filter(i -> i >3)
                .distinct()
                .limit(10)
                .forEach(i -> System.out.printf("%d ",i));
        System.out.println();

        DoubleStream.generate(()-> Math.random() * 10)
                .filter(i -> i > 5)
                .limit(10)
                .forEach(i -> System.out.printf("%.2f ",i));
        System.out.println();

        Stream.of("one", "two", "three", "four")
                .map(String::toUpperCase)
                .filter(s -> s.length() > 3)
                .sorted(Collections.reverseOrder())
                //.sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        HashMap<String, BigDecimal> foodMenu = new HashMap<>();
        foodMenu.put("pizza", BigDecimal.valueOf(4.99));
        foodMenu.put("burger", BigDecimal.valueOf(7.99));
        foodMenu.put("durum", BigDecimal.valueOf(5.50));

        foodMenu.forEach((s,b) -> System.out.printf("5 %s  is -> %f\n",s,b.multiply(BigDecimal.valueOf(5)).floatValue()));


        String val = Stream.of("one", "two", "three", "four")
                .min(String::compareTo).get();

        System.out.println(val);

        System.out.println(
                Stream.of("one", "two", "three", "four")
                .map(String::toUpperCase)
                //.reduce("",((s,s2) -> s+" "+s2))
                .collect(Collectors.joining(" < "))
        );
    }
}

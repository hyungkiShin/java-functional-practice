package section4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FunctionApplication {
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Alice", "Bob", "Charlie");
        final List<String> collect = nameStream.collect(toList());
//        System.out.println("collect = " + collect);

        String[] cityArray = new String[] {"San Jose", "Seoul", "Tokyo"};
        Stream<String> cityStream = Arrays.stream(cityArray);
        final List<String> cityList = cityStream.collect(toList());
//        System.out.println("cityList = " + cityList);

        Set<Integer> numberSet = new HashSet<>(Arrays.asList(3, 5, 7));
        final Stream<Integer> numberStream = numberSet.stream();
        final List<Integer> collect1 = numberStream.collect(toList());
        System.out.println("collect1 = " + collect1);

    }
}

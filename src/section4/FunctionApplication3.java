package section4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionApplication3 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3,6,-4);
        Stream<Integer> numberStream = numberList.stream();
        final List<Integer> collect = numberStream.map(x -> x * 2).collect(Collectors.toList());
        System.out.println("integerStream = " + collect);

        final List<String> collect1 = numberList.stream().map(x -> "Number is: " + x).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
    }
}

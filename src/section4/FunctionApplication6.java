package section4;

import section4.model.FUser;
import section4.model.Order;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalDateTime.now;

public class FunctionApplication6 {
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(3,-5,4,-5,2,3);
       List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
     System.out.println("distinctNumbers = " + distinctNumbers);
    }
}

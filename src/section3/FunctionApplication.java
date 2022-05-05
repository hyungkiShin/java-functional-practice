package section3;

import java.awt.*;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionApplication {
    public static int calculate(int x, int y, BiFunction<Integer, Integer,Integer> operator) {
        return operator.apply(x,y);
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public void myMethod() {
        System.out.println(calculate(10,3, this::subtract));
    }

    public static void main(String[] args) {
        int a = Integer.parseInt("15");
        System.out.println("a = " + a);

        Function<String,Integer> str2Int = Integer::parseInt;
        Integer apply = str2Int.apply("20");
        System.out.println("apply = " + apply);

        String str = "Hello";
        boolean b = str.equals("world");
        System.out.println("b = " + b);
        Predicate<String> equarsToHello = str::equals;
        System.out.println("equarsToHello = " + equarsToHello.test("hello"));

        String str2 = "It's me";
        Predicate<String> c =  str2::equals;
        System.out.println("c = " + c.test("hi"));

//        System.out.println(calculate(8,2, (x,y) -> x + y ));
        System.out.println(calculate(8,2, FunctionApplication::multiply));

        FunctionApplication instance = new FunctionApplication();
        System.out.println(calculate(8,2, instance::subtract));
    }
}

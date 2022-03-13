import util.Adder;

import java.util.function.Function;

public class FunctionApplication {
    public static void main(String[] args) {
//        Function<Integer, Integer> myAdder = new Adder();
        Function<Integer, Integer> myAdder = x -> x + 10;;
        int result = myAdder.apply(1);
        System.out.println("myAdder.apply(1) = " + result);
    }
}

package saction1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionApplication5 {
    public static void main(String[] args) {
        Consumer<String> myStringConsumer = (String str) -> System.out.println("str = " + str);
        myStringConsumer.accept("hello");

        /**
         * Array.asList() 는 Immutable 한 녀석이라 데이터의 변형이 불가능 하다.
         */
        List<Integer> integerInputs = Arrays.asList(4,2,3);
        System.out.println("integerInputs = " + integerInputs);
        
        Consumer<Integer> myIntegerProcessor = (Integer x) -> System.out.println("Processing integer = " + x);
//        myIntegerProcessor.accept(5);
        process(integerInputs, myIntegerProcessor);

        Consumer<Integer> myDifferentIntegerProcessor = x -> System.out.println("Different integer = " + x);
    }

//    public static void process(List<Integer> inputs, Consumer<Integer> processor) {
//        for (Integer input : inputs) {
//            processor.accept(input);
//        }
//    }
    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for (T input : inputs) {
            processor.accept(input);
        }
    }
}

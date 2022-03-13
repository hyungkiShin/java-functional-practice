package saction1;

import saction1.util.TriFunction;

public class FunctionApplication3 {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers =
                (x,y,z) -> x+y+z;
        int result = addThreeNumbers.apply(1,2,3);
        System.out.println("result = " + result);
    }
}

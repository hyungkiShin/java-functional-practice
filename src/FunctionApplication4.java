import java.util.function.Supplier;

public class FunctionApplication4 {
    public static void main(String[] args) {
        Supplier<String> myStringSupplier = () -> "hello world";
        System.out.println("myStringSupplier = " + myStringSupplier.get());

        Supplier<Double> myRandomDoubbleSupplier = () -> Math.random();
//        System.out.println("myRandomDoubbleSupplier = " + myRandomDoubbleSupplier.get());
//        System.out.println("myRandomDoubbleSupplier = " + myRandomDoubbleSupplier.get());
//        System.out.println("myRandomDoubbleSupplier = " + myRandomDoubbleSupplier.get());
        /**
         * ramdom number 를 만드는 방식에 있어서, 전혀 관여하지 않고 구현함.
         */
        printRandomDoubles(myRandomDoubbleSupplier, 5);
    }

    public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}

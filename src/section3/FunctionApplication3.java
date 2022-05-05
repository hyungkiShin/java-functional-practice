package section3;

import section3.model.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class FunctionApplication3 {
    public static void main(String[] args) {
        Map<String, BiFunction<String, String , Car>> carTypeToConstructorMap = new HashMap<>();
        carTypeToConstructorMap.put("sedan", Sedan::new);
        carTypeToConstructorMap.put("suv", Suv::new);
        carTypeToConstructorMap.put("van", Van::new);

//        User user = new User(1,"Alice");
//        BiFunction<Integer, String, User> userCreator = User::new;
//        User charlie = userCreator.apply(3,"Charli");
//        System.out.println("charlie = " + charlie);

        String [][] inputs = new String[][] {
                {"sedan", "Sonata", "Hyundai" },
                {"van", "Sienna", "Toyota" },
                {"sedan", "Model S", "Tesla" },
                {"suv", "Sorento", "KIA" }
        };

        /**
         *
         *         for (int i = 0; i <= inputs.length -1; i++) {
         *             System.out.println("inputs = " + inputs[i][0].toString());
         *             if(inputs[i][0].toString() == "sedan") {
         *                 // type 에 따라서 new Car 타입을 생성해준다고 하니. 생각만 해도 ㅎ..
         *             }
         *         }
         */

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            String[] input = inputs[i];
            String carType = input[0];
            String name = input[1];
            String brand = input[2];

            cars.add(carTypeToConstructorMap.get(carType).apply(name, brand));
        }

        for (Car car: cars) {
            car.drive();
        }

        for (int i = 0; i < cars.size(); i++) {
            final Car car = cars.get(i);
            car.drive();
        }
    }

}

package section3.model;

public class Sedan extends Car {

    public Sedan(final String name, final String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("Drive a sedan name = " + name + "from =" + brand);
    }
}

package section3.model;

public class Suv extends Car{

    public Suv(final String name, final String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("Drive a name = " + name + "from " + brand);
    }
}

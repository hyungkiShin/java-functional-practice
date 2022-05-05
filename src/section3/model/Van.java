package section3.model;

public class Van extends Car {
    public Van(final String name, final String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("Drive name = " + name + "from " + brand);
    }
}

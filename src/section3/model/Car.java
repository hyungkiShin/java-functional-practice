package section3.model;

public abstract class Car {
    protected String name;
    protected String brand;

    public Car(final String name, final String brand) {
        this.name = name;
        this.brand = brand;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

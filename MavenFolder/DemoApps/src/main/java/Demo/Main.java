package Demo;
public class Main {

    public static void main(String[] args) 
    {

        Car car = new Car();

        Injector.inject(car);

        car.drive();
    }
}
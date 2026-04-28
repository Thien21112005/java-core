package code.bai14;

public class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] agrs) {
        //Create car object
        Car car = new Car();
        //Call the honk method (from the vehicle class) on the car object
        car.honk();
        System.out.println(car.brand + "\n" + car.modelName);

    }

}

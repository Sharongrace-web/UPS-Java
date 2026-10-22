
package scannerpractice;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

public class Car extends Vehicle {

    void start() {
        super.start();
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

import java.util.Scanner;
class Car {
    String carId;
    String model;
    boolean isAvailable;

    // Constructor
    Car(String carId, String model) {
        this.carId = carId;
        this.model = model;
        this.isAvailable = true; // By default available
    }

    // Rent car
    void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(model + " rented.");
        } else {
            System.out.println(model + " is not available.");
        }
    }

    // Return car
    void returnCar() {
        isAvailable = true;
        System.out.println(model + " returned.");
    }
}

// Customer class
class Customer {
    String customerId;
    String name;

    Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
}

// Main program
public class Main {
    public static void main(String[] args) {
        // Create cars
        Car car1 = new Car("C1", "Toyota");
        Car car2 = new Car("C2", "Honda");

        // Create customer
        Customer cust1 = new Customer("U1", "Alice");

        // Show car availability
        System.out.println(car1.model + " available: " + car1.isAvailable);
        System.out.println(car2.model + " available: " + car2.isAvailable);

        // Rent a car
        car1.rentCar();

        // Try to rent again
        car1.rentCar();

        // Return car
        car1.returnCar();

        // Rent another car
        car2.rentCar();
    }
}

}

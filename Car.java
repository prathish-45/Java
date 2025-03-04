public class Car {
    private String brand;
    private double price;

    // Constructor to initialize attributes
    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to display car details
    public void display() {
        System.out.println("Brand: " + brand + ", Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating two objects of the Car class
        Car car1 = new Car("Toyota", 30000);
        Car car2 = new Car("Honda", 28000);

        // Displaying car details
        System.out.println("Car 1 Details:");
        car1.display();
        
        System.out.println("Car 2 Details:");
        car2.display();
    }
}


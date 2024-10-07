package Practicals;

//Superclass
class Vehicle {
 public String brand;
 protected int speed;

 public Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 public void showVehicleDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
}

//Subclass 1 - Car
class Car extends Vehicle {
 private String fuelType;

 public Car(String brand, int speed, String fuelType) {
     super(brand, speed);
     this.fuelType = fuelType;
 }

 public void showCarDetails() {
     showVehicleDetails(); // Access method from Vehicle class
     System.out.println("Fuel Type: " + fuelType);
 }
}

//Subclass 2 - Bike
class Bike extends Vehicle {
 private String bikeType;

 public Bike(String brand, int speed, String bikeType) {
     super(brand, speed);
     this.bikeType = bikeType;
 }

 public void showBikeDetails() {
     showVehicleDetails(); // Access method from Vehicle class
     System.out.println("Bike Type: " + bikeType);
 }
}

public class HierarchicalInheritanceTest {
 public static void main(String[] args) {
     Car car = new Car("Toyota", 180, "Petrol");
     Bike bike = new Bike("Yamaha", 150, "Sports");

     car.showCarDetails();
     System.out.println();
     bike.showBikeDetails();
 }
}

package basics.oop.classesobjects;

class Car {
    String color;
    String model;

    void drive() {
        System.out.println("Driving " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object
        myCar.color = "Red";
        myCar.model = "Tesla";
        myCar.drive();  // Driving Tesla
    }
}

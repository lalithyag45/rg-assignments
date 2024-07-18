interface Car {
    static void drive(){
        System.out.println("Iam static method");
    } // Abstract method

    default void makeSound() {
        System.out.println("Car is making sound");
    }
}

class Creta implements Car {

}

public class MethodDemo {
    public static void main(String[] args) {
        Creta car = new Creta();
        Car.drive(); // Output: Dog eats bones
        car.makeSound(); // Output: Animal makes a sound
    }
}

package ObjectOrientedProgramming;

public class Car {
    String make = "chevrolet";
    String model = "Corvette";
    int year = 2021;
    String color = "red";
    Double price = 500000.00;

    public void drive () {
        System.out.println("you drive the car");
    }
    public void brake () {
        System.out.println("you step on the brakes");
    }

    //there is no constructor
    //when there is no constructor : memory allocation only
}

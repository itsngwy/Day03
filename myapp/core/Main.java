package myapp.core;

public class Main {
    
    public static void main(String[] args) {

        // Instantiate a car
        Car myCar = new Car();
        //myCar.setColour("red");
        //myCar.colour = "red";
        //myCar.make = "honda";
        //myCar.engineCapacity = 2000;

        myCar.start();

        System.out.printf("The colour of my car is %s\n", myCar.getColor());

        myCar.setColor("blue");
        System.out.printf("I have changed colour of my car to %s\n", myCar.getColor());

        // Instantiate another car
        Car myOtherCar = new Car(2500);
        //myOtherCar.colour = "silver";
        //myOtherCar.make = "subaru";
        //myOtherCar.engineCapacity = 2500;

        System.out.printf("The engine capacity of my car is %d\n", myOtherCar.getEngineCapacity());

        //myOtherCar.stop();

        Car myThirdCar = new Car("silver", "subaru");
        myThirdCar.make = "subaru";
        myThirdCar.stop();

        // Honda
        Honda civic = new Honda();
        System.out.printf("Make of car: %s\n", civic.getMake());
        civic.accelerate();
        civic.stop();
        civic.stop(30);

    }
}

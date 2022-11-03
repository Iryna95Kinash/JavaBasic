package main.java.oop;

public class App {
    public static void main(String[] args) {

        Car car = new Car();
        Human h = new Human();
        House house = new House();

        System.out.println("Hello World");

        car.drive();
        car.startEngine();
        car.drive();
        car.drivingWithMaxSpeed();
        car.stopDriving();
        car.stopEngine();

        System.out.println();

        h.setName("Ira");
        h.setHeight(177);
        h.setWeight(56);
        h.setAge(27);
        h.setAddress("Frankivskyi district");

        h.sayHello();
        h.introduce();
        h.sayGoodBye();

        System.out.println();

        house.turnOnSerena();
        house.setSerenaOff(true);
        house.serenaOn();
        house.setSerenaOff(false);
        house.serenaOn();
    }
}

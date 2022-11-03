package main.java.oop;

public class App {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car("Audi", "Germany");
        Car car3 = new Car(200, 5, "Ukraine");
        Human h = new Human();
        Human h2 = new Human("Vika");
        Human h3 = new Human(175, 55, 25)
        House house = new House ();
        House house2 = new House("red");
        House house3 = new House("Halytskyi district", 1885, "brown");

        car.drive();
        car.startEngine();
        car.drive();
        car.drivingWithMaxSpeed();
        car.stopDriving();
        car.stopEngine();
        car.includingPassengers(4);
        car.madeCauntry("Sweden", "Volvo");

        System.out.println();

        h.setName("Ira");
        h.setHeight(177);
        h.setWeight(56);
        h.setAge(27);
        h.setAddress("Frankivskyi district");


        h.sayHello();
        h.introduce();
        h.sayGoodBye();
        h.running(10);
        h.birthIn("Ira", 1995);

        System.out.println();

        house.turnOnSerena();
        house.setSerenaOn(true);
        house.serenaOn();
        house.setSerenaOn(false);
        house.serenaOn();
        house.locatedIn("Frankivskyi district");
        house.builtIn("red", 1925);
    }
}
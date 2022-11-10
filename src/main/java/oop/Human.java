package main.java.oop;

public class Human {

    private String name;
    private String address;
    private int height;
    private int weight;
    private int age;
    private int birthYear;
    private int speed;
    private static int humanCounter = 0;

    public Human() {
        humanCounter++;
    }

    public Human(String name) {
        this.name = name;
        humanCounter++;
    }

    public Human(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        humanCounter++;
    }

    public void humanNumber() {
        Printer.printParam("Number of people is " + humanCounter);
    }

    public void sayHello() {
        Printer.printParam("Hello there");
    }

    public void introduce() {
        Printer.printParam("Let me introduce myself:)... My name is " + name + " I'm " + age + " years old, my height is " + height + " centimetres and my weight is " + weight + " kg. Also, I live at " + address);
    }

    public void running(int speed) {
        Printer.printParam("Women run an average of " + speed + " km per hour");
    }

    public void birthIn(String name, int birthYear) {
        Printer.printParam(name + " was born in " + birthYear);
    }

    public void sayGoodBye() {
        Printer.printParam("It's a pleasure meet you, good bye");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthYear=" + birthYear +
                ", speed=" + speed +
                '}';
    }
}
package main.java.oop;

public class Human {
    String name;
    String address;
    int height;
    int weight;
    int age;
    int birthYear;
    int speed;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello there");
    }

    public void introduce() {
        System.out.println("Let me introduce myself:)... My name is " + name + " I'm " + age + " years old, my height is " + height + " centimetres and my weight is " + weight + " kg. Also, I live at " + address);
    }

    public void running(int speed) {
        System.out.println("Women run an average of " + speed + " km per hour");
    }

    public void birthIn(String name, int birthYear) {
        System.out.println(name + " was born in " + birthYear);
    }

    public void sayGoodBye() {
        System.out.println("It's a pleasure meet you, good bye");
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
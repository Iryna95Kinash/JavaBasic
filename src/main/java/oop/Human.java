package main.java.oop;

public class Human {
    int height;
    int weight;
    int age;
    String name;
    String address;


    public void sayHello() {
        System.out.println("Hello there");
    }

    public void introduce() {
        System.out.println("Let me introduce myself:)... My name is " + name + " I'm " + age + " years old, my height is " + height + " centimetres and my weight is " + weight + " kg. Also, I live at " + address);
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

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
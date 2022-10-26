package main.java.loop;

public class While {
    public static void main(String[] args) {

        int value = 1;

        while(value < 5){
            System.out.println("Infinity " + value);
        }

        while(value > 5){
            System.out.println("Infinity that will never start");
        }

        while(value < 11){
            System.out.println("Iteration # " + value);
            value = value + 1;
        }
    }
}

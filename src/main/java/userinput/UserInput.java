package main.java.userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {


        String name = null;
        int age = 0;
        int height = 0;
        int weight = 0;

        Scanner scanner = new Scanner(System.in);
        int userInput = -1;

        while (userInput != 5) {

            System.out.println("Hello user! \nIn this program you can press a number to fill your personal data: \nPress 1 to enter a name \nPress 2 to enter your age \nPress 3 to enter your height (in santimeters) \nPress 4 to enter your weight \nPress 5 to print your input \n\nEnter your number here:");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1 -> {
                    System.out.println("You fill " + userInput + "\nPlease, enter your name");
                    name = scanner.next();
                }
                case 2 -> {
                    System.out.println("You fill " + userInput + "\nPlease, enter your age");
                    age = scanner.nextInt();
                }
                case 3 -> {
                    System.out.println("You fill " + userInput + "\nPlease, enter your height (in santimeters)");
                    height = scanner.nextInt();
                }
                case 4 -> {
                    System.out.println("You fill " + userInput + "\nPlease, enter your weight");
                    weight = scanner.nextInt();
                }
                default -> System.out.println("Incorrect input, try again");
            }
        }

        System.out.println("You fill " + userInput + "\nHere is your info:" + "\nYour name is " + name + ", you are " + age + " years old and you have " + height + " height and your weight is " + weight + " kg.\n");
        scanner.close();
    }
}

package main.java.userinput;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {




        System.out.println("Hello user! \nIn this program you can press a number to fill your personal data: \nPress 1 to enter a name \nPress 2 to enter your age \nPress 3 to enter your height (in santimeters) \nPress 4 to enter your weight \nPress 5 to print your input \n\nEnter your number here:");

        String name = null;
        int age = 0;
        int height = 0;
        int weight = 0;

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            //while (userInput != 5) {

            if (userInput == 1) {
                System.out.println("You fill " + userInput + "\nPlese, enter your name");
                name = scanner.nextLine();
                scanner.close();
            } else if (userInput == 2) {
                System.out.println("You fill " + userInput + "\nPlese, enter your age");
                age = scanner.nextInt();
            } else if (userInput == 3) {
                System.out.println("You fill " + userInput + "\nPlese, enter your height (in santimeters)");
                height = scanner.nextInt();
            } else if (userInput == 4) {
                System.out.println("You fill " + userInput + "\nPlese, enter your weight");
                weight = scanner.nextInt();
            } else if (userInput == 5) {
                System.out.println("You fill " + userInput + "\nHere is your info:" + "Your name is " + name + ", you are " + age + " years old and you have" + height + " height and your weight is " + weight + " kg.\n");
                System.out.println("Else");
            } else {
                System.out.println("Incorrect input, try again");
            }
//            int num = scanner.nextInt();
//            System.out.println(num);
        }

//        String userData = scanner.next();
//        System.out.println("You fill " + userData);
    }
}

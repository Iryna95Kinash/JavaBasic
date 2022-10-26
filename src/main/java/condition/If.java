package main.java.condition;

public class If {
    public static void main(String[] args) {

        int value = 10;
        int secondValue = 20;

        if(value > 5){
            System.out.println("Right condition");
        }


        if(value > 9){
            System.out.println("First condition is True");
        }else{
            System.out.println("Second condition is False");
        }


        if(value < 5){
            System.out.println("First condition is True");
        }else if(value > 15){
            System.out.println("Second condition is False");
        }else{
            System.out.println("Third condition...");
        }



        if(value > 8){
            System.out.println("First condition is True");
        }else if(value < 5){
            System.out.println("Second condition is False");
        }


        if( value == 10 ) {
            if(secondValue == 20 ) {
                System.out.print("First value = 10 and Second value = 20");
            }
        }


        else{
            if(value == 100){
                System.out.println("Last condition");
            }
        }
    }
}

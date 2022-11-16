package main.java.oop;

public class Casting {

    public void intMaxValueOperation() {
        System.out.println("Max value of integer is " + Integer.MAX_VALUE);
        System.out.println("Adding 1 to max value is working like infinity loop and will show min value of existing type. For integer is " + Integer.MAX_VALUE + 1);
    }

    public void intLongAction() {
        int myNum = 75;
        long myLong = 84637L;
        System.out.println("If user summ int and log type values, it will be converting to long type " + myNum + myLong);
    }

    public void rangeProviding() {
        System.out.println("Max value of the Byte type is " + Byte.MAX_VALUE + "and the min value is " + Byte.MIN_VALUE);
        System.out.println("Max value of the Short type is " + Short.MAX_VALUE + "and the min value is " + Short.MIN_VALUE);
        System.out.println("Max value of the Integer type is " + Integer.MAX_VALUE + "and the min value is " + Integer.MIN_VALUE);
        System.out.println("Max value of the Float type is " + Float.MAX_VALUE + "and the min value is " + Float.MIN_VALUE);
        System.out.println("Max value of the Long type is " + Long.MAX_VALUE + "and the min value is " + Long.MIN_VALUE);
        System.out.println("Max value of the Double type is " + Double.MAX_VALUE + "and the min value is " + Double.MIN_VALUE);
    }

    public void floatIntCasting() {
        float myFloat = 5.5F;
        int newInt = (int) myFloat;
        System.out.println("Casting from float type to int loosing all data after the dot. Casting result from 5.5 is " + newInt);
    }
}

package main.java.arrays;

public class Arrays {
    public static void main(String[] args) {

        boolean[] myBoolean = new boolean[3];
        byte[] myByte = new byte[4];
        short[] myShort = new short[5];
        char[] myChar = new char[6];
        int[] myNum = new int[7];
        float[] myFloat = new float[8];
        long[] myLong = new long[2];
        double[] myDoub = new double[1];
        String[] myString = new String[10];

        myChar[0] = 'a';
        myChar[1] = 'b';
        myChar[2] = 'c';
        myChar[3] = 'd';
        myChar[4] = 'e';
        myChar[5] = 'f';

        myString[0] = "sunday";
        myString[1] = "monday";
        myString[2] = "tuesday";
        myString[3] = "wednesday";
        myString[4] = "thursday";
        myString[5] = "friday";
        myString[6] = "saturday";
        myString[7] = "grapefruit";
        myString[8] = "grape";
        myString[9] = "kiwi";


        for(int r = 0; r < myBoolean.length; r++) {
            System.out.print(myBoolean[r] + " ");
        }

        System.out.println();
        for (byte i = 0; i < myByte.length; i++) {
            myByte[i] = (byte) (i + 100);
            System.out.print(myByte[i] + " ");
        }

        System.out.println();
        for (short j = 0; j < myShort.length; j++) {
            myShort[j] = (short) (j + 1);
            System.out.print(myShort[j] + " ");
        }

        System.out.println();
        for (int i = 0; i<myChar.length; i++) {
            System.out.print(myChar[i] + " ");
        }

        System.out.println();
        for (int j = 0; j < myNum.length; j++) {
            myNum[j] = j + 15;
            System.out.print(myNum[j] + " ");
        }

        System.out.println();
        for (float i = 0; i < myFloat.length; i++) {
            myFloat[(int) i] = (float) (i + 0.579);
            System.out.print(myFloat[(int) i] + " ");
        }

        System.out.println();
        for (long j = 0; j < myLong.length; j++) {
            myLong[(int) j] = j + 2500;
            System.out.print(myLong[(int) j] + " ");
        }

        System.out.println();
        for (double i = 0; i < myDoub.length; i++) {
            myDoub[(int) i] = i + 1.33;
            System.out.print(myDoub[(int) i] + " ");
        }

        System.out.println();
        for (int j = 0; j<myString.length; j++) {
            System.out.print(myString[j] + " ");
        }
    }
}

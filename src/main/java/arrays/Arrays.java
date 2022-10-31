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
        for (short n = 0; n < myShort.length; n++) {
            myShort[n] = (short) (n + 1);
            System.out.print(myShort[n] + " ");
        }

        System.out.println();
        for (int c = 0; c<myChar.length; c++) {
            System.out.print(myChar[c] + " ");
        }

        System.out.println();
        for (int j = 0; j < myNum.length; j++) {
            myNum[j] = j + 15;
            System.out.print(myNum[j] + " ");
        }

        System.out.println();
        for (float b = 0; b < myFloat.length; b++) {
            myFloat[(int) b] = (float) (b + 0.579);
            System.out.print(myFloat[(int) b] + " ");
        }

        System.out.println();
        for (long x = 0; x < myLong.length; x++) {
            myLong[(int) x] = x + 2500;
            System.out.print(myLong[(int) x] + " ");
        }

        System.out.println();
        for (double d = 0; d < myDoub.length; d++) {
            myDoub[(int) d] = d + 1.33;
            System.out.print(myDoub[(int) d] + " ");
        }

        System.out.println();
        for (int g = 0; g<myString.length; g++) {
            System.out.print(myString[g] + " ");
        }
    }
}

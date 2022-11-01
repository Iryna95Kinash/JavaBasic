package main.java.arrays;

public class Arrays {
    public static void main(String[] args) {

        boolean[] arrBoolean = new boolean[3];
        byte[] arrByte = new byte[4];
        short[] arrShort = new short[5];
        char[] arrChar = new char[6];
        int[] arrNum = new int[7];
        float[] arrFloat = new float[8];
        long[] arrLong = new long[2];
        double[] arrDoub = new double[1];
        String[] arrString = new String[10];

        arrChar[0] = 'a';
        arrChar[1] = 'b';
        arrChar[2] = 'c';
        arrChar[3] = 'd';
        arrChar[4] = 'e';
        arrChar[5] = 'f';

        arrString[0] = "sunday";
        arrString[1] = "monday";
        arrString[2] = "tuesday";
        arrString[3] = "wednesday";
        arrString[4] = "thursday";
        arrString[5] = "friday";
        arrString[6] = "saturday";
        arrString[7] = "grapefruit";
        arrString[8] = "grape";
        arrString[9] = "kiwi";


        for (boolean b : arrBoolean) {
            System.out.print(b + " ");
        }

        System.out.println();
        for (byte i = 0; i < arrByte.length; i++) {
            arrByte[i] = (byte) (i + 100);
            System.out.print(arrByte[i] + " ");
        }

        System.out.println();
        for (short i = 0; i < arrShort.length; i++) {
            arrShort[i] = (short) (i + 1);
            System.out.print(arrShort[i] + " ");
        }

        System.out.println();
        for (char c : arrChar) {
            System.out.print(c + " ");
        }

        System.out.println();
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = i + 15;
            System.out.print(arrNum[i] + " ");
        }

        System.out.println();
        for (float i = 0; i < arrFloat.length; i++) {
            arrFloat[(int) i] = (float) (i + 0.579);
            System.out.print(arrFloat[(int) i] + " ");
        }

        System.out.println();
        for (long i = 0; i < arrLong.length; i++) {
            arrLong[(int) i] = i + 2500;
            System.out.print(arrLong[(int) i] + " ");
        }

        System.out.println();
        for (double i = 0; i < arrDoub.length; i++) {
            arrDoub[(int) i] = i + 1.33;
            System.out.print(arrDoub[(int) i] + " ");
        }

        System.out.println();
        for (String s : arrString) {
            System.out.print(s + " ");
        }
    }
}

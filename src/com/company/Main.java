package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // write your code here

        int[] test = {910,100,90,320,810};
        int[][] array = new int[10][test.length];

        sort(test,array);


    }

    public static void distributionPassOnes(int[] a, int[][] array) {
        for (int i = 0; i < a.length; i++) {
            int num = a[i] % 10;
            array[num][i] = a[i];
        }
    }

    public static void distributionPassTens(int[] a, int[][] array) {
        for (int i = 0; i < a.length; i++) {
            int num = (a[i] / 10) % 10;
            array[num][i] = a[i];
        }

    }

    public static void distributionPassHundreds(int[] a, int[][] array) {
        for (int i = 0; i < a.length; i++) {
            int num = (a[i] / 100) % 10;
            array[num][i] = a[i];
        }

    }

    public static void sort(int[] a, int[][] array){
                distributionPassOnes(a, array);
        copyArray(array, a);
        array = new int[10][a.length];

        distributionPassTens(a, array);
        copyArray(array, a);

        array = new int[10][a.length];
        distributionPassHundreds(a, array);
        copyArray(array, a);

        System.out.println(Arrays.toString(a));
    }

    public static void copyArray(int[][] a, int[] b) {
        int counter = 0;
        for (int[] ints : a) {
            for (int j = 0; j < a[j].length; j++) {
                if (ints[j] > 0) {
                    b[counter] = ints[j];
                    counter++;
                }
            }
        }
    }
}

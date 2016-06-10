package com.study.gojava.mod05;

public class ArrayOfNumbers {


    public static int findMinElement(double[] arrayOfNumbers) {
        int min = 0;
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < arrayOfNumbers[min]) {
                min = i;
            }

        }
        return min;
    }

    public static int findMaxElement(double[] arrayOfNumbers) {
        int max = 0;
        for (int i = arrayOfNumbers.length - 1; i > 0; i--) {
            if (arrayOfNumbers[i] > arrayOfNumbers[max]) {
                max = i;
            }
        }
        return max;
    }

    public void printArray(double[] arrayOfNumbers) {
        for (double element : arrayOfNumbers) {
            System.out.println(element);
        }
    }
}
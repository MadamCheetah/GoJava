package com.study.gojava.mod05;


public class SelectionSort extends ArrayOfNumbers {

    public static void selectionSort(double[] arrayOfInt){
        for (int i = 0; i < arrayOfInt.length; i++){
        double temp = arrayOfInt[i];
        arrayOfInt[i] = arrayOfInt[super.findMinElement(arrayOfInt)];
            arrayOfInt[super.findMaxElement(arrayOfInt)] = temp;
        }
    }

    public static void main(String[] args){
        double[] arrayOfNumbers = new double [9.9, 0.8, -5.3, 22.0, -11.7, 4.1];

        System.out.println("Initial array: ");
        super.printArray(arrayOfNumbers);

        SelectionSort.selectionSort(arrayOfNumbers);

            System.out.println("Sorted array: ");
        super.printArray(arrayOfNumbers);
    }
}

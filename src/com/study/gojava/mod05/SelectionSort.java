package com.study.gojava.mod05;


public class SelectionSort extends ArrayOfNumbers {

    public void selectionSort(double[] arrayOfInt){
        for (int i = 0; i < arrayOfInt.length-1; i++){
        double temp = arrayOfInt[i];
        arrayOfInt[i] = arrayOfInt[super.findMinElement(arrayOfInt)];
            arrayOfInt[super.findMaxElement(arrayOfInt)] = temp;
        }
    }

    public static void main(String[] args){

        SelectionSort selectionSort = new SelectionSort();

        double[] arrayOfNumbers = {9.9, 0.8, -5.3, 22.0, -11.7, 4.1};


        System.out.println("Initial array: ");
        selectionSort.printArray(arrayOfNumbers);

        selectionSort.selectionSort(arrayOfNumbers);

            System.out.println("Sorted array: ");
        selectionSort.printArray(arrayOfNumbers);
    }
}

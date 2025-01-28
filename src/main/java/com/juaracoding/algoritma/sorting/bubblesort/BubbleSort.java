package com.juaracoding.algoritma.sorting.bubblesort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {5, 12, 3, 19, 1, 47};
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("");
         bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]  + " ");
        }
    }
}
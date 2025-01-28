package com.juaracoding.algoritma.sorting.insertionsort;

public class InsertionB {
    public static void insertionSort(int[] arr) {
        //Looping array di mulai dari index 1;
        for (int i = 1; i < arr.length ; i++) {
            for (int j = i; j > 0 ; j--) {
                //2. looping ke 2 bandingkan index saat ini dengan index sebelumnya
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        System.out.println("Array sebelum diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        insertionSort(arr);
        System.out.println("\nArray setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

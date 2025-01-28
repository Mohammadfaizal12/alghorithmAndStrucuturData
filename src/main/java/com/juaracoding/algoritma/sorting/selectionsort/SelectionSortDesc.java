package com.juaracoding.algoritma.sorting.selectionsort;

import java.util.Scanner;
public class SelectionSortDesc {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i; // Asumsi elemen terbesar ada di index i
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array sebelum diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        selectionSort(arr);
        System.out.println("\nArray setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

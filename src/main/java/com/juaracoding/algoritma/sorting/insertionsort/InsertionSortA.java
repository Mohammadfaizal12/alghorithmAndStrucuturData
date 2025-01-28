package com.juaracoding.algoritma.sorting.insertionsort;
import java.util.Scanner;

public class InsertionSortA {

    // Fungsi untuk melakukan Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Fungsi untuk mencetak array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah elemen: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Jumlah elemen harus lebih dari 0.");
                return;
            }
            int[] arr = new int[n];
            System.out.println("Masukkan elemen-elemen array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Array sebelum diurutkan:");
            printArray(arr);
            // Panggil fungsi Insertion Sort
            insertionSort(arr);
            System.out.println("Array setelah diurutkan:");
            printArray(arr);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan angka.");
        } finally {
            scanner.close();
        }
    }
}

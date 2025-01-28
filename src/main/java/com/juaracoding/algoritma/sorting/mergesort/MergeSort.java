package com.juaracoding.algoritma.sorting.mergesort;

public class MergeSort {

    // Fungsi utama untuk mengurutkan array menggunakan Merge Sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Temukan titik tengah
            int mid = (left + right) / 2;

            // Pecah bagian kiri
            mergeSort(array, left, mid);

            // Pecah bagian kanan
            mergeSort(array, mid + 1, right);

            // Gabungkan bagian yang sudah terurut
            merge(array, left, mid, right);
        }
    }

    // Fungsi untuk menggabungkan dua sub-array
    public static void merge(int[] array, int left, int mid, int right) {
        // Ukuran sub-array kiri dan kanan
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Buat array sementara untuk menyimpan sub-array kiri dan kanan
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Salin data ke array sementara
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Indeks awal dari sub-array kiri, kanan, dan array gabungan
        int i = 0, j = 0, k = left;

        // Gabungkan kembali sub-array kiri dan kanan ke array utama
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Salin elemen yang tersisa dari leftArray, jika ada
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Salin elemen yang tersisa dari rightArray, jika ada
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Fungsi utama untuk menjalankan program
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Array sebelum diurutkan:");
        printArray(array);

        // Panggil fungsi mergeSort
        mergeSort(array, 0, array.length - 1);

        System.out.println("Array setelah diurutkan:");
        printArray(array);
    }

    // Fungsi untuk mencetak array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

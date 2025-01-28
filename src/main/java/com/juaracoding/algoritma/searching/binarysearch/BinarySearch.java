package com.juaracoding.algoritma.searching.binarysearch;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int [] arr, int target) {
        int low = 0;
        int high = arr.length - 1; //mengambil index akhir array
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        //jika target tidak ditemukan
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array terurut
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Meminta pengguna untuk memasukkan angka yang ingin dicari
        System.out.println("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        // Memanggil fungsi binarySearch untuk mencari target
        int result = binarySearch(arr, target);


        if (result != -1) {
            System.out.println("Angka ditemukan di indeks: " + result);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        scanner.close();

    }

}

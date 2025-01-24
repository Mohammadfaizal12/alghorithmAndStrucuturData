package com.juaracoding.algoritma.binarysearch;
import java.util.Scanner;


public class LatihanBinarySearch {
    public static int binarySearch(int [] arr, int target) {
        int indexAwalArray = 0;
        int indexTerakhirArray = arr.length - 1;
        while (indexAwalArray <= indexTerakhirArray) {
            int nilaiTengah = (indexAwalArray + indexTerakhirArray) / 2;
            if (arr[nilaiTengah] == target) {
                return nilaiTengah;
            } else if (arr[nilaiTengah] > target) {
                indexTerakhirArray = nilaiTengah - 1;
            } else {
                indexAwalArray = nilaiTengah + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1, 5, 9, 12, 15, 20};
        System.out.println("Masukan Angka Yang Di Cari : ");
        int cari = scanner.nextInt();
        int hasil = binarySearch(arr, cari);
        if (hasil != -1) {
            System.out.println("Angka Di Temukan : " + hasil);
        } else {
            System.out.println("Angka Tidak Di Temukan !!");
        }
    }
}

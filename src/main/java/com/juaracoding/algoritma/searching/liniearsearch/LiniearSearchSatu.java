package com.juaracoding.algoritma.searching.liniearsearch;

import java.util.Scanner;

public class LiniearSearchSatu {

    public static int liniearSearch(int [] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] daftarHarga = {125000, 230000, 175000, 300000};

        System.out.println("Masukkan harga yang ingin dicari: ");
        int hargadicari = scanner.nextInt();

        int result = liniearSearch(daftarHarga, hargadicari);


        if (result != -1) {
            System.out.println("Harga Di Temukan pada indeks " + result);
        } else {
            System.out.println("Harga Tidak Di Temukan");
        }

        scanner.close();


    }
}

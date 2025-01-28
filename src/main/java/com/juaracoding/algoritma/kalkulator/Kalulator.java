package com.juaracoding.algoritma.kalkulator;
import java.util.Scanner;
public class Kalulator {
    public static void main(String[] args) {
        Scanner bca = new Scanner(System.in);
        int bac;
        do {
            System.out.println("=== Aplikasi kalkulator Sederhana ===");
            System.out.println("1. penambahan");
            System.out.println("2. perkalian");
            System.out.println("3. pembagian");
            System.out.println("4. pemangkatan");
            System.out.println("5. keluar");
            System.out.print("pilih (1-4) untuk menggunakan kalkulator & (5) untuk keluar : ");
            bac = bca.nextInt();
            switch (bac) {
                case 1:
                    System.out.println("Angka Pertama");
                    //angka pertama
                    int aab = bca.nextInt();
                    //angka kedua aba
                    System.out.println("Angka Kedua");
                    int aba = bca.nextInt();
                    System.out.println("Hasil Penambahan: " + (aab + aba));
                    break;

                case 2:
                    System.out.println("Angka Pertama");
                    //angka pertama
                    int baa = bca.nextInt();
                    System.out.println("Angka Kedua");
                    //angka kedua
                    int  abb = bca.nextInt();
                    System.out.println("Hasil Perkalian : " + (baa * abb));
                    break;

                case 3:
                    System.out.println("Angka Pertama : ");
                    //angka pertama
                    int bba = bca.nextInt();
                    System.out.println("Angka Kedua : ");
                    //angka kedua
                    int bbb = bca.nextInt();
                    if (bbb != 0) {
                        System.out.println("Hasil pembagian : " + (bba / bbb));
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                case 4:
                    System.out.println("Angka Pertama : ");
                    //angka pertama
                    int abc = bca.nextInt();
                    System.out.println("Angka Kedua : ");
                    //angka kedua pangkat'a
                    int acb = bca.nextInt();
                    System.out.println("hasil Pemangkatan dari " + abc + " pangkat " + acb + " adalah : " + Math.pow(abc, acb));
                case 5:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("pilih dari 1-5");
            }
        } while (bac != 5);
        bca.close();
    }
}

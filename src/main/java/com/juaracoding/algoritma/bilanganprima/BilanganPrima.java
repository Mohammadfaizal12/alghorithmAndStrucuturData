package com.juaracoding.bilanganprima;
import java.util.Scanner;
public class BilanganPrima {
    public static boolean isPrime(int baa) {
        if (baa <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(baa); i++) {  // Cek hingga akar kuadrat dari n
            if (baa % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner abb = new Scanner(System.in);
        System.out.println("Masukkan index awal (X): ");
        int aab = abb.nextInt();
        System.out.println("Masukkan batas index (Y): ");
        int aba = abb.nextInt();
        System.out.println("Bilangan prima antara " + aab + " dan " + aba + ": ");
        for (int bba = aab; bba <= aba; bba++) {
            if (isPrime(bba)) {
                System.out.print(bba + ",");
            }
        }
        abb.close();
    }
}

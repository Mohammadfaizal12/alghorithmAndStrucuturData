package com.juaracoding.testeknis.aplikasisimple;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Kredit {
    public static void hitungKredit() {
        try (Scanner sc = new Scanner(System.in)) {
            boolean lanjut = true;
            while (lanjut) {
                try {
                    System.out.println("=== Masukkan Harga Kendaraan (OTR) ===");
                    String otrInput = sc.nextLine().replace(".", "");
                    double otr = Double.parseDouble(otrInput);
                    System.out.println("=== Masukkan Down Payment (dengan format %) ===");
                    String downPaymentStr = sc.nextLine().replace("%", "");
                    double downPayment = Double.parseDouble(downPaymentStr);
                    System.out.println("=== Masukkan Jangka Waktu Pembayaran (masukkan dalam bentuk bulan) ===");
                    int jangkaWaktu = Integer.parseInt(sc.nextLine());
                    // Menghitung Down Payment dan Pokok Utang
                    double hitungDownPayment = otr * (downPayment / 100);
                    double pokokUtang = otr - hitungDownPayment;
                    // Menentukan bunga
                    double bunga = 0.0;
                    if (jangkaWaktu <= 12) {
                        bunga = 0.12;
                    } else if (jangkaWaktu > 12 && jangkaWaktu <= 24) {
                        bunga = 0.14;
                    } else if (jangkaWaktu > 24) {
                        bunga = 0.165; // 16.5%
                    }
                    // Format Rupiah
                    Locale localeID = new Locale("id", "ID");
                    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
                    // Menghitung Angsuran Per Bulan
                    double angsuranPerbulan = (pokokUtang + (pokokUtang * bunga)) / jangkaWaktu;
                    // Menampilkan hasil
                    System.out.println("\n=== Rincian Kredit Mobil ===");
                    System.out.printf("Harga Mobil (OTR): %s%n", formatRupiah.format(otr));
                    System.out.printf("Down Payment (DP): %s%n", formatRupiah.format(hitungDownPayment));
                    System.out.printf("Utang Pokok: %s%n", formatRupiah.format(pokokUtang));
                    System.out.printf("Bunga (%d bulan): %.2f%%%n", jangkaWaktu, bunga * 100);
                    System.out.printf("Angsuran Per Bulan: %s%n", formatRupiah.format(angsuranPerbulan));
                    System.out.println("\nApakah Anda ingin menghitung kredit lainnya? (ketik 'y' untuk ya, 'n' untuk tidak)");
                    String jawaban = sc.nextLine();
                    if (!jawaban.equalsIgnoreCase("y")) {
                        lanjut = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Pastikan Anda memasukkan angka dengan format yang benar.");
                }
            }
        }
    }
    public static void main(String[] args) {
        hitungKredit();
    }
}

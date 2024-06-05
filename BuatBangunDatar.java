package com.week9;

import java.util.Scanner;

public class BuatBangunDatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======= Pilih Bangun Datar ========");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }

            BangunDatar bangunDatar;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi persegi: ");
                    int sisi = scanner.nextInt();
                    bangunDatar = new BangunDatar(sisi);
                    System.out.println("Luas Persegi: " + bangunDatar.luas(sisi));
                    break;

                case 2:
                    System.out.print("Masukkan panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar: ");
                    int lebar = scanner.nextInt();
                    bangunDatar = new BangunDatar(panjang, lebar);
                    System.out.println("Luas Persegi Panjang: " + bangunDatar.luas(panjang, lebar));
                    break;

                case 3:
                    System.out.print("Masukkan alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();
                    bangunDatar = new BangunDatar();
                    System.out.println("Luas Segitiga: " + bangunDatar.luas(alas, tinggi));
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();
                    bangunDatar = new BangunDatar();
                    System.out.println("Luas Lingkaran: " + bangunDatar.luas(jariJari));
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}

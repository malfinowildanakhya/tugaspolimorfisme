package com.week9;

import java.util.Scanner;

public class BuatBangunRuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======= Pilih Bangun Ruang ========");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1-4): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }

            BangunRuang bangunRuang;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    int sisi = scanner.nextInt();
                    bangunRuang = new BangunRuang(sisi);
                    System.out.println("Volume Kubus: " + bangunRuang.volume(sisi));
                    break;

                case 2:
                    System.out.print("Masukkan panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar: ");
                    int lebar = scanner.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int tinggi = scanner.nextInt();
                    bangunRuang = new BangunRuang(panjang, lebar);
                    System.out.println("Volume Balok: " + bangunRuang.volume(panjang, lebar, tinggi));
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    bangunRuang = new BangunRuang(radius);
                    System.out.println("Volume Tabung: " + bangunRuang.volume(radius, tinggiTabung));
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}

package com.week9;

public class BangunRuang extends BangunDatar {
    public BangunRuang(int sisi) {
        super(sisi);
    }

    public BangunRuang(int panjang, int lebar) {
        super(panjang, lebar);
    }

    public BangunRuang(double diameter) {
        super(diameter);
    }

    // Method to calculate volume for a cube
    public int volume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Method to calculate volume for a rectangular prism
    public int volume(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    // Method to calculate volume for a cylinder
    public double volume(double radius, double tinggi) {
        return Math.PI * radius * radius * tinggi;
    }
}

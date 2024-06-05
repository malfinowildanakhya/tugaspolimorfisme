package com.week9;

public class BangunDatar {
    private int panjang;
    private int lebar;
    private int diameter;
    private int sisi;
    private static final double PI = 3.14;

    public BangunDatar() {
        // Default constructor
    }

    // Constructor for square
    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    // Constructor for rectangle
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Constructor for circle
    public BangunDatar(double diameter) {
        this.diameter = (int) diameter;
    }

    // Getter and setter methods
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    // Method overloading for area calculation
    public int luas(int sisi) {
        return sisi * sisi;
    }

    public int luas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public double luas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public double luas(double radius) {
        return PI * radius * radius;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan05c;

/**
 *
 * @author LENOVO
 */
public class Hitung {
    void methodTambah(int a, int b)
    {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    void methodKurang(int a, int b)
    {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    void methodKali(int a, int b)
    {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    void methodBagi(int a, int b)
    {
        System.out.println(a + " / " + b + " = " + (a / b));
    }
    void methodMod(int a, int b)
    {
        System.out.println(a + " % " + b + " = " + (a % b));
    }
    
    public static void main(String args[])
    {
        System.out.println("Perhitungan Aritmatika : ");
        Hitung objHitung = new Hitung();
        
        objHitung.methodTambah(10, 50);
        objHitung.methodKurang(10, 50);
        objHitung.methodKali(50, 10);
        objHitung.methodBagi(50, 10);
        objHitung.methodMod(51, 10);
    }
}

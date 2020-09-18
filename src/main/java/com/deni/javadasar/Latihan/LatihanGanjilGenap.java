package com.deni.javadasar.Latihan;

import java.util.Scanner;

public class LatihanGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka anda = ");
        int angka = input.nextInt();

        if(angka%2==0){
            System.out.println("bilangan genap");
        }else{
            System.out.println("bilangan ganjil");
        }
    }
}

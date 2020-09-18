package com.deni.javadasar.Latihan;

import java.util.Scanner;

public class LatihanDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT BERBELANJA");
        System.out.println("SAAT INI KAMU SEDANG ADA PROMO");
        System.out.println("beli 100-120 unit diskon 15 %");
        System.out.println("beli 120- loop unit diskon 25 %");

        System.out.println("Harga Produk = ");
        int i = input.nextInt();
        System.out.println("Jumlah Pembelian = ");
        int j = input.nextInt();
        double diskon = 0;
        if(j>120){
            diskon = 0.20;
        } else if(j>100){
            diskon =0.15;
        }

        int harga_awal = i * j ;
        int harga_setelah_diskon = (int) (harga_awal - (harga_awal * diskon));
        System.out.println("Harga awal = " + harga_awal);
        System.out.println("Diskon yang diberikan = " + (diskon*100));
        System.out.println(" Jumlah diskon = " + (harga_awal* diskon));
        System.out.println("Harga Setelaah Diskon = " + harga_setelah_diskon);
    }
}

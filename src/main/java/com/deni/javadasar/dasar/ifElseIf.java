package com.deni.javadasar.dasar;

import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan masukan uang anda = ");
        int bayar = input.nextInt();

        if(bayar < 80000){
            System.out.println("Anda mendapatkan diskon");
            if(bayar < 50000){
                System.out.println("anda mendapatkan sepatu ");
                    if(bayar < 40000){
                        System.out.println("terimakasih");
                    }else{
                        System.out.println(" uang anda 40000");
                    }
            }else{
                System.out.println(" uang anda 50000");
            }
        }else {
            System.out.println("maaf uang anda kurang");
        }
    }
}

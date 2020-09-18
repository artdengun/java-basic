package com.deni.javadasar.Latihan;

import java.util.Scanner;

public class LatihanBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berat Badan Anda = ");
        double berat = input.nextDouble();
        System.out.println("Tinggi Badan Anda = ");
        double tinggi = input.nextDouble();
        System.out.println("Jenis Kelamin (P/L) = ");
        String jenis = input.next();
        tinggi /= 100;
        // rumus
        double bmi = berat/(tinggi*tinggi);
        // laki laki
        int obesitas    =  27;
        int kegemukan   =  23;
        int normal      =  17;
        if(jenis.equals("P")){
            obesitas = 25;
            normal = 18;
        }

        if(bmi>obesitas){
            System.out.println("Obesitas");
        }else if(bmi>kegemukan){
            System.out.println("Kegemukan");
        }else if(bmi>normal){
            System.out.println("normal");
        }else {
            System.out.println("Kurus");
        }
    }
}

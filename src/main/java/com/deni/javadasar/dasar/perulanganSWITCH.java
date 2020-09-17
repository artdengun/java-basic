package com.deni.javadasar.dasar;

import java.util.Scanner;

public class perulanganSWITCH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DAFTAR NAMA HEWAN  ");
        System.out.println("1. kambing");
        System.out.println("2. kucing");
        System.out.println("3. kerbau");
        System.out.println("4. mantan`");

        System.out.println("Masukan pilihan anda");
        int nilai = input.nextInt();

        switch (nilai){
            case 1:
                System.out.println("anda memilih kambing");
                break;
            case 2:
                System.out.println("anda memilih Kucing");
                break;
            case 3:
                System.out.println("Anda memilih kerbau");
                break;
            case 4:
                System.out.println("Anda memilih mantan");
                break;
            default:
                System.out.println("ANda tidak memilih apa apa");
        }
    }
}

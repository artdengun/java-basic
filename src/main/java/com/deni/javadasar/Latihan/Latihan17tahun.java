package com.deni.javadasar.Latihan;

import java.util.Scanner;

public class Latihan17tahun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapakah Umur anda ? = ");
        int umur = input.nextInt();
        if(umur >= 17){
            System.out.println("Umur anda cukup");
        }else{
            System.out.println("Umura anda belum cukup ");
        }
    }
}

package com.deni.javadasar.dasar;

import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan umur anda = ");
        int umur = input.nextInt();

        if(umur>=17){
            System.out.println("SILAHKAN MASUK");
        }else{
            System.out.println("Maaf umur anda ");
        }
    }
}

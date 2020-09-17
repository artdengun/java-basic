package com.deni.javadasar.dasar;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("silahkan masukan data anda = ");
        double r = input.nextDouble();
        double luas = 3.14 * r * r;
        System.out.println("Ruas bernilai = " + luas);
    }
}

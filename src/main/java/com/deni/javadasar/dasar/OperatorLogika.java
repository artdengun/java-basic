package com.deni.javadasar.dasar;

public class OperatorLogika {
    public static void main(String[] args) {
        // operator logika adalah membandingkan dua boolean

        int a = 100;
        int b = 100;

        boolean satu = a==b;
        boolean dua  = a!=b;

        System.out.println(satu&&dua);
        System.out.println(satu||dua);
        System.out.println(!dua);
    }
}

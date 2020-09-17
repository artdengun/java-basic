package com.deni.javadasar.dasar;

public class TipeData {
    public static void main(String[] args) {
        // tipe data Integer ( byte, short, int, long) , FLoating Point ( float, double) , Karakter ( char ), Boolean ( boolean )
        // karakter
        byte    a   = 10;
        short   b   = 11;
        int     c   = 12;
        long    d   = 13;

        // floating point

        float inifloat          = 3.7145f;
        float inifloatCasting   = (float) 3.74545;
        double iniDouble        = 3.14464;

        // Karakter
        char karakter       = 'A';
        char karakterAngka  = 65;

        // boolean

        boolean deniGanteng= false;
        boolean deniJelek = true;


        System.out.println("=================================");
        System.out.println(" ini byte " +  a);
        System.out.println(" ini short " + b);
        System.out.println(" ini int " + c);
        System.out.println(" ini long " + d);
        System.out.println("=================================");
        System.out.println(inifloat);
        System.out.println(inifloatCasting);
        System.out.println(iniDouble);
        System.out.println("=================================");
        System.out.println(karakter);
        System.out.println(karakterAngka);
        System.out.println("=================================");
        System.out.println(deniGanteng);
        System.out.println(deniJelek);
        System.out.println("=================================");;
    }
}

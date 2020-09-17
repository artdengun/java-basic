package com.deni.javadasar.dasar;

public class OperatorBitwise {
    public static void main(String[] args) {
        // operator bitwise adalah menkonversi bilangan biner
        // && -> nilai harus benar semua agar bernilai true
        // | -> nilai harus ada true satu agar bernilai true
        // ! -> mengubah nilai false menjadi true

        int a = 10;
        int b = 20;

        System.out.println(a&b);
        System.out.println(a|b);
    }
}

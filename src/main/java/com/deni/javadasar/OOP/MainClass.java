package com.deni.javadasar.OOP;

public class MainClass {
    public static void main(String[] args) {
        VariableClassAndInstance s1 = new VariableClassAndInstance();
        s1.nama = " Deni Gunawan ";
        s1.ip = 3.14;

        VariableClassAndInstance s2 = new VariableClassAndInstance();
        s2.nama = " Arum Nurbaeti";
        s2.ip   = 3.48;

        System.out.println(s1.getNama());
        System.out.println(s2.getNama());

        s1.setIp(4.00);
        s2.setIp(3.5);
    }
}

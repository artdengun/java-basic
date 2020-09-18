package com.deni.javadasar.dasar;

public class perulanganBreakAndContinue {
    public static void main(String[] args) {
        int i = 1;

        while (i<=10){
            System.out.println("hallo " + i );
            i++;

            if (i==9){
                continue;
            }

            if(i==8){
                break;
            }
        }
    }
}

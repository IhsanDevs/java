package com.ihsandevs.belajar;

public class OperatorLogika {
    public static void main(String[] args) {
        
        // OR, AND, NOT dan XOR
        boolean a = true;
        boolean b = false;
        System.out.println("==== OR =====");
        System.out.println(a || b);

        boolean c = true;
        boolean d = false;
        System.out.println("==== AND =====");
        System.out.println(c && d);

        boolean e = true;
        boolean f = false;
        System.out.println("==== AND =====");
        System.out.println(e ^ f);

        boolean g = true;
        boolean h = false;
        System.out.println("==== NOT =====");
        System.out.println(g != h);
    }
}

package com.ihsandevs.belajar;

import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        Scanner inputNamaScanner = new Scanner(System.in);

        String nama = inputNamaScanner.next();

        System.out.printf("Halo %s \n", nama);
    }
}

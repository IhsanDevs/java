package com.ihsandevs.belajar;

import java.util.Scanner;

public class TernaryOperator extends Function {
    public static void main(String[] args) {
        clear_console();
        String passwordString, statusString, realPasswordString;
        System.out.print("Masukkan password: ");
        try (Scanner inputPasswordScanner = new Scanner(System.in)) {
            passwordString = inputPasswordScanner.next().toString();
        }

        realPasswordString = "12345678";
        System.out.printf("Password kamu: \"%s\"\n", passwordString);
        statusString = (passwordString.equals(realPasswordString)) ? "Berhasil login." : "Password Salah!";
        System.out.println(statusString);
    }
}

package com.ihsandevs.belajar;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String inputString;
        Scanner inputUserScanner = new Scanner(System.in);

        System.out.print("Nama: ");
        inputString = inputUserScanner.next();

        switch (inputString) {
            case "Ihsan":
                System.out.println(inputString + " hadir pak");
                break;
            case "Yusuf":
                System.out.println(inputString + " hadir pak");
                break;
            default:
                System.out.println(inputString + " tidak hadir pak");
                break;
        }
    }
}

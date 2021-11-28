package com.ihsandevs.belajar;

import java.util.Random;
import java.util.Scanner;

/*
    game batu gunting kertas ini hanyalah
    sebagai praktek materi User Input
    dari channel KelasTerbuka. kunjungi
    githubnya di https://github.com/KelasTerbuka.
*/

public class InputUser {
    public static void main(String[] args) {
        String hasilPlayerString, hasilComputerString, endGameString;
        int computer, angka;
        Scanner inputUserScanner = new Scanner(System.in);

        try {
            ClearConsole();
            System.out.println("Pilih kertas(1), gunting(2) atau batu(3) :");
            angka = inputUserScanner.nextInt();

            if (angka <= 0 || angka > 3) {
                System.out.println("Angka yang kamu harus diantara 1 - 3.");
                System.exit(0);
            }
            String[] bgkStrings = { "kertas", "gunting", "batu" };

            computer = new Random().nextInt((3 - 1) + 1) + 1;

            hasilPlayerString = bgkStrings[angka - 1];
            hasilComputerString = bgkStrings[computer - 1];

            if ((angka == 1 && computer == 3) || (angka == 2 && computer == 1) | (angka == 3 && computer == 2)) {
                endGameString = "Kamu menang.\n";
            } else if (angka == computer) {
                endGameString = "Hasil seri. Silahkan mengulangi jika kamu mau.\n";
            } else {
                endGameString = "Kamu kalah.\n";
            }

            System.out.printf("Player = %s\nKomputer = %s\nStatus = %s", hasilPlayerString, hasilComputerString,
                    endGameString);

        } catch (Exception e) {
            System.out.println("Oups.. error : " + e.getMessage());
        }
    }

    public static void ClearConsole() {
        try {
            String operatingSystem = System.getProperty("os.name"); // Check the current operating system

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

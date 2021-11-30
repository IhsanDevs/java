package com.ihsandevs.belajar;

public class LoopingBersarang {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}

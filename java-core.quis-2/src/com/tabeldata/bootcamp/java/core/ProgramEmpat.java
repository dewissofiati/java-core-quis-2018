package com.tabeldata.bootcamp.java.core;

import java.math.*;

public class ProgramEmpat {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i % 2 == 0) {

                    System.out.print("  " + (i * j) + "  ");
                }

                if (i % 2 == 1) {

                    System.out.print(" " + (Math.pow(i, j)) + " ");
                }
            }
            System.out.println();
        }

    }
}
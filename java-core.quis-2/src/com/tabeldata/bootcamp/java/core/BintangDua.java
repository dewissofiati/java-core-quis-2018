package com.tabeldata.bootcamp.java.core;
public class BintangDua{
    public static void main(String[] args){
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= +(2 * i); j++) {
                // if (j == j + 2)
                // break;
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
package com.tabeldata.bootcamp.java.core;
public class Bintang{
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
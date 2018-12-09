package tdi.training.java.core;

import tdi.training.java.core.data.LatihanNo3;
import tdi.training.java.core.service.LatihanNo2;

public class LatihanNo1{
    public static void main(String[] args){
        LatihanNo2 cetak = new LatihanNo2();
        System.out.println("Nama lengkap saya adalah " + cetak.setNamaLengkap());
    }
}
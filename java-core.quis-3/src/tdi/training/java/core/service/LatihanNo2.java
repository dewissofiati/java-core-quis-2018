package tdi.training.java.core.service;
import tdi.training.java.core.data.LatihanNo3;
public class LatihanNo2{
    public String setNamaLengkap(){
        LatihanNo3 tampil = new LatihanNo3();
        String ctk = tampil.getNamaLengkap();
        return ctk;
    }
}
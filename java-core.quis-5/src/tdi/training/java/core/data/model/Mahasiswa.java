package tdi.training.java.core.data.model;

import java.util.*;
import java.time.LocalDate;

public class Mahasiswa {

    private String nim, nama;
    private LocalDate tanggalLahir;
    private Integer angkatan;
    private Kelas kelas;

    public Mahasiswa(String nim, String nama, LocalDate tanggalLahir, Integer angkatan, Kelas kelas) {
        this.nim = nim;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.angkatan = angkatan;
        this.kelas = kelas;
    }

    public static void main(String[] args) {
        List<Mahasiswa> daftar = new ArrayList<>();
        Kelas ti = new Kelas("IF", 2011, "Teknik Informatika");
        Kelas si = new Kelas("SI", 2011, "Sistem Informasi");

        daftar.add(new Mahasiswa("10511148", "Dimas Maryanto", LocalDate.of(1992, 03, 11), 2014, ti));
        daftar.add(new Mahasiswa("10511150", "Muhamad Yusuf", LocalDate.of(1994, 01, 20), 2014, si));
        daftar.add(new Mahasiswa("10511160", "Adib", LocalDate.of(1995, 02, 12), 2014, ti));
        daftar.add(new Mahasiswa("10511170", "Hari Sapto Adi", LocalDate.of(1991, 03, 15), 2014, si));
        daftar.add(new Mahasiswa("10511110", "Hariaty", LocalDate.of(1992, 04, 16), 2014, ti));

        for (Mahasiswa m : daftar) {
            System.out.println(String.format("%s \t | %s \t | %s \t | %s \t | %s \t | %s \t ", m.nim, m.nama,
                    m.tanggalLahir, m.angkatan, m.kelas.getNama(), m.kelas.getJurusan()));
        }

    }
}
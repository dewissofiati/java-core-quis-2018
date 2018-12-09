package tdi.training.java.core.data.model;

public class Kelas {
    private String nama;
    private Integer tahunAjaran;
    private String jurusan;

    public Kelas(String nama, Integer tahunAjaran, String jurusan) {
        this.nama = nama;
        this.tahunAjaran = tahunAjaran;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(Integer tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

}
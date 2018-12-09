package tdi.training.java.core.data;

import java.util.Map;
import java.util.HashMap;

public class DataMahasiswaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("001", "Muhamad Yusuf");
        mahasiswa.put("002", "Dimas Maryanto");
        mahasiswa.put("006", "Hari Sapto Adi");
        mahasiswa.put("007", "Putri Harahap");
        mahasiswa.put("008", "Dewa Nyoman Santosa");
        mahasiswa.put("009", "Hariaty");
        mahasiswa.put("010", "Karina Virgi");

        // menampilkan list mahasiswa
        System.out.println("key || Value\n==========================");
        mahasiswa.forEach((key, value) -> {
            System.out.println(key + " || " + value);
        });

        // menampilkan key dengan nilai 10
        mahasiswa.forEach((k, v) -> {
            if (k.equals("010")) {
                System.out.println(String.format("Nama saya %s, nipnya %s", v, k));
            }
        });

    }
}
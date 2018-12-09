package tdi.training.java.core;

import tdi.training.java.core.model.aplikasi.Tabungan;
import java.math.BigDecimal;
import tdi.training.java.core.model.nasabah.Nasabah;
import tdi.training.java.core.model.nasabah.NasabahBadanUsaha;
import tdi.training.java.core.model.nasabah.NasabahPerorangan;

public class MainApp {
	public static void main(String[] ags) {
		NasabahPerorangan cetak = new NasabahPerorangan("621234", "Muhamad Yusuf", "Jl. Ujung berung no 123",
				"08123423434");

		System.out.println(
				String.format("nasabah [noIdentitas: %s, status: %s, namaLengkap: %s, saldo tabungan: %s]",
						getNasabah().getNomorIdentitas(), getNasabah()).isActive(),
				getNasabahPerorangan().getNamaLengkap(), getTabungan().getSaldo());

	}
}
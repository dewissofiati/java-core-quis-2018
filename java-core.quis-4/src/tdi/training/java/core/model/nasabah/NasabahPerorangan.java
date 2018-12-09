package tdi.training.java.core.model.nasabah;

import tdi.training.java.core.model.aplikasi.Tabungan;
import java.math.BigDecimal;

public class NasabahPerorangan extends Nasabah {

	@Override
	public String toString() {
		return "nasabah [noIdentitas: 62213424, status: false, namaLengkap: Dimas Maryanto, saldo tabungan: 0]";
	}

	public NasabahPerorangan() {
	}

	public NasabahPerorangan(String nomorIdentitas, String namaLengkap, String alamat, String nomorHp) {
		super.setNomorIdentitas(nomorIdentitas);
		super.setActive(false);
		super.setSaldo(BigDecimal.ZERO);
		this.setNamaLengkap(namaLengkap);
		this.setAlamatRumah(alamat);
		this.setNomorHp(nomorHp);
		Tabungan tab = new Tabungan();
		tab.setSukuBunga(0.1d);
		tab.setSaldo(BigDecimal.ZERO);
		tab.setKriteria("Tabungan Mapan");
		this.setTabungan(tab);
	}

	private String namaLengkap;
	private String alamatRumah;
	private String nomorHp;
	private String foto;
	private Tabungan tabungan;

	public String getNamaLengkap() {
		return this.namaLengkap;
	}

	public void setNamaLengkap(String x) {
		this.namaLengkap = x;
	}

	public String getAlamatRumah() {
		return this.alamatRumah;
	}

	public void setAlamatRumah(String x) {
		this.alamatRumah = x;
	}

	public String getNomorHp() {
		return this.nomorHp;
	}

	public void setNomorHp(String y) {
		this.nomorHp = y;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String x) {
		this.foto = x;
	}

	public Tabungan getTabungan() {
		return this.tabungan;
	}

	public void setTabungan(Tabungan tabungan) {
		this.tabungan = tabungan;
	}

}
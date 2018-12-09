package tdi.training.java.core.model.nasabah;

import tdi.training.java.core.model.aplikasi.Tabungan;

public class NasabahBadanUsaha extends Nasabah {

	public NasabahBadanUsaha() {
	}

	public NasabahBadanUsaha(String namaInstitusi, String nomorNpwp, String alamatKantor, Tabungan tabungan) {
		this.namaInstitusi = namaInstitusi;
		this.nomorNpwp = nomorNpwp;
		this.alamatKantor = alamatKantor;
		this.tabungan = tabungan;
	}

	private String namaInstitusi;
	private String nomorNpwp;
	private String alamatKantor;
	private Tabungan tabungan;

	public String getNamaInstitusi(){
		return this.namaInstitusi;
	}

	public void setNamaInstitusi(String value){
		this.namaInstitusi = value;
	}

	public String getNomorNPWP(){
		return this.nomorNpwp;	
	}

	public void setNomorNpwp(String value){
		this.nomorNpwp = value;
	}

	public String getAlamatKantor(){
		return this.alamatKantor;
	}

	public void setAlamatKantor(String value){
		this.alamatKantor = value;
	}

	public Tabungan getTabungan(){
		return this.tabungan;
	}

	public void setTabungan(Tabungan value){
		this.tabungan = value;
	}
}
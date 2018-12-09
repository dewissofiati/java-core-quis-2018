package tdi.training.java.core.model.aplikasi;

import java.math.BigDecimal;

public class Tabungan{


	public Tabungan(){
		this.setAkrual(BigDecimal.ZERO);
	}

	public Tabungan(Double sukuBunga, BigDecimal saldo, BigDecimal akrual, String kriteriaProduct) {
		this.sukuBunga = sukuBunga;
		this.saldo = saldo;
		this.akrual = akrual;
		this.kriteriaProduct = kriteriaProduct;
	}

	private Double sukuBunga;
	private BigDecimal saldo;
	private BigDecimal akrual;
	private String kriteriaProduct;

	public Double getSukuBunga(){
		return this.sukuBunga;
	}

	public void setSukuBunga(Double value){
		this.sukuBunga = value;
	}

	public BigDecimal getSaldo(){
		return this.saldo;
	}

	public void setSaldo(BigDecimal value){
		this.saldo = value;
	}

	public BigDecimal getAkrual(){
		return this.akrual;
	}

	public void setAkrual(BigDecimal akrual){
		this.akrual = akrual;
	}

	public String getKriteria(){
		return this.kriteriaProduct;
	}

	public void setKriteria(String value){
		this.kriteriaProduct = value;
	}
}
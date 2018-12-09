package tdi.training.java.core.model.nasabah;

import java.math.*;

public class Nasabah {

	public Nasabah() {
	}

	public Nasabah(String noIdentitas, boolean active, BigDecimal saldo) {
		this.noIdentitas = noIdentitas;
		this.active = active;
		this.saldo = saldo;
	}

	private String noIdentitas;
	private boolean active;
	private BigDecimal saldo;

	public String getNomorIdentitas(){
		return this.noIdentitas;
	}

	public void setNomorIdentitas(String x){
		this.noIdentitas = x;
	}

	public boolean isActive(){
		return this.active;
	}

	public void setActive(boolean x){
		this.active = x;
	}

	public BigDecimal getSaldo(){
		return this.saldo;
	}	

	public void setSaldo(BigDecimal y){
		this.saldo = y;
	}
}
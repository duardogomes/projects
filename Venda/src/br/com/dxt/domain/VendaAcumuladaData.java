package br.com.dxt.domain;

import java.util.Date;

public class VendaAcumuladaData {

	private Date data;
	private Double valor;
	
	public VendaAcumuladaData(Date data, Double valor){
		this.data = data;
		this.valor = valor;
	}
	
	public Date getData(){
		return data;
	}
	
	public Double getValor(){
		return valor;
	}

	@Override
	public String toString() {
		return "VendaAcumuladaData [data=" + data + ", valor=" + valor + "]";
	}

	
	
	
}

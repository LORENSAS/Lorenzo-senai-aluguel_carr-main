package com.LorenzoLocacao.models.view;
/**
 * Classe que representa a abstra��o das views de loca��o transformadas em string.
 * 
 * @author Widson.
 * @version 1.0.
 */
public class LocacaoView {

	private String data;
	private String carro;
	private String moto;
	private String cliente;
	private String agencia;
	private String seguro;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public String getMoto() {
		return moto;
	}

	public void setMoto(String moto) {
		this.moto = moto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}
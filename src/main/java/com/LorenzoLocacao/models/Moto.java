package com.LorenzoLocacao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe que representa a abstração de todas as motos do sistema.
 * 
 * @author Widson.
 * @version 1.0.
 */
@Entity
public class Moto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	private boolean cbs;
	private String cilindradas;
	private String renavam;
	private String modelo;
	private String marca;
	private String potencia;
	private String anofab;
	private String anomod;
	private String cor;
	private boolean combgasolina;
	private boolean combetanol;
	private boolean abs;
	private String dataaquisicao;
	private String localizacao;
	private String porcentnivelcomb;
	private boolean gps;
	private boolean alarme;

	@OneToOne
	private Locacao locacao;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public boolean isCbs() {
		return cbs;
	}

	public void setCbs(boolean cbs) {
		this.cbs = cbs;
	}

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getAnofab() {
		return anofab;
	}

	public void setAnofab(String anofab) {
		this.anofab = anofab;
	}

	public String getAnomod() {
		return anomod;
	}

	public void setAnomod(String anomod) {
		this.anomod = anomod;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isCombgasolina() {
		return combgasolina;
	}

	public void setCombgasolina(boolean combgasolina) {
		this.combgasolina = combgasolina;
	}

	public boolean isCombetanol() {
		return combetanol;
	}

	public void setCombetanol(boolean combetanol) {
		this.combetanol = combetanol;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	public String getDataaquisicao() {
		return dataaquisicao;
	}

	public void setDataaquisicao(String dataaquisicao) {
		this.dataaquisicao = dataaquisicao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getPorcentnivelcomb() {
		return porcentnivelcomb;
	}

	public void setPorcentnivelcomb(String porcentnivelcomb) {
		this.porcentnivelcomb = porcentnivelcomb;
	}

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	public boolean isAlarme() {
		return alarme;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
}
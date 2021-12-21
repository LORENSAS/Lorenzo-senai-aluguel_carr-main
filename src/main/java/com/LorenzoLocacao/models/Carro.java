package com.LorenzoLocacao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Type;

/**
 * Classe que representa a abstra��o de todos os carros do sistema.
 * 
 * @author Widson.
 * @version 1.0.
 */
@Entity
public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	private String renavam;
	private String modelo;
	private String marca;
	private String potencia;
	private String anofab;
	private String anomod;
	private String cor;
	@Type(type = "numeric_boolean")
	private boolean combgasolina;
	@Type(type = "numeric_boolean")
	private boolean combetanol;
	@Type(type = "numeric_boolean")
	private boolean abs;
	private String dataaquisicao;
	private String localizacao;
	private String porcentnivelcomb;
	@Type(type = "numeric_boolean")
	private boolean combdiesel;
	@Type(type = "numeric_boolean")
	private boolean combgnv;
	@Type(type = "numeric_boolean")
	private boolean arcondicionado;
	@Type(type = "numeric_boolean")
	private boolean vidroeletrico;
	@Type(type = "numeric_boolean")
	private boolean gps;
	@Type(type = "numeric_boolean")
	private boolean travas;
	@Type(type = "numeric_boolean")
	private boolean alarme;
	
	@OneToOne
	private Locacao locacao;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
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

	public boolean isCombdiesel() {
		return combdiesel;
	}

	public void setCombdiesel(boolean combdiesel) {
		this.combdiesel = combdiesel;
	}

	public boolean isCombgnv() {
		return combgnv;
	}

	public void setCombgnv(boolean combgnv) {
		this.combgnv = combgnv;
	}

	public boolean isArcondicionado() {
		return arcondicionado;
	}

	public void setArcondicionado(boolean arcondicionado) {
		this.arcondicionado = arcondicionado;
	}

	public boolean isVidroeletrico() {
		return vidroeletrico;
	}

	public void setVidroeletrico(boolean vidroeletrico) {
		this.vidroeletrico = vidroeletrico;
	}

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	public boolean isTravas() {
		return travas;
	}

	public void setTravas(boolean travas) {
		this.travas = travas;
	}

	public boolean isAlarme() {
		return alarme;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}
}
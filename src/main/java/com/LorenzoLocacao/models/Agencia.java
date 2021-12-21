package com.LorenzoLocacao.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe que representa a abstração de todas as agências do sistema,
 * inclusive seus respectivos endereços.
 * 
 * @author Widson.
 * @version 1.0.
 */
@Entity
public class Agencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	private String nomefantasia;
	private String cnpj;
	private String inscricaoestadual;
	private String endrua;
	private String endnumero;
	private String endcomplemento;
	private String endbairro;
	private String endcidade;
	private String endunidadefederativa;
	private String endcep;
	private String telefone;
	private String gerenteresponsavel;

	@OneToOne
	private Locacao locacao;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNomefantasia() {
		return nomefantasia;
	}

	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoestadual() {
		return inscricaoestadual;
	}

	public void setInscricaoestadual(String inscricaoestadual) {
		this.inscricaoestadual = inscricaoestadual;
	}

	public String getEndrua() {
		return endrua;
	}

	public void setEndrua(String endrua) {
		this.endrua = endrua;
	}

	public String getEndnumero() {
		return endnumero;
	}

	public void setEndnumero(String endnumero) {
		this.endnumero = endnumero;
	}

	public String getEndcomplemento() {
		return endcomplemento;
	}

	public void setEndcomplemento(String endcomplemento) {
		this.endcomplemento = endcomplemento;
	}

	public String getEndbairro() {
		return endbairro;
	}

	public void setEndbairro(String endbairro) {
		this.endbairro = endbairro;
	}

	public String getEndcidade() {
		return endcidade;
	}

	public void setEndcidade(String endcidade) {
		this.endcidade = endcidade;
	}

	public String getEndunidadefederativa() {
		return endunidadefederativa;
	}

	public void setEndunidadefederativa(String endunidadefederativa) {
		this.endunidadefederativa = endunidadefederativa;
	}

	public String getEndcep() {
		return endcep;
	}

	public void setEndcep(String endcep) {
		this.endcep = endcep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getGerenteresponsavel() {
		return gerenteresponsavel;
	}

	public void setGerenteresponsavel(String gerenteresponsavel) {
		this.gerenteresponsavel = gerenteresponsavel;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
}
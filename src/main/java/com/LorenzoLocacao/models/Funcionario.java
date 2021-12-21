package com.LorenzoLocacao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe que representa a abstração de todos os funcionários do sistema,
 * inclusive seus respectivos endereços.
 * 
 * @author Widson.
 * @version 1.0.
 */
@Entity
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	private String cargo;
	private String nome;
	private String rg;
	private String cpf;
	private String datanascimento;
	private String naturalidade;
	private String endrua;
	private String endnumero;
	private String endcomplemento;
	private String endbairro;
	private String endcidade;
	private String endunidadefederativa;
	private String endcep;
	private String telefone;
	private String email;

	@OneToOne
	private Locacao locacao;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
}
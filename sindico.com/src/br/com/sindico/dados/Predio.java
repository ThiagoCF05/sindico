package br.com.sindico.dados;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Predio {
	private int codigo;
	private String cnpj;
	private String nome;
	private Endereco endereco;
	private Date dataDeCadastro;
	private char tipo;
	private int numeroApartamentos;
	private String caminhoFoto; //REVER
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public int getNumeroApartamentos() {
		return numeroApartamentos;
	}
	public void setNumeroApartamentos(int numeroApartamentos) {
		this.numeroApartamentos = numeroApartamentos;
	}
	public String getCaminhoFoto() {
		return caminhoFoto;
	}
	public void setCaminhoFoto(String caminhoFoto) {
		this.caminhoFoto = caminhoFoto;
	}
	
	
}

package br.com.sindico.dados;

import java.util.Date;

public class Usuario {
	private int codigo;
	private String nome;
	private Date dataDeCadastro;
	private Date dataDeNascimento;
	private char tipo; // s = sindico, c = conselho, m = morador e z = zelador
	private String senha;
	private String email;
	private Telefone telefone;
	private Telefone celular;
	private boolean recebeCotacao;
	private boolean recebeEmailMarketing;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Telefone getCelular() {
		return celular;
	}
	public void setCelular(Telefone celular) {
		this.celular = celular;
	}
	public boolean isRecebeCotacao() {
		return recebeCotacao;
	}
	public void setRecebeCotacao(boolean recebeCotacao) {
		this.recebeCotacao = recebeCotacao;
	}
	public boolean isRecebeEmailMarketing() {
		return recebeEmailMarketing;
	}
	public void setRecebeEmailMarketing(boolean recebeEmailMarketing) {
		this.recebeEmailMarketing = recebeEmailMarketing;
	}
	
	
}

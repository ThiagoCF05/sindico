package br.com.sindico.dados;

public class Telefone {
	private String codigoPais;
	private String ddd;
	private String numero;
	private char tipo; // c = celular, n = normal, m = comercial
	
	public String getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
}

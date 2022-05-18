package br.com.dio.model;

import java.util.Objects;

public class CJinc {

	private String nome;
	private String cor;
	private Integer idade;

	public CJinc(String nome, String cor, Integer idade) {

		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public CJinc() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CJinc other = (CJinc) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "CJinc [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/*
	 * public CJinc(String nome, String cor, Integer idade) { this.nome= nome;
	 * this.cor= cor; this.idade= idade; }
	 */

}

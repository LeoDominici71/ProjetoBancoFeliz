package br.com.entities.app;

import java.util.Collection;

import br.com.services.app.Pessoa;

public class Cliente implements Pessoa {

	private String cpf;
	private String nome;
	private String sobrenome;
	private String rua;
	private int numero;
	private int complemento;
	private String telefone;
	private String cidade;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getComplemento() {
		return complemento;
	}

	public void setComplemento(int complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public void dadosPessoa(String cpf, String nome, String sobrenome, String rua, int numero, int complemento,
			String telefone, String cidade) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.telefone = telefone;
		this.cidade = cidade;

	}

	@Override
	public String toString() {
		return "[CPF = " + cpf + ", Nome = " + nome + ", Sobrenome = " + sobrenome + ", Rua = " + rua + ", Numero = "
				+ numero + ", Complemento = " + complemento + ", Telefone = " + telefone + ", Cidade = " + cidade + "]";
	}

}
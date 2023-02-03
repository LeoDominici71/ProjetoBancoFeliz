package br.com.entities.app;

import java.util.Collection;

import br.com.services.app.Pessoa;

public class Cliente implements Pessoa {
	
	private int cpf;
	private String nome;
	private String sobrenome;
	private String rua;
	private int numero;
	private int complemento;
	private int telefone;
	private String cidade;

	
	@Override
	public void dadosPessoa(int cpf, String nome, String sobrenome, String rua, int numero, int complemento,
			int telefone, String cidade) {
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
		return "[cpf = " + cpf + ", nome = " + nome + ", sobrenome = " + sobrenome + ", rua = " + rua + ", numero = "
				+ numero + ", complemento = " + complemento + ", telefone = " + telefone + ", cidade = " + cidade + "]";
	}
	
	
	
	

}
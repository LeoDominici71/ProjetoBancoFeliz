package br.com.entities.app;

import java.util.Collection;

import br.com.services.app.Pessoa;

public class Cliente implements Pessoa {

	private int cpf;
	private int nome;
	private int sobrenome;

	@Override
	public void dadosPessoa(int cpf, String nome, String sobrenome, String rua, int numero, int complemento,
			int telefone, String cidade) {

		System.out.println("Cliente [cpf = " + cpf + ", nome = " + nome + ", sobrenome = " + sobrenome + ", rua = "
				+ rua + ", numero = " + numero + ", complemento = " + complemento + ", telefone=" + telefone
				+ ", cidade=" + cidade + "]");
	}

	@Override
	public String toString() {
		return "Conta cadastrada com sucesso";
	}

}
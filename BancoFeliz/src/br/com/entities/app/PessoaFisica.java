package br.com.entities.app;

import java.util.Collection;

import br.com.services.app.Pessoa;

public class PessoaFisica implements Pessoa {

	@Override
	public void dadosPessoa(int cpf, String nome, String sobrenome, String rua, int numero, int complemento,
			int telefone, String cidade) {

		StringBuilder sb = new StringBuilder();
		sb.append("CPF: " + cpf);
		sb.append("Nome: " + nome);
		sb.append("Sobrenome: " + sobrenome);
		sb.append("Rua: " + rua);
		sb.append("Numero: " + numero);
		sb.append("Complemento: " + complemento);
		sb.append("Telefone: " + telefone);
		sb.append("Cidade: "+ cidade);
	}

	

}
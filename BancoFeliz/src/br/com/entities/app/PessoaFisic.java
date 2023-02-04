package br.com.entities.app;

import br.com.exception.app.ConfirmaContaException;
import br.com.exception.app.CpfException;
import br.com.exception.app.CpfLenghtException;

public class PessoaFisic {

	private int agencia;
	private int conta;
	private PessoaFisic match;
	private Cliente cliente;

	public PessoaFisic() {
	}

	public PessoaFisic(int agencia, int conta, String cpf, Cliente cliente) {
		this.agencia = agencia;
		this.conta = conta;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PessoaFisic getMatch() {
		return match;
	}

	public void setMatch(PessoaFisic match) {
		this.match = match;
	}

	@Override
	public String toString() {
		return "PessoaFisic [agencia = " + agencia + ", conta = " + conta + "] Cliente " + cliente;
	}

	public void MesmoCpf(PessoaFisic match) throws CpfException {

		if (match != null) {
			throw new CpfException("Esse CPF ja esta cadastrado, procure um gerente");
		}
		this.match = match;

	}


	public void CpfTamanho(String cpf) throws CpfLenghtException{

		if (cpf.length() != 11)
			throw new CpfLenghtException("O CPF deve conter 11 digitos");
	}

	public void ConfirmaConta(PessoaFisic match) {
		if (match == null) {
			throw new ConfirmaContaException("Esse CPF ja esta cadastrado, procure um gerente");
		}
		this.match = match;
	}

}

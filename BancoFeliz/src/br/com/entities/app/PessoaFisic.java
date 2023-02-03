package br.com.entities.app;

import br.com.exception.app.CPFExceptions;
import br.com.exception.app.StringException;

public class PessoaFisic {

	private int agencia;
	private int conta;
	private int cpf;
	private PessoaFisic cpf_match;
	private Cliente cliente;

	public PessoaFisic() {
	}

	public PessoaFisic(int agencia, int conta, int cpf, Cliente cliente) {
		this.agencia = agencia;
		this.conta = conta;
		this.cpf = cpf;
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PessoaFisic getCpf_match() {
		return cpf_match;
	}

	public void setCpf_match(PessoaFisic cpf_match) {
		this.cpf_match = cpf_match;
	}

	@Override
	public String toString() {
		return "PessoaFisic [agencia = " + agencia + ", conta = " + conta + "] Cliente " + cliente;
	}

	public void MesmoCpf(PessoaFisic cpf_match) throws CPFExceptions {

		if (cpf_match != null) {
			throw new CPFExceptions("Esse CPF ja esta cadastrado, procure um gerente");
		}
		this.cpf_match = cpf_match;

	}

	public void eString(String texto) throws StringException {

		if (isNumeric(texto)) {
			throw new StringException("Por favor digite somente letras");

		}

	}

	public static boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

}

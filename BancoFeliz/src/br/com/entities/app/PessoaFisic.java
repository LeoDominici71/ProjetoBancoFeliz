package br.com.entities.app;

import br.com.services.app.Pessoa;

public class PessoaFisic {

	private int agencia;
	private int conta;
	private int cpf;
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

	@Override
	public String toString() {
		return "PessoaFisic [agencia=" + agencia + ", conta=" + conta + ", cpf=" + cpf + "]";
	}
	
	

}

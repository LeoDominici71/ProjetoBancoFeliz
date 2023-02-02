package br.com.entities.app;

import br.com.services.app.Pessoa;

public class Cliente {
	
	private int agencia;
	private int conta;
	private Pessoa pessoa;
	
	
	
	public Cliente() {
		super();
	}

	public Cliente(int agencia, int conta, Pessoa pessoa) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.pessoa = pessoa;
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

	@Override
	public String toString() {
		return "Cliente [agencia=" + agencia + ", conta=" + conta + ", pessoa=" + pessoa + "]";
	}
	
	
	
	
	

}

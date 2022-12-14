package model;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numero;
	protected double saldo;
	
	public Conta(String nomeTitular, String cpf, int numero, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//método para realizar crédito na conta.
	public void creditar(double valor) {
		this.saldo += saldo;
	}
	
	//método para debitar da conta;
	public boolean debitar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	//método toString da classe Object: retorna string(texto) representando o objeto
	public String toString() {
		return numero+" - " + nomeTitular+ " ("+cpf+") R$ " +saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

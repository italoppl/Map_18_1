package br.com.map;

public class ContaBancaria{
	
	private String nome;
	private String CPF;
	private double saldo;
	
	public ContaBancaria(String CPF) {
		this.CPF = CPF;
	}
	
	public ContaBancaria() {
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

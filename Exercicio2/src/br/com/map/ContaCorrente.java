package br.com.map;

public class ContaCorrente implements Conta{
	
	ContaBancaria contaGenerica;
	double saldoCC ;
	int QtdCheque = 10;

	public ContaCorrente(String CPF) {
		super();
		this.contaGenerica = new ContaBancaria(CPF);
	}

	@Override
	public void depositar(int valor) {
		saldoCC  = this.contaGenerica.getSaldo() + valor;
	}

	@Override
	public void sacar(int valor) {
		if(saldoCC < valor) {
			System.out.println("Valor indisponivel para saque");
		}else {
			saldoCC = saldoCC - valor;
		}
	}

	@Override
	public void exibirDados() {
		StringBuilder string = new StringBuilder();
		String cpf = this.contaGenerica.getCPF();
		string.append("CPF: " + cpf + " Quantidade de Cheque: " + QtdCheque);
		System.out.println(string);
	}

	@Override
	public void exibirTransações() {
		// TODO Auto-generated method stub
		
	}

}

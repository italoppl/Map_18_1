package br.com.map;

public class ContaPoupanca extends ContaBancaria implements Conta {

	double taxa = 0.10 ;
	ContaBancaria contaGenerica;
	double saldoCP ;
	
	public ContaPoupanca(String CPF) {
		super(CPF);
		this.contaGenerica = new ContaBancaria(CPF);
	}

	@Override
	public void depositar(int valor) {
		saldoCP = this.contaGenerica.getSaldo() + valor;
	}

	@Override
	public void sacar(int valor) {
		if(saldoCP < valor) {
			System.out.println("Valor indisponivel para saque");
		}else {
			saldoCP = saldoCP - valor;
		}	
	}

	@Override
	public void exibirDados() {
		StringBuilder string = new StringBuilder();
		String cpf = this.contaGenerica.getCPF();
		string.append("CPF: " + cpf + " Taxa de: " + taxa);
		System.out.println(string);
	}

	@Override
	public void exibirTransações() {
		// TODO Auto-generated method stub
		
	}

}

package br.com.map;

public class App {

	public static void main(String[] args) {
		
		String CPF = "12345678912";

		ContaCorrente conta = new ContaCorrente(CPF);
		System.out.println("Saldo em conta: " + conta.saldoCC);
		conta.depositar(100);
		System.out.println("Saldo em conta: " + conta.saldoCC);
		conta.sacar(5);
		System.out.println("Saldo em conta: " + conta.saldoCC);
		conta.exibirDados();
		
		ContaPoupanca conta2 = new ContaPoupanca(CPF);
		System.out.println("Saldo em conta: " + conta2.saldoCP);
		conta2.depositar(1000);
		System.out.println("Saldo em conta: " + conta2.saldoCP);
		conta2.sacar(50);
		System.out.println("Saldo em conta: " + conta2.saldoCP);
		conta2.exibirDados();
		
		System.out.println(conta2.saldoCP*conta2.taxa);
	}

}

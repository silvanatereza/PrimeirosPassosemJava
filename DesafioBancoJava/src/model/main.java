package model;

public class main {
	
	public static void main(String[] args) {
		
		Cliente silvana = new Cliente();
		silvana.setNome("Silvana");
		
		Conta corrente = new ContaCorrente(silvana);
		Conta poupanca = new ContaPoupanca(silvana);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}

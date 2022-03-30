
public class Banco {
	
	private static int conta;
	private String nome;
	private double saldo;
	
	public Banco(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	public Banco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public static int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saque(double saque) {
		saldo -= saque + 5;
		System.out.println("Foi cobrado tarifa de 5,00.");
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	
	public String toString() {
		return 
		"Conta: " + conta + 
		"\nNome: " + nome + 
		"\nSaldo: " + saldo ;
	}
	
	
}

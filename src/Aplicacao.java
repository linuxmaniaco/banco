import java.util.Scanner;
import java.util.Random;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Banco banco;
		
		System.out.println("ABRIR UMA CONTA CORRENTE");
		
		int conta = random.nextInt(1000);
		//sc.nextLine();
		System.out.print("Informe o nome do titular: ");
		String nome = sc.nextLine();
		
		System.out.println("Deseja efetuar um deposito? 1=Sim, 0=Não");
		int r = sc.nextInt();
		
		if (r == 1) {
			System.out.print("Informar valor deposito inicial: ");
			double saldo = sc.nextDouble();
			banco = new Banco(conta, nome, saldo);
		} else {
			banco = new Banco(conta, nome);
		}
		System.out.println(banco);
		
		
		
		System.out.println("ABRIR SISTEMA DE OPERAÇÕES? (y/n)");
		char abrir = sc.next().charAt(0);
		while (abrir == 'y') {
			int operacao = 0;
			System.out.println("Escolha a operação: \n1- Saldo, \n2- Deposito, \n3- Saque (Tarifa de 5,00) \n0- Sair ");
			operacao = sc.nextInt();
			if (operacao == 1) {
				System.out.print("Digite valor do saldo: ");
				System.out.println("Seu saldo é de: " + banco.getSaldo());
			} else if (operacao == 2) {
				System.out.print("Valor do deposito: ");
				banco.deposito(sc.nextDouble());
				System.out.println(banco);
			} else if (operacao == 3) {
				System.out.print("Valor do saque: ");
				banco.saque(sc.nextDouble());
				System.out.println(banco);
			} else {
				System.out.println("Operação cancelada!");
			}
			
			System.out.println("deseja fazer outra operação? (y/n)");
			abrir = sc.next().charAt(0);
			
		}
		System.out.println("SISTEMA DE OPERAÇÕES FECHADO!");
			
			
			
		sc.close();

	}
}

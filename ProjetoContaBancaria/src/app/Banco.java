package app;

import java.util.Scanner;

import core.ContaBancaria;

public class Banco {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		double valor;
		ContaBancaria conta = new ContaBancaria(1001,2,"Isaias","414.619.640-90", 500.00);
		
		do {
			System.out.println("IsiBank - Seu Banco na Internet");
			System.out.println("Digite 1-Depósito / 2-Saque / 3-Info / 0-Sair");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			
				case 1:
					System.out.println(">>> DEPÓSITO <<< - Digite o valor:");
					valor = teclado.nextDouble();
					conta.depositar(valor);
					break;
					
				case 2: 
					System.out.println(">>> SAQUE <<< - Digite o valor:");
					valor = teclado.nextDouble();
					if(conta.sacar(valor)) {
						System.out.println(">>>SAQUE EFETUADO<<<");
					} 
					else {
						System.out.println(">>>SALDO INSUFICIENTE<<<");
					}
					break;
				
				case 3:
					System.out.println(">>>INFO<<<< "+ conta.exibirDados());
					break;
				
				case 0:
					System.out.println(">>>VOCÊ ENCERROU A SESSÃO. ATÉ A PRÓXIMA!<<<");
				
				default:
					System.out.println(">>>OPÇÃO INVÁLIDA. TENTE NOVAMENTE!<<<");
			}
			
		} while (opcao != 0);
		
		
		teclado.close();
	}

}

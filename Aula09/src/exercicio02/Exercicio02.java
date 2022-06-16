package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double contaA = 500;
		double contaB = 500;
		int opcao = 0;
		double valor = 0;
		
		System.out.println("Selecione uma opção: ");
		System.out.println("1 - Sacar da conta A");
		System.out.println("2 - Depositar na conta A");
		System.out.println("3 - Transferir da conta A para conta B");
		System.out.println("4 - Sacar da conta B");
		System.out.println("5 - Depositar na conta B");
		System.out.println("6 - Transferir da conta A para conta B");
		opcao = scanner.nextInt();
		
		while(opcao >= 0) {
			System.out.println("Digite o valor: ");
			valor = scanner.nextDouble();
			
			switch(opcao) {
				case 1: contaA -= valor; //contaA = contaA - valor;
					    break;
					    
				case 2: contaA += valor; //contaA = contaA + valor;
				    	break;
				    	
				case 3: contaA -= valor;
						contaB += valor;
				    	break;
				    	
				case 4: contaB -= valor;
				    	break;
				    	
				case 5: contaB += valor;
				    	break;
				    	
				case 6: contaB -= valor;
						contaA += valor;
				    	break;
			}
			
			System.out.println();
			System.out.println("Saldo conta A: " + contaA);
			System.out.println("Saldo conta B: " + contaB);
			System.out.println();
			
			System.out.println("Selecione uma opção: ");
			System.out.println("1 - Sacar da conta A");
			System.out.println("2 - Depositar na conta A");
			System.out.println("3 - Transferir da conta A para conta B");
			System.out.println("4 - Sacar da conta B");
			System.out.println("5 - Depositar na conta B");
			System.out.println("6 - Transferir da conta A para conta B");
			opcao = scanner.nextInt();
		}
		
		System.out.println();
		System.out.println("Saldo conta A: " + contaA);
		System.out.println("Saldo conta B: " + contaB);
		System.out.println();
	}
}
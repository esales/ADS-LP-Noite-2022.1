package switchCase;

import java.util.Scanner;

public class Questao75 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor = 0;
		double percentual = 0;
		double valorFinal = 0;
		int opcao = 0;
		
		System.out.println("Digite o valor da compra: ");
		valor = scanner.nextDouble();
		
		System.out.println("Escolha a opção de pagamento;");
		System.out.println("1 - Venda a Vista - desconto de 10%");
		System.out.println("2 - Venda a Prazo 30 dias - desconto de 5%");
		System.out.println("3 - Venda a Prazo 60 dias - mesmo preço");
		System.out.println("4 - Venda a Prazo 90 dias - acréscimo de 5%");
		System.out.println("5 - Venda com cartão de débito - desconto de 8%");
		System.out.println("6 - Venda com cartão de crédito - desconto de 7%");
		
		System.out.println("Digite a opção escolhida: ");
		opcao = scanner.nextInt();
		
		while(valor > 0) {
			switch(opcao) {
				case 1: percentual = 0.9;
						break;
				case 2: percentual = 0.95;
						break;
				case 3: percentual = 1;
						break;
				case 4: percentual = 1.05;
						break;
				case 5: percentual = 0.92;
						break;
				case 6: percentual = 0.93;
						break;
			}
			
			valorFinal = valor*percentual;
			
			System.out.println("Valor final: R$ " + valorFinal);
			System.out.println("");
			
			System.out.println("Digite o valor da compra: ");
			valor = scanner.nextDouble();
			
			System.out.println("Escolha a opção de pagamento;");
			System.out.println("1 - Venda a Vista - desconto de 10%");
			System.out.println("2 - Venda a Prazo 30 dias - desconto de 5%");
			System.out.println("3 - Venda a Prazo 60 dias - mesmo preço");
			System.out.println("4 - Venda a Prazo 90 dias - acréscimo de 5%");
			System.out.println("5 - Venda com cartão de débito - desconto de 8%");
			System.out.println("6 - Venda com cartão de crédito - desconto de 7%");
			
			System.out.println("Digite a opção escolhida: ");
			opcao = scanner.nextInt();
		}
	}
}
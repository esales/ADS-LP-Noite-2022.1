package avaliacao;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		int quantidade = 0;
		int qtdHamburguer = 0;
		int qtdCheeseburger = 0;
		int qtdBaconburguer = 0;
		int qtdCoxinha = 0;
		int qtdBatataFrita = 0;
		int qtdRefrigerante = 0;
		double valorHamburguer = 8.2;
		double valorCheeseburger = 9.1;
		double valorBaconburguer = 10.3;
		double valorCoxinha = 7.5;
		double valorBatataFrita = 6.3;
		double valorRefrigerante = 4.7;
		
		int qtdGeral = 0;
		double montanteGeral = 0;
			
		System.out.println("1 - Hamburguer: R$ 8,20");
		System.out.println("2 - Cheeseburguer: R$ 9,10");
		System.out.println("3 - Baconburguer: R$ 10,30");
		System.out.println("4 - Coxinha: R$ 7,50");
		System.out.println("5 - Batata frita: R$ 6,30");
		System.out.println("6 - Refrigerante: R$ 4,70");
		System.out.println();
		System.out.println("Escolha o produto: ");
		opcao = scanner.nextInt();
		
		while (opcao >= 0) {
			System.out.println("Indique a quantidade: ");
			quantidade = scanner.nextInt();
			
			switch (opcao){
				case 1: qtdHamburguer += quantidade;
						montanteGeral += quantidade * valorHamburguer;
						break;
						
				case 2:	qtdCheeseburger += quantidade;
						montanteGeral += quantidade * valorCheeseburger;
						break;
						
				case 3:	qtdBaconburguer += quantidade;
						montanteGeral += quantidade * valorBaconburguer;
						break;
						
				case 4:	qtdCoxinha += quantidade;
						montanteGeral += quantidade * valorCoxinha;
						break;
						
				case 5:	qtdBatataFrita += quantidade;
						montanteGeral += quantidade * valorBatataFrita;
						break;
						
				case 6:	qtdRefrigerante += quantidade;
						montanteGeral += quantidade * valorRefrigerante;
						break;
			}
			
			qtdGeral += quantidade;
			
			System.out.println("1 - Hamburguer: R$ 8,20");
			System.out.println("2 - Cheeseburguer: R$ 9,10");
			System.out.println("3 - Baconburguer: R$ 10,30");
			System.out.println("4 - Coxinha: R$ 7,50");
			System.out.println("5 - Batata frita: R$ 6,30");
			System.out.println("6 - Refrigerante: R$ 4,70");
			System.out.println();
			System.out.println("Escolha o produto: ");
			opcao = scanner.nextInt();
		}
		
		System.out.println("Hamburguer: ");
		System.out.println("- quantidade: " + qtdHamburguer);
		System.out.println("- montante: " + qtdHamburguer * valorHamburguer);
		System.out.println();
		
		System.out.println("Cheeseburguer: ");
		System.out.println("- quantidade: " + qtdCheeseburger);
		System.out.println("- montante: " + qtdCheeseburger * valorCheeseburger);
		System.out.println();
		
		System.out.println("Baconburguer: ");
		System.out.println("- quantidade: " + qtdBaconburguer);
		System.out.println("- montante: " + qtdBaconburguer * valorBaconburguer);
		System.out.println();
		
		System.out.println("Coxinha: ");
		System.out.println("- quantidade: " + qtdCoxinha);
		System.out.println("- montante: " + qtdCoxinha * valorCoxinha);
		System.out.println();
		
		System.out.println("Batata Frita: ");
		System.out.println("- quantidade: " + qtdBatataFrita);
		System.out.println("- montante: " + qtdBatataFrita * valorBatataFrita);
		System.out.println();
		
		System.out.println("Refrigerante: ");
		System.out.println("- quantidade: " + qtdRefrigerante);
		System.out.println("- montante: " + qtdRefrigerante * valorRefrigerante);
		System.out.println();
		
		
		System.out.println("----------");
		System.out.println("Geral: ");
		System.out.println("- quantidade: " + qtdGeral);
		System.out.println("- montante: " + montanteGeral);
		System.out.println();System.out.println();
		
	}

}

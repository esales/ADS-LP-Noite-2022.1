package avaliacao;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double velocidadeLimite = 0;
		double velocidadeVeiculo = 0;
		double percentual = 0;
		int qtdMedia = 0;
		int qtdGrave = 0;
		int qtdGravissima = 0;
		double valorMultaMedia = 130.16;
		double valorMultaGrave = 195.23;
		double valorMultaGravissima = 880.41;
		
		System.out.println("Digite a velocidade limite da via: ");
		velocidadeLimite = scanner.nextDouble();
		System.out.println();
		
		while (velocidadeLimite >= 0) {
			if (velocidadeLimite == 0) {
				System.out.println("Infração média: ");
				System.out.println("- quantidade: " + qtdMedia);
				System.out.println("- montante: R$ " + qtdMedia * valorMultaMedia);
				System.out.println();
				System.out.println("Infração grave: ");
				System.out.println("- quantidade: " + qtdGrave);
				System.out.println("- montante: R$ " + qtdGrave * valorMultaGrave);
				System.out.println();
				System.out.println("Infração gravíssima: ");
				System.out.println("- quantidade: " + qtdGravissima);
				System.out.println("- montante: R$ " + qtdGravissima * valorMultaGravissima);
			} else {
				System.out.println("Digite a velocidade do veículo: ");
				velocidadeVeiculo = scanner.nextDouble();
				System.out.println();
				
				if (velocidadeVeiculo > velocidadeLimite) {
					percentual = velocidadeVeiculo/velocidadeLimite;
					
					if (percentual <= 1.2) {
						qtdMedia++;
						
						System.out.println("Multa: média, valor: R$ " + valorMultaMedia);
					} else if (percentual <= 1.5) {
						qtdGrave++;
						
						System.out.println("Multa: grave, valor: R$ " + valorMultaGrave);
					} else {
						qtdGravissima++;
						
						System.out.println("Multa: gravíssima, valor: R$ " + valorMultaGravissima);
					}
					
				} else {
					System.out.println("Velocidade ok!");
				}
			}
			
			System.out.println();
			System.out.println("Digite a velocidade limite da via: ");
			velocidadeLimite = scanner.nextDouble();
		}
		
		
	}

}

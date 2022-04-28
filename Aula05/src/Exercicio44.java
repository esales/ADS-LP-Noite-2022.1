import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valorTipo1 = 0.5;
		double valorTipo2 = 0.6;
		double valorTipo3 = 0.75;
		int qtdTipo1 = 0;
		int qtdTipo2 = 0;
		int qtdTipo3 = 0;
		double totalTipo1 = 0;
		double totalTipo2 = 0;
		double totalTipo3 = 0;
		
		System.out.println("Digite a quantidade de picolés do tipo 1: ");
		qtdTipo1 = scanner.nextInt();
		
		System.out.println("Digite a quantidade de picolés do tipo 2: ");
		qtdTipo2 = scanner.nextInt();
		
		System.out.println("Digite a quantidade de picolés do tipo 3: ");
		qtdTipo3 = scanner.nextInt();
		
		totalTipo1 = qtdTipo1 * valorTipo1;
		totalTipo2 = qtdTipo2 * valorTipo2;
		totalTipo3 = qtdTipo3 * valorTipo3;
		
		System.out.println("Tipo 1 - Quantidade: " + qtdTipo1);
		System.out.println("Tipo 1 - Total: " + totalTipo1);
		System.out.println("----------");
		System.out.println("Tipo 2 - Quantidade: " + qtdTipo2);
		System.out.println("Tipo 2 - Total: " + totalTipo2);
		System.out.println("----------");
		System.out.println("Tipo 3 - Quantidade: " + qtdTipo3);
		System.out.println("Tipo 3 - Total: " + totalTipo3);
		
		
		

	}

}

import java.util.Scanner;

public class Exercicio106 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		double soma = 0;
		double media = 0;
		int quantidade = 0;
		
		System.out.println("Digite um n�mero: ");
		numero = scanner.nextInt();
		
		while(numero != 9999) {
			soma = soma + numero;
			quantidade++;
			
			System.out.println("Digite um n�mero: ");
			numero = scanner.nextInt();
		}
		
		if (quantidade > 0) {
			media = soma/quantidade;
			System.out.println("Soma: " + soma);
			System.out.println("M�dia: " + media);
		} else {
			System.out.println("Nenhum n�mero foi digitado.");
		}
	}
}
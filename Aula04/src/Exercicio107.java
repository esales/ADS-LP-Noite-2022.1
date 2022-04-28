import java.util.Scanner;

public class Exercicio107 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int maiorNumero = -9999;
		int menorNumero = 999999;
		boolean digitou = false;
		
		System.out.println("Digite o n�mero: ");
		numero = scanner.nextInt();
		
		while(numero != 9999) {
			digitou = true;
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			
			if (numero < menorNumero) {
				menorNumero = numero;
			}
			
			System.out.println("Digite o n�mero: ");
			numero = scanner.nextInt();
		}
		
		if (digitou) {
			System.out.println("Maior n�mero: " + maiorNumero);
			System.out.println("Menor n�mero: " + menorNumero);
		} else {
			System.out.println("Nenhum n�mero foi digitado.");
		}

	}
}

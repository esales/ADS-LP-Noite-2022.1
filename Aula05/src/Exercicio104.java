import java.util.Scanner;

public class Exercicio104 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int valorFinal = 0;
		int i = 1;
		
		System.out.println("Digite o primeiro número: ");
		primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		segundoNumero = scanner.nextInt();
		
		System.out.print("0");
		while(i <= segundoNumero) {
			System.out.print(" + " + primeiroNumero);
			
			valorFinal += primeiroNumero;
			
			i++;
		}
		System.out.println();
		System.out.println("O valor final é: " + valorFinal);

	}

}

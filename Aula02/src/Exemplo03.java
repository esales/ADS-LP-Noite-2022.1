import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int soma = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		primeiroNumero = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		segundoNumero = scanner.nextInt();
		
		soma = primeiroNumero + segundoNumero;
		
		System.out.println("A soma dos números é " + soma);
	}
}
import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int soma = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		primeiroNumero = scanner.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		segundoNumero = scanner.nextInt();
		
		soma = primeiroNumero + segundoNumero;
		
		System.out.println("A soma dos n�meros � " + soma);
	}
}
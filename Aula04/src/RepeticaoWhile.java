import java.util.Scanner;

public class RepeticaoWhile {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite um n�mero: ");
		numero = scanner.nextInt();
		
		while(numero >= 0) {
			System.out.println("O n�mero digitado foi " + numero);
			System.out.println("");
			
			System.out.println("Digite um n�mero: ");
			numero = scanner.nextInt();
		}
		
		System.out.println("Fim");
	}
}

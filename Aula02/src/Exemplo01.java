import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numeroRecebido = scanner.nextInt();
		
		System.out.println("O n�mero digitado foi: " + numeroRecebido);
	}
}
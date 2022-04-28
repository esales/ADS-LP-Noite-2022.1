import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numeroRecebido = scanner.nextInt();
		
		System.out.println("O número digitado foi: " + numeroRecebido);
	}
}
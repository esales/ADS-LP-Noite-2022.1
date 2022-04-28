import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		
		System.out.println("Digite o primeiro número: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numeroB = scanner.nextInt();
		
		if (numeroA == numeroB) {
			System.out.println("Iguais");
			
		} else if (numeroA > numeroB) {
			
			System.out.println("Maior: " + numeroA);
			System.out.println("Menor: " + numeroB);
		
		} else {
		
			System.out.println("Maior: " + numeroB);
			System.out.println("Menor: " + numeroA);
		}
	}

}

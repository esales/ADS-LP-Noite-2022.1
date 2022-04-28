import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		
		System.out.println("Digite o primeiro número: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numeroB = scanner.nextInt();
		
		if (numeroA > numeroB) {
			System.out.println("O maior é o primeio número: " +  numeroA);
		} else {
			System.out.println("O maior é o segundo número: " +  numeroB);
		}
		
	}

}

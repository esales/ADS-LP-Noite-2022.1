import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numeroB = scanner.nextInt();
		
		if (numeroA > numeroB) {
			System.out.println("O maior � o primeio n�mero: " +  numeroA);
		} else {
			System.out.println("O maior � o segundo n�mero: " +  numeroB);
		}
		
	}

}

import java.util.Scanner;

public class Exercicio48b {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		int numeroC = 0;
		
		System.out.println("Digite o primeiro número: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numeroB = scanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numeroC = scanner.nextInt();
		
		if (numeroA < numeroB) {
			if (numeroA < numeroC){
				System.out.println("menor: " + numeroA);
			} else {
				System.out.println("menor: " + numeroC);
			}
		} else {
			if(numeroB < numeroC) {
				System.out.println("menor: " + numeroB);
			} else {
				System.out.println("menor: " + numeroC);
			}
		}
	}
}
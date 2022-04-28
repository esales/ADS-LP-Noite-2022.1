import java.util.Scanner;

public class Exercicio05_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		
		System.out.println("Digite o primeiro número: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numeroB = scanner.nextInt();
		
		if (numeroA > numeroB) {
			System.out.println("O maior é o primeiro número: " + numeroA);
		} else if(numeroA < numeroB) {
			System.out.println("O maior é o segundo número: " + numeroB);
		} else {
			System.out.println("Os número são iguais: " + numeroA);
		}
	}

}

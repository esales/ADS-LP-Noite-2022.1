import java.util.Scanner;

public class Exercicio05_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numeroB = scanner.nextInt();
		
		if (numeroA > numeroB) {
			System.out.println("O maior � o primeiro n�mero: " + numeroA);
		} else if(numeroA < numeroB) {
			System.out.println("O maior � o segundo n�mero: " + numeroB);
		} else {
			System.out.println("Os n�mero s�o iguais: " + numeroA);
		}
	}

}

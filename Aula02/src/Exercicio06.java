import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite o número: ");
		numero = scanner.nextInt();
		
		if (numero <= 10) {
			System.out.println("F1");
		} else if (numero <= 100) {
			System.out.println("F2");
		} else {
			System.out.println("F3");
		}
		

	}

}

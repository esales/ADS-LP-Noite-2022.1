import java.util.Scanner;

public class Exercicio04_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pi = 3.14159;
		double raio = 0;
		double area = 0;
		
		System.out.println("Digite o raio: ");
		raio = scanner.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.println("A área é " + area);

	}

}

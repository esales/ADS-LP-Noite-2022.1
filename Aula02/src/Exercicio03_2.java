import java.util.Scanner;

public class Exercicio03_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double base = 0;
		double altura = 0;
		double area = 0;
		
		System.out.println("Digite a base: ");
		base = scanner.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = scanner.nextDouble();
		
		area = (base * altura)/2;
		
		System.out.println("Área: " + area);
	}

}

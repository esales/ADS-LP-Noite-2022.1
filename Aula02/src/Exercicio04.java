import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double raio = 0;
		double pi = 3.14231;
		double area = 0;
		
		raio = scanner.nextDouble();
		
		area = raio*pi;
		System.out.println(area);

	}

}

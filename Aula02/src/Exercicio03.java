import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double base = 0;
		double altura = 0;
		double area = 0;
		
		base = scanner.nextDouble();
		altura = scanner.nextDouble();
		
		area = (base*altura)/2;
		System.out.println(area);
	}

}

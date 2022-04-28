import java.util.Scanner;

public class Exercicio62 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0;
		int percentual;
		double credito = 0;
		
		System.out.println("Digite o saldo: ");
		saldo = scanner.nextDouble();
		
		if (saldo <= 200) {
			percentual = 0;
		} else if (saldo <= 400) {
			percentual = 20;
		} else if (saldo <= 600) {
			percentual = 30;
		} else {
			percentual = 40;
		}
		
		credito = saldo * percentual / 100;
		
		System.out.println(credito);

	}

}

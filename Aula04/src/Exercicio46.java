import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valorDiaria = 60;
		int numeroDiarias = 0;
		double taxa = 0;
		double total = 0;
		
		System.out.println("Digite o número de diárias: ");
		numeroDiarias = scanner.nextInt();
		
		if (numeroDiarias < 15) {
			taxa = 8;
		} else if (numeroDiarias > 15) {
			taxa = 5.5;
		} else {
			taxa = 6;
		}
		
		total = numeroDiarias * (valorDiaria + taxa);
		
		System.out.println("Total: " + total);
		
	}

}

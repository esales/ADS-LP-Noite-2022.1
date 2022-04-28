import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double altura = 0;
		double largura = 0;
		double comprimento = 0;
		double volume = 0;
		
		System.out.println("Digite a altura: ");
		altura = scanner.nextDouble();
		
		System.out.println("Digite a largura: ");
		largura = scanner.nextDouble();
		
		System.out.println("Digite o comprimento: ");
		comprimento = scanner.nextDouble();
		
		volume = altura * largura * comprimento;
		
		System.out.println("Volume: " + volume);
		

	}
}
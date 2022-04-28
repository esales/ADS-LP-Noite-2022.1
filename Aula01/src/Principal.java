import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = scanner.next();
		
		System.out.print("Digite o sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.println("O nome completo é " + nome + " " + sobrenome);
		
		
	}
}
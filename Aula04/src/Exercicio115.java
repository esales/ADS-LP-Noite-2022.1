import java.util.Scanner;

public class Exercicio115 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double salario = 0;
		double totalSalario = 0;
		int quantidade = 0;
		double maiorSalario = -1;
		double menorSalario = 999999;
		double mediaSalario = 0;
		String nome = "";
		
		System.out.println("Digite o nome: ");
		nome = scanner.next();
		
		while(!nome.equals("fim")) {
			System.out.println("Digite o sal�rio:");
			salario = scanner.nextDouble();
			
			quantidade++;
			totalSalario = totalSalario + salario;
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario < menorSalario) {
				menorSalario = salario;
			}
			
			System.out.println("Digite o nome: ");
			nome = scanner.next();
		}
		
		if (quantidade > 0) {
			mediaSalario = totalSalario/quantidade;
			System.out.println("Maior sal�rio: " + maiorSalario);
			System.out.println("Menor sal�rio: " + menorSalario);
			System.out.println("M�dia sal�rio: " + mediaSalario);
		} else {
			System.out.println("Nenhum sal�rio foi digitado.");
		}
	}

}


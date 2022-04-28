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
			System.out.println("Digite o salário:");
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
			System.out.println("Maior salário: " + maiorSalario);
			System.out.println("Menor salário: " + menorSalario);
			System.out.println("Média salário: " + mediaSalario);
		} else {
			System.out.println("Nenhum salário foi digitado.");
		}
	}

}


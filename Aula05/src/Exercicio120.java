import java.util.Scanner;

public class Exercicio120 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0;
		String sexo = "";
		double salario = 0;
		double totalSalario = 0;
		int contadorSalario = 0;
		double mediaSalario = 0;
		int maiorIdade = 0;
		int menorIdade = 200;
		int contadorMulheresSalarioMil = 0;
		
		System.out.println("Digite a idade: ");
		idade = scanner.nextInt();
		
		while(idade >= 0) {
			System.out.println("Digite o sexo: ");
			sexo = scanner.next();
			System.out.println("Digite o salário: ");
			salario = scanner.nextDouble();
			
			totalSalario += salario;
			contadorSalario++;
			
			if (idade > maiorIdade) {
				maiorIdade = idade;
			}
			
			if (idade < menorIdade) {
				menorIdade = idade;
			}
			
			
			if ((sexo.equals("f")) && (salario <= 1000)) {
				contadorMulheresSalarioMil++;
			}
			
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
		}
		
		if (contadorSalario > 0) {
			mediaSalario = totalSalario/contadorSalario;
			
			System.out.println("Média salarial: " + mediaSalario);
			System.out.println("Maior idade: " + maiorIdade);
			System.out.println("Menor idade: " + menorIdade);
			System.out.println("Mulheres com salário menor ou igual a R$ 1000,00: " + contadorMulheresSalarioMil);
		} else {
			System.out.println("Nenhuma pessoa foi cadastrada.");
		}

	}

}

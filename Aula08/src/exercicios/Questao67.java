package exercicios;
import java.util.Scanner;

public class Questao67 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double percentual = 0;
		double salario = 0;
		double novoSalario = 0;
		
		System.out.println("Digite o salário: ");
		salario = scanner.nextDouble();
		
		while(salario >= 0) {
			if (salario >= 3000) {
				percentual = 0.05;
			} else if (salario >= 2000) {
				percentual = 0.07;
			} else if (salario >= 1750) {
				percentual = 0.1;
			} else if (salario >= 1500) {
				percentual = 0.12;
			} else {
				percentual = 0.15;
			}
			
			novoSalario = salario + salario*percentual;
			
			System.out.println("Salario atual: " + salario);
			System.out.println("Percentual aumento :" + percentual*100 + "%");
			System.out.println("Salário com aumento: " + novoSalario);
			
			System.out.println("");
			System.out.println("Digite o salário: ");
			salario = scanner.nextDouble();
		}
		

	}

}
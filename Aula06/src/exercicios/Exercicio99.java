package exercicios;

import java.util.Scanner;

public class Exercicio99 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		int quantidade = 0;
		double media = 0;
		double salario = 0;
		
		System.out.println("Indique o n�mero de sal�rios a digitar: ");
		quantidade = scanner.nextInt();
		
		for(int i=1; i<=quantidade; i++) {
			System.out.println("Digite o sal�rio: ");
			salario = scanner.nextDouble();
			
			total += salario;
		}
		
		media = total/quantidade;
		
		System.out.println("M�dia: " + media);
		
		
	}

}

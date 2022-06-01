package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalGeral = 0;
		int totalInfantil = 0;
		int totalJuvenil = 0;
		int totalJunior = 0;
		int totalProfissional = 0;
		int idade = 0;
		
		System.out.println("Digite a idade: ");
		idade = scanner.nextInt();
		
		while(idade >= 0) {
			
			switch(idade) {
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10: totalInfantil++;
						 break;
				case 11:
				case 12:
				case 13:
				case 14:
				case 15: totalJuvenil++;
						 break;
				case 16:
				case 17:
				case 18:
				case 19:
				case 20: totalJunior++;
						 break;
				case 21:
				case 22:
				case 23:
				case 24:
				case 25: totalProfissional++;
						 break;
				default: System.out.println("Idade inválida");
				         break;
			}
			
			totalGeral = totalInfantil + 
						 totalJuvenil + 
						 totalJunior + 
						 totalProfissional;
			
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
		}
		
		System.out.println("Total: " + totalGeral);
		System.out.println("Total infantil: " + totalInfantil);
		System.out.println("Total juvenil: " + totalJuvenil);
		System.out.println("Total junior: " + totalJunior);
		System.out.println("Total profissional: " + totalProfissional);
	}

}

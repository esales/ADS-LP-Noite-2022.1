package exercicios;

import java.util.Scanner;

public class Exercicio97 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int resultado = 0;
		
		System.out.println("Digite um número: ");
		numero = scanner.nextInt();
		
		for(int i=1; i<=13; i++) {
			resultado = numero*i;
			System.out.print(numero + " x " + i + " = ");
			System.out.println(resultado);
		}
	}

}

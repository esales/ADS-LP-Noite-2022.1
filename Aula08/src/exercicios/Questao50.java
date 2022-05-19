package exercicios;
import java.util.Scanner;

public class Questao50 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nota = 0;
		String conceito = "";
		
		System.out.println("Digite a nota: ");
		nota = scanner.nextInt();
		
		while((nota >= 0) && (nota <= 100)) {
			if (nota <= 49){
				conceito = "Insuficiente";
			}else if (nota <= 64) {
				conceito = "Regular";
			}else if (nota <= 84) {
				conceito = "Bom";
			}else if (nota <= 100) {
				conceito = "Ótimo";
			} 
			
			System.out.println("Conceito: " + conceito);
			System.out.println("Digite a nota: ");
			nota = scanner.nextInt();
		}
		
		System.out.println("Encerrado.");
	}
}
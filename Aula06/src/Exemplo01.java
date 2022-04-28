import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
//		System.out.println("Digite um número: ");
//		numero = scanner.nextInt();
//		
//		while(numero >= 0) {
//			System.out.println("ok!");
//
//			System.out.println("Digite um número: ");
//			numero = scanner.nextInt();	
//		}
		
		int contador = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();	
			
			System.out.println("ok!");
			
			contador++;
			
		} while(numero >= 0);
		
		System.out.println(contador);
		
		
	}
}
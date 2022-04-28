package exercicios;

public class Exercicio96 {

	public static void main(String[] args) {
		int total = 1;
		
		for(int i=1; i<=15; i++) {
			if(i%2 == 0)
				total *= i;
		}
		
		System.out.println("Total: " + total);
		
	}
}
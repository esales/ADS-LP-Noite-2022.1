package funcoes;

public class Exemplo01 {
	
	
	public static int somar(int numeroA, int numeroB) {
		int total = numeroA + numeroB;
		
		return total;
	}
	
	public static void imprimirNaTela(int valor) {
		System.out.println(valor);
	}
	

	public static void main(String[] args) {
		int resultado = somar(5, 2);
		
		imprimirNaTela(resultado);
	}
}
public class Exercicio02 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][2];
		
		matriz[0][0] = 0;
		matriz[0][1] = 1;
		matriz[1][0] = 2;
		matriz[1][1] = 3;
		matriz[2][0] = 4;
		matriz[2][1] = 5;
		
		int[][] matriz2 = new int[3][2];
		
		matriz2[0][0] = 4;
		matriz2[0][1] = 5;
		matriz2[1][0] = 4;
		matriz2[1][1] = 5;
		matriz2[2][0] = 4;
		matriz2[2][1] = 5;
		
		int[][] matrizResultado = new int[3][2];
		
		for(int i=0; i<=matriz.length-1; i++) {
			
			for(int j=0; j<=matriz[i].length-1; j++) {
				
				matrizResultado[i][j] = matriz[i][j] + matriz2[i][j];
			}
			
		}
		
		System.out.println("Matriz 1");
		for(int[] vetor:matriz) {
			for(int numero:vetor) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz 2");
		for(int[] vetor:matriz2) {
			for(int numero:vetor) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Matriz resultado");
		for(int[] vetor:matrizResultado) {
			for(int numero:vetor) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
	}
}
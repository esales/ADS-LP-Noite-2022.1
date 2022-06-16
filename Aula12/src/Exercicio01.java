
public class Exercicio01 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][2];
		
		matriz[0][0] = 0;
		matriz[0][1] = 1;
		matriz[1][0] = 2;
		matriz[1][1] = 3;
		matriz[2][0] = 4;
		matriz[2][1] = 5;
		
		for(int[] vetor:matriz) {
			for(int numero:vetor) {
				System.out.println(numero);
			}
		}
	}
}
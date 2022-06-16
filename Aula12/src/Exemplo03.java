public class Exemplo03 {
	public static void main(String[] args) {
		char[][] matriz = new char[2][3];
		
		matriz[0][0] = 'A';
		matriz[0][1] = 'B';
		matriz[0][2] = 'C';
		matriz[1][0] = 'D';
		matriz[1][1] = 'E';
		matriz[1][2] = 'F';
		
		for(int i=0; i<=matriz.length-1; i++) {
			
			for(int j=0; j<= matriz[i].length-1; j++) {
				
				System.out.println(matriz[i][j]);
			
			}
		}
	}
}
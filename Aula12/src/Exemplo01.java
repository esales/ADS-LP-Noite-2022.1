
public class Exemplo01 {

	public static void main(String[] args) {
		String[][] exemplo = new String[5][8];
		
		exemplo[3][5] = "Teste 1";
		exemplo[2][0] = "Teste 2";
		
		System.out.println(exemplo[0][0]);
		System.out.println(exemplo[3][5]);
		System.out.println(exemplo[2][0]);
	}
}
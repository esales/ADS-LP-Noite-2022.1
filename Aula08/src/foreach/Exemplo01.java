package foreach;

public class Exemplo01 {

	public static void main(String[] args) {
		char[] vogais = {'a', 'e', 'i', 'o', 'u'};
		
		for(char vogal:vogais)
			System.out.println(vogal);
		
		
		System.out.println("For não muito comum...");
		for(int i=vogais.length-1; i>=0; i--) {
			if (i==3)
				continue;
			
			if (i==1)
				break;
			System.out.println(vogais[i]);
		}
		
		System.out.println("");
		System.out.println("For comum...");
		
		for(int i=0; i<=vogais.length-1;i++) {
			System.out.println(vogais[i]);
		}
		
		System.out.println("");
		System.out.println("Foreach...");
		
		
		
		
		
		
		
	}
}
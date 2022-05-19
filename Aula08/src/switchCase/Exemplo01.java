package switchCase;

public class Exemplo01 {

	public static void main(String[] args) {
		int opcao = 11;
		
		if(opcao==1)  
			System.out.println("Opção 1 ou opção 2.");
		else if(opcao==2)
			System.out.println("Opção 1 ou opção 2.");
		else if(opcao==3)
			System.out.println("Opção 3");
		else if(opcao==4)
			System.out.println("Opção 4");
		else if(opcao==5)
			System.out.println("Opção 5");
		else System.out.println("Opção inválida");
		
		
		switch(opcao) {
			case 1: 
			case 2: 
			case 10:
			case 11:
					System.out.println("Opção 1, 2, 10 ou 11.");
					break;
			case 3: System.out.println("Opção 3");
					break;
			case 4: System.out.println("Opção 4");
					break;
			case 5: System.out.println("Opção 5");
					break;
			default: System.out.println("Opção inválida");
		
		}
		

	}

}

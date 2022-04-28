package exercicios;

public class Exercicio105 {

	public static void main(String[] args) {
		int primeiroNumero = 0;
		int segundoNumero = 1;
		int proximoTermo = 0;
		
		System.out.println(primeiroNumero);
		System.out.println(segundoNumero);
		
		for(int i=1; i<=18; i++) {
			proximoTermo = primeiroNumero + segundoNumero;
			System.out.println(proximoTermo);
			
			primeiroNumero = segundoNumero;
			segundoNumero = proximoTermo;
		}
	}
}
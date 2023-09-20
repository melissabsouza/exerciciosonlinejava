import java.util.Scanner;

class LacosAteNumeroInformado {
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero: ");
		
		int numeroInformado = teclado.nextInt();
		int numeroAt = 0;
		
		System.out.println("de zero até numero informado");
		

		while(numeroAt <= numeroInformado) {
			
			System.out.println(numeroAt);
			
			numeroAt++;
		}
			
		
		for (int i = numeroInformado; i >= -5; i--) {
			System.out.println(i);
		}
			
	}
}

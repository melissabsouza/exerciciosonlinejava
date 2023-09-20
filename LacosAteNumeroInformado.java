import java.util.Scanner;

class LacosAteNumeroInformado {
	public static void main(String[] args) {
		
		Scanner numeroTeclado = new Scanner(System.in);
		System.out.println("digite um numero maior que 0: ");
			
		int numeroInformado = numeroTeclado.nextInt();
		int numeroAtual = 0;
		
		System.out.println("de zero até numero informado: ");
			
		while(numeroAtual <= numeroInformado) {
			System.out.println(numeroAtual);
			numeroAtual++;
			
		}
		
		System.out.println("do numero informado até -5");
		
		for (int i = numeroInformado; i >= -5; i--) {
			System.out.println(i);
		}

	
	}
}

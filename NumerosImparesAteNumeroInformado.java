import java.util.Scanner;

class NumerosImparesAteNumeroInformado {
	public static void main(String[] args) {
		
		Scanner numeroTeclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
		int numeroInformado = numeroTeclado.nextInt();
		int numeroAtual = 0;
		
		System.out.println("numeros impares ate numero informado: ");
		
		for (int i = 0; i <= numeroInformado; i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
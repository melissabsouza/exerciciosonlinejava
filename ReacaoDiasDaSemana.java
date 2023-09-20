class ReacaoDiasDaSemana {
	public static void main(String[] args) {
		int meuInteiro = Integer.parseInt(args[0]);
		
		switch(meuInteiro) {
			case 1:
				System.out.println("ainda é segunda");
				break;
			case 2:
				System.out.println("ainda é terca");
				break;
			case 3: 
				System.out.println("quarta feira...");
				break;
			case 4:
			case 5:
				System.out.println("quase fim de semana");
				break;
			case 6:
			case 7:
				System.out.println("fim de semana");
				break;
				
			default:
				System.out.println("invalido");
		}
		
	}
}
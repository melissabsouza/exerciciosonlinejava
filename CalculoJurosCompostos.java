class CalculoJurosCompostos {
	public static void main(String[] args) {
		
		String capitalStr = args[0];
		String taxaDeJurosAoMesStr = args[1];
		String quantiMesesStr = args[2];
		
		int capital = Integer.parseInt(capitalStr);
		int taxaDeJurosAoMes = Integer.parseInt(taxaDeJurosAoMesStr);
		int quantiMeses = Integer.parseInt(quantiMesesStr);
		
		double montante1 = capital * (1 + taxaDeJurosAoMes);
		
		double montante2 = (double)Math.pow(quantiMeses);
		
		double montante = montante1 * montante2;
		
		System.out.print = (montante);
		
	}
}
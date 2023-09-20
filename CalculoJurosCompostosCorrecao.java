class CalculoJurosCompostosCorrecao {
	public static void main(String[] args) {
		
		String capitalStr = args[0];
		String taxaDeJurosAoMesStr = args[1];
		String quantiMesesStr = args[2];
		
		double capital = Double.parseDouble(capitalStr);
		double taxaDeJurosAoMes = Double.parseDouble(taxaDeJurosAoMesStr);
		int quantiMeses = Integer.parseInt(quantiMesesStr);
		
		double montante = capital * Math.pow((1 + taxaDeJurosAoMes), quantiMeses);
		
		System.out.format("Capital inicial: %s. Taxa de juros: %s. Periodo: %s meses. Montante ao final: %s",
			capital,
			taxaDeJurosAoMes,
			quantiMeses,
			montante);
		
	}
}
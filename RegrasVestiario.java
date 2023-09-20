class RegraVestiarioFem {
	public static void main(String[] args) {
		
		String idadeEmStr = args[0];
		String sexo = args[1];
		int idade = Integer.parseInt(idadeEmStr);
		
		boolean pessoaDoSexoFem = sexo.equals("F");
		boolean ate6Anos = idade <= 6;
		boolean pessoaDoSexoMasc = sexo.equals("M");
		
		boolean podeEntrarNoVestiarioFem = pessoaDoSexoFem || (pessoaDoSexoMasc && ate6Anos);
		
		System.out.println("pode entrar no vestiario: " + podeEntrarNoVestiarioFem);
		
		// Apresentando if e else 
			
		if (podeEntrarNoVestiarioFem) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("Não pode entrar");
		}
		
	}
}
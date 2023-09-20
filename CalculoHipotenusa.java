class CalculoHipotenusa {
	public static void main (String[] args) {
		
		String cateto1EmStr = args[0];
		String cateto2EmStr = args[1];
		
		int cateto1 = Integer.parseInt(cateto1EmStr);
		int cateto2 = Integer.parseInt(cateto2EmStr);
		
		int cateto1AoQuadr = (int) Math.pow(cateto1, 2);
		int cateto2AoQuadr = (int) Math.pow(cateto2, 2);
		
		int hipotenusaAoQuadr = cateto1AoQuadr + cateto2AoQuadr;
		
		double hipotenusa = Math.sqrt(hipotenusaAoQuadr);
		
		System.out.print(hipotenusa);
	}
}
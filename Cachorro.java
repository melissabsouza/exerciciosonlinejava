class TesteCachorro {
	public static void main(String[] args) {

		// declarar valor da variavel se n reclama tipo:
		// int numero = 0;
		Cachorro cachorroSemArgumentos = new Cachorro();
		Cachorro poodle = new Cachorro("minki");
		Cachorro cachorroComIdade = new Cachorro("yeosang", 3);
		System.out.println(poodle.nome);
		System.out.println(poodle.tamanho);
		System.out.println(poodle.idade);

		poodle.nome = "Toto";
		poodle.raca = "Poodle";
		poodle.tamanho = "pequeno";
		poodle.idade = 5;
		poodle.cor = "Branca";

		System.out.format(
			"Nome: %s, raca: %s, tamanho: %s, idade: %s, cor: %s \n",
			poodle.nome,
			poodle.raca,
			poodle.tamanho,
			poodle.idade,
			poodle.cor);

		poodle.sentar();
		poodle.latir("Au Au");
		poodle.obterIdade();

		int minhaVariavelInteira = poodle.obterIdade();
		System.out.print("IDADE DO MEU CACHORRO METDO MAIN: " + minhaVariavelInteira);

	}
}
class Cachorro {
	String nome;
	String raca;
	String tamanho = "medio";
	int idade;
	String cor;


	Cachorro() {
		System.out.println("criando meu objeto pelo construtor padrao");
	}

	//Construtor padrao
	//Cachorro()
	//	System.out.println("Criei um objeto");
	//	nome = "minki";
	//

	Cachorro(String nomeDoMeuCachorro) {
		System.out.println("criando meu objeto com o nome " + nomeDoMeuCachorro);
		nome = nomeDoMeuCachorro;


	}

	Cachorro(String nomeDoMeuCachorro, int idadeDoMeuCachorro) {
		this(nomeDoMeuCachorro);
		System.out.println("Chamando construtor com nome e idade " + idadeDoMeuCachorro + " " + nome);
		idade = idadeDoMeuCachorro;

	}


	void sentar() {
		System.out.println(nome + ", da raca " + raca + " esta sentado");
	}


	void latir(String latido) {
		System.out.println(nome + " latiu " + latido);
	}

	int obterIdade() {
		System.out.println("idade do meu cachorro: " + idade);
		return idade;

	}

	void correr() {
		System.out.println(nome + " esta correndo");
	}

	void comer() {
		System.out.println(nome + " esta comendo");
	}

	void dormir() {
		System.out.println(nome + " esta dormindo");
	}

}
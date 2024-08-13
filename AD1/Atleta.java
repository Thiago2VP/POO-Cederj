class Atleta extends Participante {
	private int idade = 18;
	private String nacionalidade = "COI";

	Atleta(String nome, int idadeDada, String nacionalidadeDada) {
		super(nome);
		this.idade = idadeDada;
		this.nacionalidade = nacionalidadeDada;
	}
	// Caso seja criado com medalhas ganhas
	Atleta(String nome, int ouroInicial, int prataInicial, int bronzeInicial, int idadeDada, String nacionalidadeDada) {
		super(nome, ouroInicial, prataInicial, bronzeInicial);
		this.idade = idadeDada;
		this.nacionalidade = nacionalidadeDada;
	}

	void setNacionalidade(String novaNacionalidade) {
		this.nacionalidade = novaNacionalidade;
	}
	void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	String getNacionalidade() {
		return this.nacionalidade;
	}
	int getIdade() {
		return this.idade;
	}

	@Override
	public String toString() {
		return this.nome + ", " + this.nacionalidade + " " + this.idade + " anos.";
	}
}
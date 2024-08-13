class Participante {
	protected String nome;
	private int medalhasDeOuro = 0;
	private int medalhasDePrata = 0;
	private int medalhasDeBronze = 0;

	Participante(String nomeDado) {
		this.nome = nomeDado;
	}
	// Caso seja criado com medalhas ganhas
	Participante(String nomeDado, int ouroInicial, int prataInicial, int bronzeInicial) {
		this.nome = nomeDado;
		this.medalhasDeOuro = ouroInicial;
		this.medalhasDePrata = prataInicial;
		this.medalhasDeBronze = bronzeInicial;
	}

	void setNome(String novoNome) {
		this.nome = novoNome;
	}
	// afirmações, não perguntas
	void ganhouOuro() {
		this.medalhasDeOuro++;
	}
	void ganhouPrata() {
		this.medalhasDePrata++;
	}
	void ganhouBronze() {
		this.medalhasDeBronze++;
	}
	
	String getNome() {
		return this.nome;
	}
	String getMedalhas() {
		return "Ouro: " + this.medalhasDeOuro + ", Prata: " + this.medalhasDePrata + ", Bronze: " + this.medalhasDeBronze;
	}
	int quantosOuros() {
		return this.medalhasDeOuro;
	}
	int quantasPratas() {
		return this.medalhasDePrata;
	}
	int quantosBronzes() {
		return this.medalhasDeBronze;
	}
	int pontuacao() {
		return this.medalhasDeOuro * 10 + this.medalhasDePrata * 8 + this.medalhasDeBronze * 6;
	}
}
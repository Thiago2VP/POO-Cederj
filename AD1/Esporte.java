class Esporte {
	private String nome;
	private String tipo = "individual";

	Esporte(String nomeDado) {
		this.nome = nomeDado;
	}
	Esporte(String nomeDado, String tipoDado) {
		this.nome = nomeDado;
		this.tipo = tipoDado;
	}

	void setNome(String novoNome) {
		this.nome = novoNome;
	}
	void setTipo(String novoTipo) {
		this.tipo = novoTipo;
	}

	String getNome() {
		return this.nome;
	}
	String getTipo() {
		return this.tipo;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.tipo + ".";
	}
}
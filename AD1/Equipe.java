class Equipe extends Participante {
	private int quantidadeMembros = 0;
	private Atleta[] atletas = new Atleta[25];

	Equipe(String nome) {
		super(nome);
	}
	// Caso seja criado com medalhas ganhas
	Equipe(String nome, int ouroInicial, int prataInicial, int bronzeInicial) {
		super(nome, ouroInicial, prataInicial, bronzeInicial);
	}

	void inserirAtleta(Atleta atletaInserido) {
		if (quantidadeMembros < 25) {
			this.atletas[quantidadeMembros++] = atletaInserido;
		} else {
			System.out.println("Equipe cheia");
		}
	}
	// caso sejam adicionados vários membros de uma só vez
	void comporEquipe(Atleta[] membrosDados, int numeroMembros) {
		if (quantidadeMembros + numeroMembros <= 25) {
			for (int i = 0; i < numeroMembros; i++) {
				this.inserirAtleta(membrosDados[i]);
			}
		}
	}
	void removerDaEquipe(Atleta atletaARemover) {
		boolean removido = false;
		for (int i = 0; i < quantidadeMembros; i++) {
			if (removido || this.atletas[i] == atletaARemover) {
				this.atletas[i] = this.atletas[i+1];
				removido = true;
			}
		}
		if (removido) {
			quantidadeMembros--;
		}
	}
	// afirmação, não pergunta
	void atletasGanharamMedalha(String medalha) {
		for (int i = 0; i < this.quantidadeMembros; i++) {
			if (medalha == "ouro") {
				this.atletas[i].ganhouOuro();
			} else if (medalha == "prata") {
				this.atletas[i].ganhouPrata();
			} else if (medalha == "bronze") {
				this.atletas[i].ganhouBronze();
			}
		}
	}

	@Override
	public String toString() {
		String stringEquipe = "Equipe: " + super.nome + "\n";
		for (int i = 0; i < this.quantidadeMembros; i++) {
			stringEquipe += this.atletas[i].toString();
			stringEquipe += "\n";
		}
		return stringEquipe;
	}
}
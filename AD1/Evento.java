class Evento {
	private String nome;
	private String data;
	private Esporte esporteAssociado;
	private int totalDeParticipantes = 10;
	private Atleta atletaOuro;
	private Atleta atletaPrata;
	private Atleta atletaBronze;
	private Equipe equipeOuro;
	private Equipe equipePrata;
	private Equipe equipeBronze;

	Evento(String nomeDado, String dataDada, Esporte esporteDado) {
		this.nome = nomeDado;
		this.data = dataDada;
		this.esporteAssociado = esporteDado;
	}
	Evento(String nomeDado, String dataDada, Esporte esporteDado, int numeroParticipantes) {
		this.nome = nomeDado;
		this.data = dataDada;
		this.esporteAssociado = esporteDado;
		this.totalDeParticipantes = numeroParticipantes;
	}

	void setNome(String novoNome) {
		this.nome = novoNome;
	}
	void setData(String novaData) {
		this.data = novaData;
	}
	void setEsporte(Esporte novoEsporte) {
		this.esporteAssociado = novoEsporte;
	}
	void setTotalParticipantes(int novoTotal) {
		this.totalDeParticipantes = novoTotal;
	}

	String getNome() {
		return this.nome;
	}
	String getData() {
		return this.data;
	}
	String getEsporte() {
		return this.esporteAssociado.toString();
	}
	int getTotalParticipantes() {
		return this.totalDeParticipantes;
	}

	void adicionarMedalha(Atleta participante, int posicao) {
		if (posicao == 1) {
			participante.ganhouOuro();
			this.atletaOuro = participante;
		} else if (posicao == 2) {
			participante.ganhouPrata();
			this.atletaPrata = participante;
		} else if (posicao == 3) {
			participante.ganhouBronze();
			this.atletaBronze = participante;
		}
	}
	void adicionarMedalha(Equipe participante, int posicao) {
		if (posicao == 1) {
			participante.ganhouOuro();
			participante.atletasGanharamMedalha("ouro");
			this.equipeOuro = participante;
		} else if (posicao == 2) {
			participante.ganhouPrata();
			participante.atletasGanharamMedalha("prata");
			this.equipePrata = participante;
		} else if (posicao == 3) {
			participante.ganhouBronze();
			participante.atletasGanharamMedalha("bronze");
			this.equipeBronze = participante;
		}
	}
	void podio() {
		String stringPodio = "";
		if (esporteAssociado.getTipo() == "individual") {
			stringPodio = "Ouro:\n" + this.atletaOuro + "\nPrata:\n" + this.atletaPrata + "\nBronze:\n" + this.atletaBronze;
		} else if (esporteAssociado.getTipo() == "equipe") {
			stringPodio = "Ouro:\n" + this.equipeOuro + "\nPrata:\n" + this.equipePrata + "\nBronze:\n" + this.equipeBronze;
		}
		System.out.println(stringPodio);
	}

	@Override
	public String toString() {
		return "Evento " + this.nome + " de " + this.esporteAssociado.getNome() + " ocorrido em " + this.data + " com " + this.totalDeParticipantes + " participantes.";
	}
}
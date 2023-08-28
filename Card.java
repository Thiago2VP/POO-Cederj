class Card{
	// Tarefa em formato de frase
	String tarefa = "";

	// Construção do card definindo a tarefa
	public Card(String tarefa_recebida) {
		tarefa = tarefa_recebida;
	}

	// Apresentar tarefa quando chamado
	public String toString() {
		return tarefa;
	}
}
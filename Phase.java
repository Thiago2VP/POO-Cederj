class Phase{
	// Vetor contendo os cards da fase
	final int MAX_CARDS = 10;
	int ind_array, prox_card;
	Card[] cards;

	// Construção definindo o vetor, o índice e preparando para adicionar valores
	Phase() {
		cards = new Card[MAX_CARDS];
		ind_array = 0;
		prox_card = 0;
	}

	// Adiciona o card à fase e incrementa a próxima posição
	public void adiciona(Card c) {
		if (prox_card == MAX_CARDS)
			System.out.println("A fase está cheia");
		else {
			cards[ind_array] = c;
			ind_array++;
			prox_card++;
		}
	}

	// Remove o card e decrementa a posição do próximo a ser adiconado
	public void remove(Card c) {
		int aux = ind_array + 1;
		for (int i=0; i<ind_array; i++) {
			if (cards[i].tarefa == c.tarefa) {
				aux = i;
			}
			// desloca os elementos para trás sobre o removido
			if (aux < ind_array - 1) {
				cards[aux] = cards[aux+1];
				aux++;
			}
		}
		if (aux <= ind_array) {
			ind_array--;
		}
	}

	// define a apresentação
	public String toString() {
		String resultado = "";
		for (int i=0; i<ind_array; i++)
			resultado += cards[i].toString() + "\n";
		return resultado;
	}
}
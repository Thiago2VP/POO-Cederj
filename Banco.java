class Banco{
	static int prox_banco = 1;
	final int MAX_CONTAS = 10;
	String nome;
	int codigo, prox_conta, ind_array;
	Conta[] contas;

	Banco(String n) {
		nome = n;
		codigo = prox_banco++;
		prox_conta = 1;
		contas = new Conta[MAX_CONTAS];
		ind_array = 0;
	}

	int pegaCodB() {
		return codigo;
	}

	String pegaNomeB() {
		return nome;
	}

	Conta criaConta(String nome) {
		Conta c;
		if (prox_conta == MAX_CONTAS)
			c = null;
		else {
			c = new Conta(nome, prox_conta++, this);
			contas[ind_array++] = c;
		}
		return c;
	}

	Conta buscaConta(int cod) {
		int i;
		for (i=0; i<ind_array; i++) {
			if (contas[i].pegaCodigo() == cod)
				return contas[i];
		}
		return null;
	}
}
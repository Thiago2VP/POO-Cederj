class Conta{
	String nome;
	int codigo;
	Banco banco;
	float saldo;

	Conta(String n, int c, Banco b) {
		nome = n;
		codigo = c;
		banco = b;
		saldo = 0F;
	}

	Banco pegaBanco() {
		return banco;
	}

	String pegaNome() {
		return nome;
	}

	int pegaCodigo() {
		return codigo;
	}

	float pegaSaldo() {
		return saldo;
	}

	void aplica(float soma) {
		saldo += soma;
	}

	void retira(float soma) {
		saldo -= soma;
	}
}
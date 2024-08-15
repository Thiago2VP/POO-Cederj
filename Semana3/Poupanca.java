class Poupanca extends Conta{
	Poupanca(String n, int c, Banco b) {
		super(n, c, b);
	}

	void retira(float soma) {
		if (saldo - soma < 0)
			System.out.println("A poupança não pode ter saldo negativo");
		else {
			saldo -= soma;
		}
	}

	public String toString() {
		return "Poupança";
	}
}
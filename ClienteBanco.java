public class ClienteBanco {
	String nome = "";
	int conta = 0;
	float saldo = 0;
	static float taxa_CPMF = 0.01F;

	void RegistraNome (String NOME) {
		this.nome = NOME;
	}

	void RealizaDeposito (float valorDeposito) {
		this.saldo = this.saldo + valorDeposito * (1 - this.taxa_CPMF);
	}

	void RealizaSaque (float valorSaque) {
		if (valorSaque > this.saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo = this.saldo - valorSaque;
		}
	}

	void RealizaTransferencia (ClienteBanco CONTA, float VALOR) {
		float saldoIni = this.saldo;
		this.RealizaSaque(VALOR);
		if (saldoIni != this.saldo) {
			CONTA.RealizaDeposito(VALOR);
		}
	}

	void VerNome () {
		System.out.println(this.nome);
	}

	void VerSaldo () {
		System.out.println(this.saldo);
	}

	public static void main (String arg[]) {
		ClienteBanco cliente1, cliente2;
		cliente1 = new ClienteBanco ();
		cliente2 = new ClienteBanco ();
		cliente1.RegistraNome("João");
		cliente2.RegistraNome("Maria");
		cliente1.RealizaDeposito(500);
		cliente2.RealizaDeposito(1000);
		cliente1.VerNome();
		cliente1.VerSaldo();
		cliente2.VerNome();
		cliente2.VerSaldo();
		cliente2.RealizaTransferencia(cliente1, 100);
		System.out.println("");
		cliente1.VerNome();
		cliente1.VerSaldo();
		cliente2.VerNome();
		cliente2.VerSaldo();
	}
}
public class ClienteBanco {
	private String nome = "";
	private int conta = 0;
	private float saldo = 0;
	private static float taxa_CPMF = 0.01F;
	private static int prox_conta = 1;

	ClienteBanco(String nome, float saldo) {
		this.nome = nome;
		this.conta = prox_conta++;
		this.saldo = saldo;
	}

	ClienteBanco(String nome) {
		this.nome = nome;
		this.conta = prox_conta++;
		this.saldo = 0;
	}

	void imprime() {
		System.out.println("Clinte: " + this.nome);
		System.out.println("Conta: " + this.conta);
		System.out.println("Saldo: " + this.saldo);
	}

	void RealizaDeposito(float valorDeposito) {
		if (valorDeposito >= 0) {
			this.saldo = this.saldo + valorDeposito * (1 - this.taxa_CPMF);
		}
	}

	void RealizaSaque(float valorSaque) {
		if (valorSaque > this.saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			if (valorSaque >= 0) {
				this.saldo = this.saldo - valorSaque;
			}
		}
	}

	void RealizaTransferencia(ClienteBanco CONTA, float VALOR) {
		float saldoIni = this.saldo;
		this.RealizaSaque(VALOR);
		if (saldoIni != this.saldo) {
			CONTA.RealizaDeposito(VALOR);
		}
	}

	public static void main(String[] args) {
		ClienteBanco cliente1 = new ClienteBanco("João", 500);
		ClienteBanco cliente2 = new ClienteBanco("Maria", 1200);
		cliente1.imprime();
		cliente2.imprime();
		cliente1.RealizaDeposito(100);
		cliente2.RealizaSaque(200);
		cliente1.imprime();
		cliente2.imprime();
		cliente1.RealizaTransferencia(cliente2, 300);
		cliente1.imprime();
		cliente2.imprime();
	}
}

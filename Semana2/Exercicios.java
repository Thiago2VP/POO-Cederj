class Pessoa {
	private String nome;
	private int idade;

	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	void fazerAniversario() {
		this.idade += 1;
	}

	void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
}

class Porta {
	private boolean aberta = false;
	private String cor = "Marrom";
	private double altura = 2.0;
	private double largura = 0.8;

	Porta(boolean aberta, String cor, double altura, double largura) {
		this.aberta = aberta;
		this.largura = largura;
		this.altura = altura;
		this.largura = largura;
	}

	void abrirPorta() {
		this.aberta = true;
	}
	void fecharPorta() {
		this.aberta = false;
	}
	void estaAberta() {
		if (this.aberta) {
			System.out.println("Está aberta");
		} else {
			System.out.println("Está aberta");
		}
	}
	void pintar(String cor) {
		this.cor = cor;
	}
	void alterarDimensoes(double altura, double largura) {
		if (altura > 0 && largura > 0) {
			this.altura = altura;
			this.largura = largura;
		}
	}
	void alterarAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	void alterarLargura(double largura) {
		if (altura > 0) {
			this.largura = largura;
		}
	}
	void imprime() {
		System.out.println("Está aberta: " + this.aberta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Dimansões: " + this.altura + "x" + this.largura);
	}
}

class Casa {
	private String cor = "Branco";
	Porta[] portas;

	Casa(String cor){
		this.cor = cor;
	}

	void pintarCasa(String cor) {
		this.cor = cor;
	}
	void imprime() {
		System.out.println("Cor: " + this.cor);
	}
}

public class Exercicios {
	public static void main(String[] args) {
		
	}
}
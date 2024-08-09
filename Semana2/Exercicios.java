import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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
	boolean estaAberta() {
		if (this.aberta) {
			System.out.println("Está aberta");
			return true;
		} else {
			System.out.println("Não está aberta");
			return false;
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
	private static int index_array = 0;
	private final int MAX_PORTAS = 10;

	Casa(String cor){
		this.cor = cor;
		this.portas = new Porta[MAX_PORTAS];
	}

	void pintarCasa(String cor) {
		this.cor = cor;
	}
	void adicionarPorta(Porta porta) {
		if (this.index_array == this.MAX_PORTAS) {
			System.out.println("Não há mais espaço para portas.");
		} else {
			this.portas[this.index_array++] = porta;
		}
	}
	void quantasPortasEstaoAbertas() {
		int count = 0;
		for (int i = 0; i < this.index_array; i++) {
			if (this.portas[i].estaAberta()) {
				count++;
			}
		}
		System.out.println(count + " porta(s) está(ão) abertas");
	}
	void imprime() {
		System.out.println("Cor: " + this.cor);
		for (int i = 0; i < this.index_array; i++) {
			System.out.println("Porta " + (i + 1));
			this.portas[i].imprime();
		}
	}
}

class Televisao {
	private int canal = 0;
	private int volume = 0;
	private boolean ligado = false;
	private boolean mudo = false;

	Televisao(int canal, int volume, boolean ligado, boolean mudo) {
		if (canal > 99) {
			this.canal = 99;
		} else {
			if (canal < 0) {
				this.canal = 0;
			} else {
				this.canal = canal;
			}
		}
		if (volume > 10) {
			this.volume = 10;
		} else {
			if (volume < 0) {
				this.volume = 0;
			} else {
				this.volume = volume;
			}
		}
		this.ligado = ligado;
		this.mudo = mudo;
	}
	Televisao() {

	}

	void desligar() {
		this.ligado = false;
	}
	void ligar() {
		this.ligado = true;
	}
	void mudarCanal(int canal) {
		if (this.ligado) {
			if (canal >= 0 && canal <= 99) {
				this.canal = canal;
			} else {
				System.out.println("Canal não encontrado");
			}
		}
	}
	void canalCima() {
		if (this.ligado) {
			this.canal++;
			if (this.canal > 99) {
				this.canal = 0;
			}
		}
	}
	void canalBaixo() {
		if (this.ligado) {
			this.canal--;
			if (this.canal < 0) {
				this.canal = 99;
			}
		}
	}
	void volumeCima() {
		if (this.ligado) {
			if (this.volume < 10) {
				this.volume++;
			}
		}
	}
	void volumeBaixo() {
		if (this.ligado) {
			if (this.volume > 0) {
				this.volume--;
			}
		}
	}
	void mutar() {
		if (this.ligado) {
			this.mudo = true;
		}
	}
	void desmutar() {
		if (this.ligado) {
			this.mudo = false;
		}
	}
	void estaLigada() {
		if (this.ligado) {
			System.out.println("Está ligada");
		} else {
			System.out.println("Está desligada");
		}
	}
	void imprime() {
		System.out.println("Ligado: " + this.ligado);
		System.out.println("Mudo: " + this.mudo);
		System.out.println("Volume: " + this.volume);
		System.out.println("Canal: " + this.canal);
	}
}

class Contato {
	private String nome = "";
	private String endereco = "";
	private String telefone = "";
	private String email = "";

	Contato(String nome, String endereco, String telefone, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	void setNome(String nome) {
		if (nome != "") {
			this.nome = nome;
		}
	}
	void setTelefone(String telefone) {
		if (telefone != "") {
			this.telefone = telefone;
		}
	}
	void setEndereco(String endereco) {
		if (endereco != "") {
			this.endereco = endereco;
		}
	}
	void setEmail(String email) {
		if (email != "") {
			this.email = email;
		}
	}
	void getNome() {
		System.out.println("Nome: " + this.nome);
	}
	void getTelefone() {
		System.out.println("Telefone: " + this.telefone);
	}
	void getEndereco() {
		if (this.endereco != "") {
			System.out.println("Endereço: " + this.endereco);
		}
	}
	void getEmail() {
		if (this.email != "") {
			System.out.println("Email: " + this.email);
		}
	}
	void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		if (this.endereco != "") {
			System.out.println("Endereço: " + this.endereco);
		}
		if (this.email != "") {
			System.out.println("Email: " + this.email);
		}
	}
}

class Agenda {
	private List<Contato> contatos;

	Agenda() {
		contatos = new ArrayList();
	}
	void adicionaContato(Contato pessoa) {
		contatos.add(pessoa);
	}
	void removeContato() {
		contatos.remove(contatos.size() - 1);
	}
	void imprime() {
		for (Contato c : contatos) {
			c.imprime();
		}
	}
}

class Carta {
	private String tipo;
	private String naipe;

	Carta(String tipo, String naipe) {
		this.tipo = tipo;
		this.naipe = naipe;
	}
	boolean compara(String tipo, String naipe) {
		if (this.tipo == tipo && this.naipe == naipe) {
			return true;
		}
		return false;
	}
	void imprime() {
		System.out.println(this.tipo + " de " + this.naipe);
	}
}

class Baralho {
	private Carta[] cartas;
	private static int indexArray = 0;
	private final int MAXSIZE = 52;

	Baralho() {
		this.cartas = new Carta[this.MAXSIZE];
	}

	void adicionaCarta(Carta carta) {
		if (this.indexArray == 52) {
			System.out.println("Baralho cheio");
		} else {
			this.cartas[this.indexArray++] = carta;
		}
	}
	void removeCarta(String tipo, String naipe) {
		int indexAuxiliar = 0;
		for (int i = 0; i < this.indexArray; i++) {
			if (this.cartas[i].compara(tipo, naipe)) {
				indexAuxiliar = i;
				break;
			}
		}
		if (indexAuxiliar > 0) {
			for (int i = indexAuxiliar; i < (this.indexArray - 1); i++) {
				this.cartas[i] = this.cartas[i + 1];
			}
			this.indexArray = this.indexArray - 1;
		}
	}
	void indexDaCarta(String tipo, String naipe) {
		for (int i = 0; i < this.indexArray; i++) {
			if (this.cartas[i].compara(tipo, naipe)) {
				System.out.println(i);
			}
		}
	}
	void cartaPorIndex(int index) {
		if (index < this.indexArray) {
			this.cartas[index].imprime();
		}
	}
	void embaralhar() {
		int inicio = ThreadLocalRandom.current().nextInt(0, this.indexArray - 1);
		int fim = this.indexArray;
		int intervalo = ThreadLocalRandom.current().nextInt(0, (this.indexArray - 1) / 2);
		Carta generica;
		for (int i = 0; i < intervalo; i++) {
			if (inicio < this.indexArray && fim > 0) {
				generica = this.cartas[inicio];
				this.cartas[inicio] = this.cartas[fim];
				this.cartas[fim] = generica;
				inicio++;
				fim--;
			}
		}
	}
	void imprime() {
		for (int i = 0; i < this.indexArray; i++) {
			this.cartas[i].imprime();
		}
	}
}

public class Exercicios {
	public static void main(String[] args) {
		Carta carta1 = new Carta("Ás", "espadas");
		Carta carta2 = new Carta("7", "ouros");
		Carta carta3 = new Carta("10", "paus");
		Baralho baralho1 = new Baralho();
		for (int i = 0; i < 25; i++) {
			baralho1.adicionaCarta(carta1);
		}
		baralho1.adicionaCarta(carta3);
		for (int i = 0; i < 25; i++) {
			baralho1.adicionaCarta(carta2);
		}
		baralho1.adicionaCarta(carta3);
		baralho1.removeCarta("10", "paus");
		baralho1.adicionaCarta(carta3);
		baralho1.imprime();
		baralho1.embaralhar();
	}
}
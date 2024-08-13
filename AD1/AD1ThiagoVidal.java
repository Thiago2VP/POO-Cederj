public class AD1ThiagoVidal {
	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("André", 21, "Brasileiro");
		Atleta atleta2 = new Atleta("Rômulo", 25, "Brasileiro");
		Atleta atleta3 = new Atleta("Hanz", 23, "Alemão");
		Atleta atleta4 = new Atleta("Fritz", 28, "Alemão");
		Atleta atleta5 = new Atleta("Roberto", 18, "Costa Riquenho");
		Atleta atleta6 = new Atleta("Fernando", 26, "Costa Riquenho");
		Atleta atleta7 = new Atleta("Yuri", 24, "Russo");
		Atleta atleta8 = new Atleta("Vladmir", 27, "Russo");
		Atleta atleta9 = new Atleta("Himeo", 19, "Japonês");
		Atleta atleta10 = new Atleta("Hirokodaki", 22, "Japonês");
		
		Equipe equipe1 = new Equipe("Regata Brasileira");
		Equipe equipe2 = new Equipe("Browsers");
		Equipe equipe3 = new Equipe("Navegadores");
		Equipe equipe4 = new Equipe("Brauzery");
		Equipe equipe5 = new Equipe("Burauza");
		
		equipe1.inserirAtleta(atleta1);
		equipe1.inserirAtleta(atleta2);
		equipe2.inserirAtleta(atleta3);
		equipe2.inserirAtleta(atleta4);
		equipe3.inserirAtleta(atleta5);
		equipe3.inserirAtleta(atleta6);
		equipe4.inserirAtleta(atleta7);
		equipe4.inserirAtleta(atleta8);
		equipe5.inserirAtleta(atleta9);
		equipe5.inserirAtleta(atleta10);

		Esporte esporte1 = new Esporte("Canoagem", "equipe");

		Evento evento1 = new Evento("Corrida no Sena", "30/07 - 13 horas", esporte1, 5);
		
		evento1.adicionarMedalha(equipe1, 1);
		evento1.adicionarMedalha(equipe2, 5);
		evento1.adicionarMedalha(equipe3, 2);
		evento1.adicionarMedalha(equipe4, 4);
		evento1.adicionarMedalha(equipe5, 3);

		System.out.println(equipe1.pontuacao());
		System.out.println(equipe2.pontuacao());
		System.out.println(equipe3.pontuacao());
		System.out.println(equipe4.pontuacao());
		System.out.println(equipe5.pontuacao());
	}
}
class Secretaria extends Empregado{
	String[] contatos;
	int pos_livre = 0;

	Secretaria(String n, float s, int a){
		super(n, s, a);
		contatos = new String[5];
	}

	void guardaNome(String n){
		contatos[pos_livre++] = n;
		if (pos_livre == 5) pos_livre = 0;
	}

	public String toString(){
		return "Secretaria";
	}
}
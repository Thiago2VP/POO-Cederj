class Gerente extends Empregado{
	Secretaria secret;
	Empregado[] subord;

	Gerente(String n, float s, int a, Secretaria sec, Empregado e1, Empregado e2){
		super(n, s, a);
		subord = new Empregado[2];
		secret = sec;
		subord[0] = e1;
		subord[1] = e2;
	}

	public String toString(){
		return "Gerente";
	}

	void aumento(){
		secret.aumentaSal(0.1F);
		int i;
		for(i = 0; i < 2; i++){
			subord[i].aumentaSal(0.15F);
		}
	}

	void imprime(){
		super.imprime();
		secret.imprime();
		int i;
		for(i = 0; i < 2; i++){
			subord[i].imprime();
		}
	}
}
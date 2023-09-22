class Empregado{
	String nome;
	float salario;
	int ano;

	Empregado(String n, float s, int a){
		nome = n;
		salario = s;
		ano = a;
	}

	String obterNome(){
		return nome;
	}

	float obterSalario(){
		return salario;
	}

	int obterAno(){
		return ano;
	}

	void aumentaSal(float t){
		salario *= (1 + t);
	}

	public String toString(){
		return "Empregado";
	}

	void imprime(){
		System.out.println(this + ":" + nome + " " + ano + " " + salario);
	}
}
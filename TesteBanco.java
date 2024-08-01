class TesteBanco {
	public static void main(String[] args) {
		Banco itau = new Banco("Itau");
		System.out.println(itau.pegaCodB());
		System.out.println(itau.pegaNomeB());
		Conta maria = itau.criaConta("Maria");
		System.out.println(maria);
		Banco bb = new Banco("Banco do Brasil");
		Conta jose = bb.criaConta("Jose");
		System.out.println(jose.pegaNome());
		System.out.println(jose.pegaCodigo());
		System.out.println(jose.pegaSaldo());
		jose.aplica(100.0F);
		jose.retira(30.5F);
		System.out.println(jose.pegaSaldo());
		System.out.println("Agora a poupança");
		Poupanca joao = itau.criaPoupanca("João");
		System.out.println(joao + " " + joao.pegaNome());
		System.out.println(joao + " " + joao.pegaCodigo());
		System.out.println(joao + " " + joao.pegaSaldo());
		joao.aplica(100.0F);
		System.out.println(joao + " " + joao.pegaSaldo());
		joao.retira(150.0F);
		System.out.println(joao + " " + joao.pegaSaldo());
		joao.retira(30.5F);
		System.out.println(joao + " " + joao.pegaSaldo());
	}
}
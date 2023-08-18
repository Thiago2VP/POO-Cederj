class IdTeste {
	static int prox_id = 0;
	int id;
	IdTeste() {
		id = prox_id++;
	}

	public static void main(String[] args) {
		IdTeste l = new IdTeste();
		IdTeste c = new IdTeste();

		System.out.println(l.id);
		System.out.println(c.id);
	}
}
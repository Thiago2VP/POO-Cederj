class Operadores {
	int x;

	void setValues (int value) {
		this.x = value;
	}

	void and (int value) {
		this.x = this.x & value;
	}

	void timesTwo (int value) {
		this.x = this.x << value;
	}

	void divTwo (int value) {
		this.x = this.x >> value;
	}

	void convercaoExplicita (double value) {
		System.out.println(value);
		int inteiro = (int) value;
		System.out.println(inteiro);
	}

	void condiional (int num1, int num2) {
		int res;
		res = num1 > num2 ? num1 : num2;
		System.out.println(res);
	}

	void printVal () {
		System.out.println(this.x);
	}

	public static void main (String arg[]) {
		Operadores o = new Operadores ();
		o.setValues(5);
		o.printVal();
		o.and(5);
		o.printVal();
		o.timesTwo(1);
		o.printVal();
		o.divTwo(1);
		o.printVal();
		double num = 7.562;
		o.convercaoExplicita(num);
		o.condiional(5, 9);
	}
}
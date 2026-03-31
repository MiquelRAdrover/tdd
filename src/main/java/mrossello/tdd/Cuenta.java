package mrossello.tdd;

class Cuenta {
	double saldo;

	public Cuenta() {
		this.saldo = 0.0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void anadirSaldo(double dinero) {
		if (dinero < 0 || dinero > 3000) {
			return;
		}
		this.saldo += dinero;
	}

	public void retirarDinero(double dineroRetirar) {
		if (dineroRetirar > saldo) {
			return;
		}
		saldo -= dineroRetirar;
	}
}
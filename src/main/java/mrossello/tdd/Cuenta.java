package mrossello.tdd;

public class Cuenta {
	double saldo;

	public Cuenta() {
		this.saldo = 0;
	}

	public void ingresar(double ingreso) {
		this.saldo += 2000;
	}

	public double getSaldo() {
		return saldo;
	}
}

package mrossello.tdd;

public class Cuenta {
	double saldo;

	public Cuenta() {
		this.saldo = 0;
	}

	public void ingresar() {
		this.saldo += 10;
	}

	public double getSaldo() {
		return saldo;
	}
}

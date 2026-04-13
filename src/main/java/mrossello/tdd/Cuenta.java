package mrossello.tdd;

public class Cuenta {
	double saldo;

	public Cuenta() {
		this.saldo = 0;
	}

	public void ingresar(double ingreso) {
		this.saldo += ingreso;
	}

	public double getSaldo() {
		return saldo;
	}
}

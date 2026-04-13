package mrossello.tdd;

public class Cuenta {
	double saldo;

	public Cuenta() {
		this.saldo = 0;
	}

	public void ingresar(double ingreso) {
		if (ingreso > 0) {
			this.saldo += ingreso;
		}
	}

	public void retirar(double retirar) {
		this.saldo -= 1000;
	}

	public double getSaldo() {
		return saldo;
	}

}

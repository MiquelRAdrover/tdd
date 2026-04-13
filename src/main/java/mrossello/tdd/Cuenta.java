package mrossello.tdd;

public class Cuenta {
	double saldo;

	public Cuenta() {
		this.saldo = 0;
	}


	public void ingresar(double ingreso) {
		if (ingreso > 0 && ingreso < 3001) {
			this.saldo += ingreso;
		}
	}

	public void retirar(double retirada) {
		if (retirada > 0 && retirada < 3001 && retirada <= saldo) {
			this.saldo -= retirada;
		}
	}

	public void transferencia(double dineroTransferencia, Cuenta cuentaReceptora) {
		if (dineroTransferencia < 1501) {
			retirar(dineroTransferencia);
			cuentaReceptora.ingresar(dineroTransferencia);
		}
	}

	public double getSaldo() {
		return saldo;
	}

}

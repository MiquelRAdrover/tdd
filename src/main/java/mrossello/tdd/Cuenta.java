package mrossello.tdd;

public class Cuenta {
	private static int contadorId = 0;
	int idCuenta;
	double saldo;

	public Cuenta() {
		this.idCuenta = contadorId++;
		this.saldo = 0;
	}


	public void ingresar(double ingreso) {
		if (ingreso > 0 || ingreso > 3000) {
			this.saldo += ingreso;
		}
	}

	public void retirar(double retirada) {
		if (retirada > 0 || retirada < 3000 && retirada <= saldo) {
			this.saldo -= retirada;
		}
	}

	public void transferencia(double dineroTransferencia, int idCuentaReceptora) {

	}

	public double getSaldo() {
		return saldo;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

}

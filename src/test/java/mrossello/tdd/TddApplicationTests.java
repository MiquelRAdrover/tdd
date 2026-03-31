package mrossello.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class TddApplicationTests {
	//Practica1
	@Test
	void crearCuenta() {
		Cuenta cuenta = new Cuenta();

		double saldoActual = cuenta.getSaldo();

		assertThat(saldoActual).isZero();
	}

	//Practica2
	@Test
	void ingresar10DeSaldo() {
		Cuenta cuenta = new Cuenta();
		double dineroAnadir = 10;
		cuenta.anadirSaldo(dineroAnadir);
		Assertions.assertEquals(dineroAnadir, cuenta.getSaldo());
	}

	//Practica3
	@Test
	void ingresar2000DeSaldo() {
		Cuenta cuenta = new Cuenta();
		double dineroAnadir = 2000;
		cuenta.anadirSaldo(dineroAnadir);
		Assertions.assertEquals(dineroAnadir, cuenta.getSaldo());
	}

	//Practica4
	@Test
	void ingresarDineroEnCuentaDondeYaHayDinero() {
		double saldo = 100;
		double ingreso = 2500;
		Cuenta cuenta = new Cuenta();
		cuenta.anadirSaldo(saldo);
		cuenta.anadirSaldo(ingreso);
		Assertions.assertEquals(saldo + ingreso, cuenta.getSaldo());
	}

	//Practica5
	@Test
	void ingresarDineroEnNegativo() {
		double saldo = -10;
		Cuenta cuenta = new Cuenta();
		cuenta.anadirSaldo(saldo);
		Assertions.assertEquals(0, cuenta.getSaldo());
	}

	//Practica7
	@Test
	void retiradaDeDinero() {
		double saldo = 1000;
		double dineroRtitirada = 1000;
		Cuenta cuenta = new Cuenta();
		cuenta.anadirSaldo(saldo);
		cuenta.retirarDinero(dineroRtitirada);
		Assertions.assertEquals(0, cuenta.getSaldo());
	}
}

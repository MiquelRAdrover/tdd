package mrossello.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

	@Test
	void creacionCuenta() {
		Cuenta cuenta = new Cuenta();
		Assertions.assertEquals(0, cuenta.saldo);
	}

	@Test
	void ingreser10EnCuenta() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingresar(10);
		Assertions.assertEquals(10, cuenta.saldo);
	}

	@Test
	void ingreser2000EnCuenta() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingresar(2000);
		Assertions.assertEquals(2000, cuenta.saldo);
	}

	@Test
	void ingresarEnCuentaConDinero() {
		Cuenta cuenta = new Cuenta();
		double dinero = 100;
		double ingreso = 2500;
		cuenta.ingresar(dinero);
		cuenta.ingresar(ingreso);
		Assertions.assertEquals(dinero + ingreso, cuenta.saldo);
	}

	@Test
	void ingresarNegativo() {
		Cuenta cuenta = new Cuenta();
		double ingreso = -10;
		cuenta.ingresar(ingreso);
		Assertions.assertEquals(0, cuenta.saldo);
	}

	@Test
	void retiradaDinero() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 1000;
		cuenta.ingresar(ingreso);
		cuenta.retirar(1000);
		Assertions.assertEquals(0, cuenta.saldo);
	}

}

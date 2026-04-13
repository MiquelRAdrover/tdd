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
		cuenta.ingresar(100);
		cuenta.ingresar(2500);
		Assertions.assertEquals(2600, cuenta.saldo);
	}


}

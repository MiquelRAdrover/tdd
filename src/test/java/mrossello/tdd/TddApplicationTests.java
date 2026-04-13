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
		cuenta.ingresar();
		Assertions.assertEquals(10, cuenta.saldo);
	}


}

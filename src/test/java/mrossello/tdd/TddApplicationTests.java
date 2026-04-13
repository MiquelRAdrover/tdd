package mrossello.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

	@Test
	void creacionCuenta() {
		Cuenta cuenta = new Cuenta();
		Assertions.assertEquals(2, cuenta.saldo);
	}


}

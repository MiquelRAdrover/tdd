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
	void ingresar3000EnCuentaVacia() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 3000;
		cuenta.ingresar(ingreso);
		Assertions.assertEquals(ingreso, cuenta.saldo);
	}

	@Test
	void ingresar3001EnCuentaVaciaNoPasaNada() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 3001;
		cuenta.ingresar(ingreso);
		Assertions.assertEquals(0, cuenta.saldo);
	}


	@Test
	void retiradaDinero() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 1000;
		double retirada = 1000;
		cuenta.ingresar(ingreso);
		cuenta.retirar(retirada);
		Assertions.assertEquals(0, cuenta.saldo);
	}

	@Test
	void retirar10EnUnaCuentaDe500Esperamos490() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 500;
		double retirada = 10;
		cuenta.ingresar(ingreso);
		cuenta.retirar(retirada);
		Assertions.assertEquals(ingreso - retirada, cuenta.saldo);
	}

	@Test
	void retirar300EnUnaCuentaDe100INoPasaNada() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 100;
		double retirada = 300;
		cuenta.ingresar(ingreso);
		cuenta.retirar(retirada);
		Assertions.assertEquals(ingreso, cuenta.saldo);
	}

	@Test
	void retirar10EnNegativoEnUnaCuentaDe300ResultadoEsperado300() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 300;
		double retirada = -10;
		cuenta.ingresar(ingreso);
		cuenta.retirar(retirada);
		Assertions.assertEquals(ingreso, cuenta.saldo);
	}

	@Test
	void retirar3000EnUnaCuentaDe4000() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 2000;
		double retirada = 3000;
		cuenta.ingresar(ingreso);
		cuenta.ingresar(ingreso);
		cuenta.retirar(retirada);
		Assertions.assertEquals((ingreso + ingreso) - retirada, cuenta.saldo);
	}

	@Test
	void retirar3001EnUnaCuentaDe4000ResultadoEsperado4000() {
		Cuenta cuenta = new Cuenta();
		double ingreso = 2000;
		double retirada = 3001;
		cuenta.ingresar(ingreso);
		cuenta.ingresar(ingreso);
		cuenta.retirar(retirada);
		Assertions.assertEquals((ingreso + ingreso), cuenta.saldo);
	}

	@Test
	void tranferenciaDe10DesdeUnaCuentaCon300AUnaCon400() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.ingresar(300);
		cuenta2.ingresar(400);
		cuenta.transferencia(10, cuenta2);
		Assertions.assertEquals(290, cuenta.saldo);
		Assertions.assertEquals(410, cuenta2.saldo);
	}

	@Test
	void tranferenciaDe100DesdeUnaCuentaCon300AUnaCon400() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.ingresar(300);
		cuenta2.ingresar(400);
		cuenta.transferencia(100, cuenta2);
		Assertions.assertEquals(200, cuenta.saldo);
		Assertions.assertEquals(500, cuenta2.saldo);
	}

	@Test
	void tranferenciaDe10EnNegativoDesdeUnaCuentaCon300AUnaCon40() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.ingresar(300);
		cuenta2.ingresar(40);
		cuenta.transferencia(-10, cuenta2);
		Assertions.assertEquals(300, cuenta.saldo);
		Assertions.assertEquals(40, cuenta2.saldo);
	}

	@Test
	void tranferenciaDe1500DesdeUnaCuentaCon2500AUnaCon500() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.ingresar(2500);
		cuenta2.ingresar(500);
		cuenta.transferencia(1500, cuenta2);
		Assertions.assertEquals(1000, cuenta.saldo);
		Assertions.assertEquals(2000, cuenta2.saldo);
	}

	@Test
	void tranferenciaDe1501DesdeUnaCuentaCon2500AUnaCon500() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.ingresar(2500);
		cuenta2.ingresar(500);
		cuenta.transferencia(1501, cuenta2);
		Assertions.assertEquals(2500, cuenta.saldo);
		Assertions.assertEquals(500, cuenta2.saldo);
	}

	@Test
	void tranferenciaDe1000DesdeUnaCuentaCon2500AUnaCon500YUnaSegundaTransferenciaDe1200() {
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		cuenta.ingresar(2500);
		cuenta2.ingresar(500);
		cuenta.transferencia(1000, cuenta2);
		cuenta.transferencia(1200, cuenta2);
		Assertions.assertEquals(300, cuenta.saldo);
		Assertions.assertEquals(2700, cuenta2.saldo);
	}

}

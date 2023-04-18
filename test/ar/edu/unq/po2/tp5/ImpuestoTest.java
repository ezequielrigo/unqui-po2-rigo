package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTest {
	
	private Impuesto impuesto;
	
	@BeforeEach
	public void setUo() {
		impuesto = new Impuesto(1250);
	}

	@Test
	void testMontoAPagar() {
		assertEquals(1250,impuesto.montoAPagar());
	}

}

package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {
	
	private Servicio servicio;
	
	@BeforeEach
	public void setUp() {
		servicio = new Servicio(10,25) ;
	}
	
	@Test
	void testMontoAPagar() {
		assertEquals(250,servicio.montoAPagar());
	}

}

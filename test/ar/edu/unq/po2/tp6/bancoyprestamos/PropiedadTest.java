package ar.edu.unq.po2.tp6.bancoyprestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {

	private Propiedad propiedadApta;
	private Propiedad propiedadNoApta;
	
	@BeforeEach
	public void setUp() {
		propiedadApta = new Propiedad("casa grande", "otamendi 13", 300000);
		propiedadNoApta = new Propiedad("casa chica", "brandsen 23", 80000);
	}
	
	@Test
	void testConstructor() {
		assertEquals("casa grande", propiedadApta.getDescripcion());
		assertEquals("brandsen 23", propiedadNoApta.getDireccion());
		assertEquals(300000, propiedadApta.getValor());
	}

}

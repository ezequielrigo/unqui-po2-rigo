package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Producto arroz; 
	private Producto vino;
	private Caja caja;
	

	@BeforeEach
	public void setUp() {
		arroz = new Producto( 18.9d, 10);
		vino = new Producto(1100.0d, 200);
		caja = new Caja();
	}

	
	@Test
	void testRegistrarProducto() {
		caja.registrarProducto(arroz);
		assertEquals(9, arroz.getCantidadEnStock());
		assertEquals(18.9d, caja.getMontoAPagar());
		caja.registrarProducto(vino);
		assertEquals(1118.9d, caja.getMontoAPagar());
	}

}

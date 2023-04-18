package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest {
	
	private ProductoCooperativa leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoCooperativa(10.0d,20);
	}

	@Test
	void testConstructor() {
		assertEquals(10.0d,leche.precio);
		assertEquals(9.0d,leche.getPrecio());
		assertEquals(20,leche.getCantidadEnStock());
	}
	
	@Test
	void testGetPrecio() {
		assertEquals(9.0d,leche.getPrecio());
	}

	@Test
	void testGetySetDescuento() {
		leche.setDescuento(0.5);
		assertEquals(5.0d,leche.getPrecio());
		assertEquals(0.5d,leche.getDescuento());
	}
}

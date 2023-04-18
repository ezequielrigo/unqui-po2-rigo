package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
	private Producto mermelada;
	
	@BeforeEach
	public void setUp() {
		mermelada = new Producto(250.5d,50);
	}
	
	
	@Test
	void testConstructor() {
		assertEquals(250.5d, mermelada.getPrecio());
		assertEquals(50, mermelada.getCantidadEnStock());
	}
	
	@Test
	void testSetPrecio() {
		mermelada.setPrecio(80.8d);
		assertEquals(80.8d, mermelada.getPrecio());
	}
	
	@Test
	void testSetCantidadEnStock() {
		mermelada.setCantidadEnStock(0);
		assertEquals(0, mermelada.getCantidadEnStock());
	}
	
	@Test
	void testDisminuirStock() {
		mermelada.disminuirStock();
		assertEquals(49, mermelada.getCantidadEnStock());
		mermelada.setCantidadEnStock(0);
		mermelada.disminuirStock();
		assertEquals(-1, mermelada.getCantidadEnStock()); // no debería llamarse este método si el stock está en cero.
	}

}

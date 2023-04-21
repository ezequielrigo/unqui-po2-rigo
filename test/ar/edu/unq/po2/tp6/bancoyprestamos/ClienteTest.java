package ar.edu.unq.po2.tp6.bancoyprestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	private Cliente cliente1;
	private Banco banco;
	
	@BeforeEach
	public void setUp() {
		banco = new Banco ();
		cliente1 = new Cliente ("juan","perez","av.siempreviva",22,16000.0d,banco);
	}

	@Test
	void testConstructor() {
		assertEquals("juan", cliente1.getNombre());
		assertEquals("perez", cliente1.getApellido());
		assertEquals("av.siempreviva", cliente1.getDireccion());
		assertEquals(22, cliente1.getEdad());
		assertEquals(16000.0d, cliente1.getSueldoNetoMensual());
	}

}

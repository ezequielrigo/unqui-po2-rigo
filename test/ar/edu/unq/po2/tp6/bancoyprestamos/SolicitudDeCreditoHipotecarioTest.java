package ar.edu.unq.po2.tp6.bancoyprestamos;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoHipotecarioTest {
	
	private Banco banco;
	private Cliente cliente;
	private Cliente  cliente1;
	private SolicitudDeCreditoPersonal personal;
	private SolicitudDeCreditoHipotecario hipotecario;
	private SolicitudDeCreditoPersonal personalNoApta;
	private SolicitudDeCreditoHipotecario hipotecarioNoApto;
	private Propiedad propiedadApta;
	private Propiedad propiedadNoApta;
	
	@BeforeEach
	public void setUp() {
		
		banco = new Banco ();
		cliente = new Cliente ("juan","perez","av.siempreviva",22,16000.0d,banco);
		cliente1 = new Cliente ("pedro","sanchez","av.siempreviva",64,10000.0d,banco);
		personal = new SolicitudDeCreditoPersonal(cliente, 0, 0);
		hipotecario = new SolicitudDeCreditoHipotecario(cliente, 50000, 240, propiedadApta);
		personalNoApta = new SolicitudDeCreditoPersonal(cliente1, 0, 0);
		hipotecarioNoApto = new SolicitudDeCreditoHipotecario(cliente, 100000, 120, propiedadNoApta);
		propiedadApta = new Propiedad("casa grande", "otamendi 13", 300000);
		propiedadNoApta = new Propiedad("casa chica", "brandsen 23", 80000);
	}
	

	@Test
	void testCumpleRequisitos() {
		assertTrue(hipotecario.cumpleRequisitos());
	}

}

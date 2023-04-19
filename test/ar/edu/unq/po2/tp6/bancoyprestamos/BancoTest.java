package ar.edu.unq.po2.tp6.bancoyprestamos;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	private Banco banco;
	private Cliente cliente;
	private SolicitudDeCreditoPersonal personal;
	private SolicitudDeCreditoHipotecario hipotecario;
	private SolicitudDeCreditoPersonal personalNoApta;
	private SolicitudDeCreditoHipotecario hipotecarioNoApto;
	
	@BeforeEach
	public void setUp() {
		
		banco = new Banco ();
		cliente = new Cliente ();
		personal = new SolicitudDeCreditoPersonal();
		hipotecario = new SolicitudDeCreditoHipotecario();
		personalNoApta = new SolicitudDeCreditoPersonal();
		hipotecarioNoApto = new SolicitudDeCreditoHipotecario();
	}
	
	@Test
	void testAddCliente() {
		banco.addCliente(cliente);
		assertNotNull(banco.getClientes());
	}
	
	@Test
	void testRegistrarSolicitud() {
		banco.registrarSolicitud(personal);
		assertEquals(1, banco.getSolicitudes().size());
		banco.registrarSolicitud(hipotecario);
		assertEquals(2, banco.getSolicitudes().size());
	}
	
	@Test
	void testEvaluarSolicitud() {
		banco.registrarSolicitud(personal);
		banco.evaluarSolicitud();
		assertEquals(1, banco.getSolicitudesAprobadas().size());
		banco.registrarSolicitud(personalNoApta);
		banco.evaluarSolicitud();
		assertEquals(1, banco.getSolicitudesRechazadas().size());
		banco.registrarSolicitud(hipotecario);
		banco.evaluarSolicitud();
		assertEquals(2, banco.getSolicitudesAprobadas().size());
		banco.registrarSolicitud(hipotecarioNoApto);
		banco.evaluarSolicitud();
		assertEquals(2, banco.getSolicitudesRechazadas().size());
	}
	
	@Test
	void testOtorgarCredito() {
		banco.registrarSolicitud(personal);
		banco.evaluarSolicitud();
		assertNotEquals(0, banco.getMontoPrestado());
		assertEquals(personal.getMonto(), banco.getMontoPrestado());
	}
	
	@Test
	void testRechazarCredito() {
		banco.registrarSolicitud(personalNoApta);
		banco.evaluarSolicitud();
		assertEquals(0, banco.getMontoPrestado());
		assertEquals(1, banco.getSolicitudesRechazadas().size());
		
	}

}

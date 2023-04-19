package ar.edu.unq.po2.tp6.bancoyprestamos;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudes;
	private ArrayList<SolicitudDeCredito> solicitudesAprobadas;
	private ArrayList<SolicitudDeCredito> solicitudesRechazadas;
	private double montoPrestado;
	private double montoCobrado;
	
	public Banco(ArrayList<Cliente> clientes, ArrayList<SolicitudDeCredito> solicitudes) {
		this.clientes = clientes;
		this.solicitudes = solicitudes;
	}
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public ArrayList<SolicitudDeCredito> getSolicitudesAprobadas() {
		return solicitudesAprobadas;
	}

	public ArrayList<SolicitudDeCredito> getSolicitudesRechazadas() {
		return solicitudesRechazadas;
	}
	

	public double getMontoPrestado() {
		return montoPrestado;
	}

	public double getMontoCobrado() {
		return montoCobrado;
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	public void evaluarSolicitud() {
		if (solicitudes.get(0).cumpleRequisitos()) {
			this.otorgarCredito(solicitudes.get(0));
		} else {
			this.rechazarCredito(solicitudes.get(0));
		}
		solicitudes.remove(0);
	}

	private void rechazarCredito(SolicitudDeCredito solicitudDeCredito) {
		solicitudesRechazadas.add(solicitudDeCredito);
		
	}

	private void otorgarCredito(SolicitudDeCredito solicitudDeCredito) {
		solicitudesAprobadas.add(solicitudDeCredito);
		this.montoPrestado += solicitudDeCredito.getMonto();
		solicitudDeCredito.getCliente().cobrar(solicitudDeCredito.getMonto());
		solicitudDeCredito.getCliente().pagarPrestamo(solicitudDeCredito.getMonto(),solicitudDeCredito.getPlazo());
	}
	
	public void cobrar(double monto) {
		this.montoCobrado += monto;
	}
	
}

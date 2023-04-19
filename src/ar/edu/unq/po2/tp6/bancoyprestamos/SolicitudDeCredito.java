package ar.edu.unq.po2.tp6.bancoyprestamos;

public abstract class SolicitudDeCredito {

	public Cliente cliente;
	public double monto;
	public int plazo;
	
	
	public SolicitudDeCredito(Cliente cliente, double monto, int plazo) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}

	abstract public boolean cumpleRequisitos();
	
	public double getMonto() {
		return monto;
	}

	public int getPlazo() {
		return plazo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getMontoCuotaMensual() {
		return monto / plazo;
	}

}

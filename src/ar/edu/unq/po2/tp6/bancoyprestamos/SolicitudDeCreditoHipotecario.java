package ar.edu.unq.po2.tp6.bancoyprestamos;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	private Propiedad propiedadEnGarantia;

	public SolicitudDeCreditoHipotecario(Cliente cliente, double monto, int plazo, Propiedad propiedadEnGarantia) {
		super(cliente, monto, plazo);
		this.propiedadEnGarantia = propiedadEnGarantia;
	}

	@Override
	public boolean cumpleRequisitos() {
		return this.cuotaEsPagable()
				&& this.garantiaEsSuficiente()
				&& this.edadEsPermitida();
	}
	
	public boolean cuotaEsPagable() {
		return this.getMontoCuotaMensual()< this.getCliente().getSueldoNetoMensual()*0.5;
	}
	
	public boolean garantiaEsSuficiente() {
		return this.getMonto() < (propiedadEnGarantia.getValor()* 0.7d);
	}
	
	public boolean edadEsPermitida() {
		return (this.getCliente().getEdad()+ this.getPlazo()/12) < 65;
	}
	
	
}

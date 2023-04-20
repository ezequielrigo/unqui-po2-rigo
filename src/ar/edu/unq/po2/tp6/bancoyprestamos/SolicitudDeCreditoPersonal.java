package ar.edu.unq.po2.tp6.bancoyprestamos;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {


	public double salarioMinimo = 15000;
	public double porcentajeDeIngreso = 0.7;
	
	public SolicitudDeCreditoPersonal(Cliente cliente, double monto, int plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	public boolean cumpleRequisitos() {

		return false;
	}
}

package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{
	
	public double tasaDeServicio;

	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
	
	@Override
	public double montoAPagar() {
		return this.getTasaDeServicio();
	}

}

package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	public int unidadesConsumidas;
	public double costoUnidad;
	
	
	
	public int getUnidadesConsumidas() {
		return unidadesConsumidas;
	}



	public void setUnidadesConsumidas(int unidadesConsumidas) {
		this.unidadesConsumidas = unidadesConsumidas;
	}



	public double getCostoUnidad() {
		return costoUnidad;
	}



	public void setCostoUnidad(double costoUnidad) {
		this.costoUnidad = costoUnidad;
	}
	
	@Override
	public double montoAPagar() {
		return this.getCostoUnidad() * this.getUnidadesConsumidas();
	}
	
}

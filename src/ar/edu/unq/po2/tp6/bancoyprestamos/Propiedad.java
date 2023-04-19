package ar.edu.unq.po2.tp6.bancoyprestamos;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private double valor;
	
	public Propiedad(String descripcion, String direccion, double valor) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}

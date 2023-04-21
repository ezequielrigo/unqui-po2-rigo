package ar.edu.unq.po2.tp5;

public class Producto {
	
	String nombre;
	double precio;
	int cantidadEnStock;
	
	public double getPrecio() {
		return precio*1.21;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidadEnStock() {
		return cantidadEnStock;
	}
	public void setCantidadEnStock(int cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}
	public Producto(String nombre, double precio, int cantidadEnStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadEnStock = cantidadEnStock;
	}
	public void disminuirStock() {
		this.cantidadEnStock -= 1;
	}
	

}

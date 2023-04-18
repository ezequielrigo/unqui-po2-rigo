package ar.edu.unq.po2.tp5;

public class Producto {
	
	double precio;
	int cantidadEnStock;
	
	public double getPrecio() {
		return precio;
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
	public Producto(double precio, int cantidadEnStock) {
		this.precio = precio;
		this.cantidadEnStock = cantidadEnStock;
	}
	public void disminuirStock() {
		this.cantidadEnStock -= 1;
	}
	

}

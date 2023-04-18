package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	double descuento;
		
	public ProductoCooperativa(double precio, int cantidadEnStock) {
		super(precio, cantidadEnStock);
		this.setDescuento(0.9);
	}
	
	@Override
	public double getPrecio() {
		return precio * descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
}

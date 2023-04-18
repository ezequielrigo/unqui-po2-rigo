package ar.edu.unq.po2.tp5;

public class Caja implements Agencia {
	
	double montoAPagar;
	
	public void registrarProducto(Producto producto) {
		montoAPagar += producto.getPrecio();
		producto.disminuirStock();
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}
	
	public void registrarPago(Factura factura) {
		
	}
	
}


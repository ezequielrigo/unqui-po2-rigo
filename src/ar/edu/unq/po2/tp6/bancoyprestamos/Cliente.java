package ar.edu.unq.po2.tp6.bancoyprestamos;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double montoPrestado;
	private Banco banco;
	
	
	
	
	public Banco getBanco() {
		return banco;
	}




	public void setBanco(Banco banco) {
		this.banco = banco;
	}




	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual, Banco banco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.banco = banco;
	}




	public String getNombre() {
		return nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public String getDireccion() {
		return direccion;
	}




	public int getEdad() {
		return edad;
	}




	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}


	public double getSueldoNetoAnual() {
		return this.sueldoNetoMensual * 13;
	}
	
	public void solicitarCredito(SolicitudDeCredito solicitud) {
		this.banco.registrarSolicitud(solicitud);
	}
	
	public SolicitudDeCreditoPersonal crearSolicitudPrestamoPersonal(double monto, int plazo) {
		return new SolicitudDeCreditoPersonal(this,monto,plazo);
	}
	
	public SolicitudDeCreditoHipotecario crearSolicitudPrestamoHipotecario(double monto, int plazo, Propiedad propiedad) {
		return new SolicitudDeCreditoHipotecario(this, monto, plazo,propiedad) ;
		
	}

	public void cobrar(double monto) {
		this.montoPrestado += monto;
	}
	
	public void pagarPrestamo(double monto, int plazo) {
		this.banco.cobrar( monto / plazo);
	}
}

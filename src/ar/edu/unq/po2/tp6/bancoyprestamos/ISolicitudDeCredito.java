package ar.edu.unq.po2.tp6.bancoyprestamos;

public interface ISolicitudDeCredito {

	public ISolicitudDeCredito SolicitudDeCredito(Cliente cliente, double monto, int plazo) ;

	abstract public boolean cumpleRequisitos();
	
	public double getMonto();

	public int getPlazo();
	
	public Cliente getCliente(); 
	
	public double getMontoCuotaMensual(); 
}

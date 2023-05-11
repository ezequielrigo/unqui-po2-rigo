package ar.edu.unq.po2.enums;

public enum ColorPiel {
	Rojo("Riesgo Elevado"),Gris("Riesgo Moderado"),Amarillo("Riesgo Leve"),Miel("Sin riesgo");
	
	String descripcion;
	ColorPiel siguienteColor;

	 ColorPiel(String string) {
		this.descripcion = string;
		
	}
	 
	

}

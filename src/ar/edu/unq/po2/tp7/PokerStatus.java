package ar.edu.unq.po2.tp7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PokerStatus {
	
	public boolean verificar(String carta1,String carta2,String carta3,String carta4,String carta5) {
		return this.hayPoker(carta1,carta2,carta3,carta4,carta5) 
				|| this.hayColor(carta1,carta2,carta3,carta4,carta5) 
				|| this.hayTrio(carta1,carta2,carta3,carta4,carta5);
	}

	private boolean hayTrio(String carta1,String carta2,String carta3,String carta4,String carta5) {
		List<String> cartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<String> numeros = cartas.stream().map(e-> this.numeroDeCarta(e)).toList();
		
		return this.sonIgualesN(numeros,2);
	}

	private boolean hayColor(String carta1,String carta2,String carta3,String carta4,String carta5) {
		return false;
	}

	private boolean hayPoker(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> cartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<String> numeros = cartas.stream().map(e-> this.numeroDeCarta(e)).toList();
		
		return this.sonIgualesN(numeros,3);
	}

	private String numeroDeCarta(String e) {

		 if (e.length() == 2)
			{
			 return  e.charAt(0) + "";
			}
			else{
				return e.subSequence(0, 1).toString();
				}
	}
	
	private boolean sonIgualesN(List<String> numeros,int n) {
		int contador = 0;
		String valorActual = "";
		for (String e : numeros) {
			if (e.equals(valorActual)) {
				contador += 1;
			}
			else if (contador ==0) {valorActual = e;}
		}
		return contador ==n;
	}
	

}

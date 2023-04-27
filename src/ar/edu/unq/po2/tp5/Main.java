package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("juan", "pedro", "miguel");
		List<String> lista2 = Arrays.asList("1","1","1","1","2");
		Main main1 = new Main ();
		lista.stream().filter(e -> e.length() > 4).forEach(s -> System.out.println(s));
		boolean bool = main1.sonCuatroIguales(lista2);
		ArrayList<Producto> lista1 = new ArrayList<Producto> ();
	
		lista1.add(new Producto ("milanesa", 80d, 1));
		lista1.add(new Producto ("pure", 50d, 1));
		lista1.add(new Producto ("agua", 70d, 1));
		lista1.add(new Producto ("fideo", 95d, 1));
	
		System.out.println(
				lista1.stream()
				.mapToDouble(p -> p.getPrecio())
				.filter(p-> p>100)
				.sum()
				);
	 
		
		
		System.out.println(bool);
	}
	private boolean sonCuatroIguales(List<String> numeros) {
			int contador = 0;
			String valorActual = "";
			for (String e : numeros) {
				if (e.equals(valorActual)) {
					contador += 1;
					System.out.println("" + contador +" "+ e + "");
				}
				valorActual = e;
			}
			return contador ==3;
		}
	

}

package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("juan", "pedro", "miguel");
		
		lista.stream().filter(e -> e.length() > 4).forEach(s -> System.out.println(s));
		
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
	}
	
	

}

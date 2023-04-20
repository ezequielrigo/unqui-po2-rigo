package ar.edu.unq.po2.tp5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("juan", "pedro", "miguel");
		
		System.out.println( lista.stream().filter(e -> e.length() > 4));

	}

}

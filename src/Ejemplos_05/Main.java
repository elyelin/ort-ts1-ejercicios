package Ejemplos_05;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// TipoEjemplo tipo;

		System.out.println("Doy de alta el array");

		for (int i = 1; i <= 8; i++) {
			System.out.println("Agrego nunmero " + i);
			numeros.add(i);
		}

		System.out.println("Primero objeto del array: " + numeros.get(0));

		numeros.add(1000);
		numeros.add(0, 200);
		numeros.add(5, 300);
		numeros.remove(6);
		numeros.set(7, 400);

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		// tama�o del array .size()
		System.out.println("Tama�o del array: " + numeros.size());
	}

}

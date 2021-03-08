package Ejemplos_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList();

		personas.add(new Persona(25, "Diego"));
		personas.add(new Persona(35, "Juan"));

		int sumaEdades = 0;

		/*
		 * for (int i=0; i<personas.size(); i++) {
		 * System.out.println(personas.get(i)); sumaEdades +=
		 * personas.get(i).getEdad(); }
		 * 
		 * for (int i=0; i<personas.size(); i++) { Persona persona =
		 * personas.get(i); System.out.println(persona); sumaEdades +=
		 * persona.getEdad(); }
		 */

		for (Persona persona : personas) {
			System.out.println(persona);
			sumaEdades += persona.getEdad();
		}

		System.out.println("Promedio de edades: " + sumaEdades / personas.size());

		Scanner input = new Scanner(System.in);
		float numeros[] = new float[5];

		System.out.println("Guardando...");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite un numero: ");
			numeros[i] = input.nextFloat();

		}

		for (float i : numeros) {
			System.out.println("numeros guardados: " + i);
		}

	}

}

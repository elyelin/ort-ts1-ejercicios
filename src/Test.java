package ejemplo_1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList();

		Persona persona1 = new Persona("Diego", "Masculino", 25);
		Persona persona2 = new Persona("Maria", "Femenino", 20);

		System.out.println(persona1.nombre + " " + persona1.getCentimetrosRecorridos());
		System.out.println(persona2.nombre + " " + persona2.getCentimetrosRecorridos());

		// objeto para borrar
		// personas.remove(buscar("Juan");
		for (Persona persona : personas) {
			System.out.println(persona);
		}

	}

}

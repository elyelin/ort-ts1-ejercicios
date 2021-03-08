package Ejercicio_1;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;

	public Agenda() {
		personas = new ArrayList();
	}

	// explicacion de este metodo
	private Persona buscarPersona(String dni) {
		Persona contacto = null;
		int index = 0;
		while (contacto == null && index < this.personas.size()) {
			if (this.personas.get(index).getDni().equals(dni)) {
				contacto = this.personas.get(index);
			}
			index++;
		}
		return contacto;
	}

	//
	public void removerPersona(String dni) {
		this.personas.remove(this.buscarPersona(dni));
		System.out.println("Persona eliminada " + dni);
	}

	public boolean modificarDomicilio(String domicilio, String dni) {
		boolean cambioExitoso = false;
		Persona persona = this.buscarPersona(dni);
		System.out.println("Modificando domicilio de..." + dni);
		if (persona != null) {
			persona.setDireccion(domicilio);
			cambioExitoso = true;
			System.out.println("Modificado");
		} else {
			cambioExitoso = false;
			System.out.println("Dni inexistente");
		}
		return cambioExitoso;
	}

	// explicacion
	public boolean agregarPersona(String nombre, String apellido, String direccion, String dni) {
		boolean registro = false;
		System.out.println("Agregando persona " + nombre);
		if (this.buscarPersona(dni) == null) {
			this.personas.add(new Persona(nombre, apellido, direccion, dni));
			registro = true;
			System.out.println("Persona agregada");
		} else {
			registro = false;
			System.out.println("La persona " + nombre + " ya existe");
		}
		return registro;
	}

	public void listarPersonas() {
		// Persona persona = this.personas.size();

		/*
		 * for (int i = 0; i < personas.size(); i++) { System.out.println((i +
		 * 1) + ". " + personas); }
		 */
		int index = 0;
		for (Persona persona : this.personas) {
			index++;
			System.out.println(index + ". " + persona);
		}

	}

}

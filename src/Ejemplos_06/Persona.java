package Ejemplos_06;

public class Persona {
	private int edad;
	private String nombre;

	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public Persona(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}

}

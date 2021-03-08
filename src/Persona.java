package ejemplo_1;

public class Persona {
	public String nombre;
	public String sexo;
	public int edad;

	public Persona(String nombre, String sexo, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	private int centimetrosRecorridos = 0;

	public void darPaso() {
		int centimetros;

		if (sexo.equals("masculino")) {
			centimetros = 50;
		} else {
			centimetros = 40;
		}
		this.centimetrosRecorridos += centimetros;
	}

	public int getCentimetrosRecorridos() {
		return this.centimetrosRecorridos;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}

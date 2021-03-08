package Ejercicio_2;

public class Departamento {
	private int numeroUnidad;
	private String dni;
	private String nombrePropietario;
	private double deuda;

	public Departamento(int numeroUnidad) {
		this.numeroUnidad = numeroUnidad;
		this.deuda = 0;
	}

	public double actualizarDeuda(double deuda) {
		this.setDeuda(this.getDeuda() + deuda);
		return this.deuda;
	}

	public int getNumeroUnidad() {
		return numeroUnidad;
	}

	private void setNumeroUnidad(int numeroUnidad) {
		this.numeroUnidad = numeroUnidad;
	}

	public String getDni() {
		return dni;
	}

	void setDni(String dni) {
		this.dni = dni;
	}

	private String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	@Override
	public String toString() {
		return "Departamento [numeroUnidad=" + numeroUnidad + ", dni=" + dni + ", nombrePropietario="
				+ nombrePropietario + ", deuda=" + deuda + "]";
	}

}

package Ejercicio_2;

import java.util.ArrayList;

public class Edificio {
	private String direccion;
	private int cantidadDepartamentos;
	private ArrayList<Departamento> departamentos;
	private ArrayList<Departamento> morosos;

	public Edificio(String direccion, int cantidadDepartamentos) {
		departamentos = new ArrayList();
		morosos = new ArrayList();
		this.direccion = direccion;
		this.cantidadDepartamentos = cantidadDepartamentos;
		this.inicializarDepartamentos();
	}

	private void inicializarDepartamentos() {
		for (int i = 0; i < this.getCantidadDepartamentos(); i++) {
			this.departamentos.add(new Departamento(i + 1));
		}
	}

	public void listarUnidades() {
		this.listar(departamentos);
	}

	public void listarMorosos() {
		this.listar(this.morosos);
	}

	public void listar(ArrayList<Departamento> deptos) {
		for (Departamento departamento : deptos) {
			System.out.println(departamento);
		}
	}

	private boolean validarNumeroUnidad(int numeroUnidad) {
		return numeroUnidad > 0 && numeroUnidad <= this.getCantidadDepartamentos();
	}

	private boolean validarUnidadVacia(int numeroUnidad) {
		return this.departamentos.get(numeroUnidad - 1).getDni() == null;
	}

	public void habitarUnidad(int numeroUnidad, String dni, String nombrePropietario) {
		Departamento departamento;
		if (this.validarNumeroUnidad(numeroUnidad) && this.validarUnidadVacia(numeroUnidad)) {
			departamento = this.departamentos.get(numeroUnidad - 1);
			departamento.setDni(dni);
			departamento.setNombrePropietario(nombrePropietario);
		}
	}

	public void agregarDeuda(int numeroUnidad, double deuda) {
		if (this.validarNumeroUnidad(numeroUnidad) && !this.validarUnidadVacia(numeroUnidad) && deuda > 0) {
			Departamento departamento = this.departamentos.get(numeroUnidad - 1);
			if (departamento.actualizarDeuda(deuda) > 0 && !this.validarMorososEnListaMorosos(numeroUnidad)) {
				this.morosos.add(departamento);
			}
		}
	}

	private boolean validarMorososEnListaMorosos(int numeroUnidad) {
		boolean morososExistente = false;
		int index = 0;
		while (!morososExistente && index < this.morosos.size()) {
			// busca en la lista de morosos el numeroUnidad y lo compara con el
			// recibido por parametro o eso creo
			if (this.morosos.get(index).getNumeroUnidad() == numeroUnidad) {
				morososExistente = true;
			}
			index++;
		}
		return morososExistente;
	}

	private Departamento buscarMorosos(int numeroUnidad) {
		Departamento departamento = null;
		int index = 0;
		while (departamento == null && index < this.morosos.size()) {
			if (this.morosos.get(index).getNumeroUnidad() == numeroUnidad) {
				departamento = this.morosos.get(index);
			}
			index++;
		}
		return departamento;
	}

	public void cancelarDeuda(int numeroUnidad, double importe) {
		Departamento departamento = this.buscarMorosos(numeroUnidad);
		if (departamento != null && importe > 0) {
			departamento.actualizarDeuda(importe * -1);
			if (departamento.getDeuda() <= 0) {
				this.morosos.remove(departamento);
			}
		}
	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private int getCantidadDepartamentos() {
		return cantidadDepartamentos;
	}

	private void setCantidadDepartamentos(int cantidadDepartamentos) {
		this.cantidadDepartamentos = cantidadDepartamentos;
	}

}
/*
 * Los vecinos del edificio Alvear Icon deciden hacerse cargo de la
 * administración del mismo. Del edificio sabemos su dirección, la cantidad
 * total de departamentos y los departamentos que lo componen. También lleva una
 * lista con aquellas unidades que poseen deuda (morosos)
 */
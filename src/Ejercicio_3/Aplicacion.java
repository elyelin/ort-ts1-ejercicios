package Ejercicio_3;

import java.util.ArrayList;

public class Aplicacion {
	private static int MAXIMAS_CANCIONES_GRATUITAS = 50;
	private ArrayList<Cancion> canciones;
	private ArrayList<Usuario> usuarios;

	public Aplicacion() {
		this.canciones = new ArrayList<Cancion>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public Cancion buscarCancion(String nombre, String autor) {
		Cancion cancionEncontrada = null;
		int index = 0;
		// este es un buscador que cuando lo encuentra sale
		while (cancionEncontrada == null && index < this.canciones.size()) {
			Cancion cancionAux = this.canciones.get(index);
			if (cancionAux.getNombre().equals(nombre) && cancionAux.getAutor().equals(autor)) {
				cancionEncontrada = cancionAux;
			}
			index++;
		}
		return cancionEncontrada;
	}

	public Usuario buscarUsuario(String email) {
		Usuario usuarioEncontrado = null;
		int index = 0;
		while (usuarioEncontrado == null && index < this.usuarios.size()) {
			if (this.usuarios.get(index).getEmail().equals(email)) {
				usuarioEncontrado = this.usuarios.get(index);
			}
			index++;
		}
		return usuarioEncontrado;
	}

	public boolean altaCancion(String nombre, String autor, String genero, int diasPublicacion) {
		boolean cancionAgregada = false;
		if (this.buscarCancion(nombre, autor) == null) {
			this.canciones.add(new Cancion(nombre, autor, genero, diasPublicacion));
			cancionAgregada = true;
		}
		return cancionAgregada;
	}

	public boolean altaUsuario(String email, String apellido, int edad, CategoriaUsuario categoria) {
		boolean altaExitosa = false;
		if (this.buscarUsuario(email) == null) {
			this.usuarios.add(new Usuario(email, apellido, edad, categoria));
			altaExitosa = true;
		}
		return altaExitosa;
	}

	public Resultado escucharCancion(String email, String nombreCancion, String autor) {
		Resultado resultado = Resultado.CANCION_ESCUCHADA;
		Usuario usuario = this.buscarUsuario(email);
		Cancion cancion = this.buscarCancion(nombreCancion, autor);

		if (usuario == null) {
			resultado = Resultado.USUARIO_INEXISTENTE;
		} else if (cancion == null) {
			resultado = Resultado.CANCION_INEXISTENTE;
		} else if (usuario.getCategoria() == CategoriaUsuario.GRATUITO && usuario.cantidadCancionesEscuchadas() == 50) {
			resultado = Resultado.LIMITE_ALCANZADO;
		} else if (!this.esCancionDisponible(usuario, cancion)) {
			resultado = Resultado.CANCION_NO_DISPONIBLE;
		}

		if (resultado == Resultado.CANCION_ESCUCHADA) {
			cancion.escuchar();
			usuario.escuchar(cancion);
		}
		return resultado;
	}

	public void listarCancionesPorUsuario(String email) {
		Usuario usuario = this.buscarUsuario(email);
		if (usuario != null) {
			usuario.listarCancionesEscuchadas();
			System.out.println("Operacion exitosa");
		} else {
			System.out.println("Usuario inexistente");
		}
	}

	private boolean esCancionDisponible(Usuario usuario, Cancion cancion) {
		boolean esDisponible = true;
		if (usuario.getCategoria() == CategoriaUsuario.PREMIUN) {
			esDisponible = true;
		} else if (!cancion.esGratuita() && usuario.getCategoria() != CategoriaUsuario.PREMIUN) {
			esDisponible = false;
		}
		return esDisponible;
	}

	public void listarCanciones() {
		for (Cancion cancion : this.canciones) {
			System.out.println(cancion);
		}
	}

	public void listarUsuarios() {
		for (Usuario usuario : this.usuarios) {
			System.out.println(usuario);
		}
	}

}

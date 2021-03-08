package Ejercicio_3;

public class Test {

	public static Aplicacion aplicacion;

	public static void testAltaCancion(String nombre, String autor, String genero, int diasPublicacion) {
		System.out.println("Dando de alta cancion nombre: " + nombre + " autor: " + autor + " genero: " + genero
				+ " dias de publicacion: " + diasPublicacion);
		if (aplicacion.altaCancion(nombre, autor, genero, diasPublicacion)) {
			System.out.println("Alta exitosa");
		} else {
			System.out.println("No se pudo dar de alta");
		}
	}

	public static void testAltaUsuario(String email, String apellido, int edad, CategoriaUsuario categoria) {
		System.out.println("Dando de alta usuario email: " + email + " apellido: " + apellido + " edad: " + edad
				+ " categoria: " + categoria);
		if (aplicacion.altaUsuario(email, apellido, edad, categoria)) {

		} else {
			System.out.println("No se pudo dar de alta");
		}
	}

	public static void testEscucharCancion(String email, String nombreCancion, String autor) {
		System.out.println(
				"Escuchar cancion email: " + email + " nombre de la cancion: " + nombreCancion + " autor: " + autor);

		System.out.println(aplicacion.escucharCancion(email, nombreCancion, autor));
	}

	public static void testListarCancionesPorUsuario(String email) {
		System.out.println("Listar canciones de " + email);
		aplicacion.listarCancionesPorUsuario(email);
	}

	public static void main(String[] args) {
		aplicacion = new Aplicacion();

		testAltaCancion("The Wall", "Pink", "Rock", 5000);

		testAltaUsuario("elyelin@jkkfdj.com", "ejijfn", 25, CategoriaUsuario.PREMIUN);

		testEscucharCancion("elyelin@jkkfdj.com", "The Wall", "Pink");
		aplicacion.listarCanciones();
		aplicacion.listarUsuarios();
		testListarCancionesPorUsuario("elyelin@jkkfdj.com");

	}

}

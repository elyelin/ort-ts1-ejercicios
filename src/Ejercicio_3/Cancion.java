package Ejercicio_3;

public class Cancion {
	private String nombre;
	private String autor;
	private String genero;
	private int diasPublicacion;
	private int vecesEscuchadas;

	private static int DIAS_GRATIS = 7;
	private static int ESCUCHAS_GRATIS = 1000;

	public Cancion(String nombre, String autor, String genero, int diasPublicacion) {
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.diasPublicacion = diasPublicacion;
		this.vecesEscuchadas = 0;
	}

	public boolean esGratuita() {
		boolean gratuita = false;
		if (this.diasPublicacion >= DIAS_GRATIS) {
			gratuita = true;
		} else if (this.getReproducciones() >= ESCUCHAS_GRATIS) {
			gratuita = true;
		}
		return gratuita;
	}

	public void escuchar() {
		this.setReproducciones(this.getReproducciones() + 1);
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + autor + ", genero=" + genero + ", diasPublicacion="
				+ diasPublicacion + ", vecesEscuchadas=" + vecesEscuchadas + "]";
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	private String getGenero() {
		return genero;
	}

	private void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDiasPublicacion() {
		return diasPublicacion;
	}

	private void setDiasPublicacion(int diasPublicacion) {
		this.diasPublicacion = diasPublicacion;
	}

	public int getReproducciones() {
		return vecesEscuchadas;
	}

	private void setReproducciones(int reproducciones) {
		this.vecesEscuchadas = reproducciones;
	}

}

package Ejercicio_2;

public class Test {

	public static void main(String[] args) {
		Edificio edificio = new Edificio("Alvear 999", 10);
		edificio.habitarUnidad(3, "9875634", "Diego");
		edificio.agregarDeuda(3, 10);

		edificio.listarUnidades();

	}

}
/*
 * Los vecinos del edificio Alvear Icon deciden hacerse cargo de la
 * administraci�n del mismo. Del edificio sabemos su direcci�n, la cantidad
 * total de departamentos y los departamentos que lo componen. Tambi�n lleva una
 * lista con aquellas unidades que poseen deuda (morosos). Esta lista debe
 * actualizarse (agregar o quitar elementos) cada vez que se actualice alguna
 * deuda. Cada departamento tiene un n�mero de unidad (entre 1 y la cantidad de
 * unidades), dni y nombre del propietario. Se solicita crear en las clases que
 * correspondan, con los par�metros necesarios e interactuando con otros m�todos
 * en caso que se precise (aunque no est�n detallados), los siguientes m�todos:
 */
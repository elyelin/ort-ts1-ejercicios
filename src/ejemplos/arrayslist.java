package ejemplos;

import java.util.ArrayList;

public class arrayslist {

	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> numeros = new ArrayList(); for (int i = 0; i < 10;
		 * i++) { numeros.add(i); } numeros.add(5, 1000); numeros.set(6, 69);
		 * for (int i = 1; i < numeros.size(); i++) {
		 * System.out.println(numeros.get(i)); } System.out.println("tamanio " +
		 * numeros.size());
		 */

		ArrayList<Account> conductores = new ArrayList();
		conductores.add(new Account("Elyelin", "mkdkfdv"));
		conductores.add(new Account("Jose", "4345"));

		for (Account chofer : conductores) {
			System.out.println(chofer);
		}

	}

}

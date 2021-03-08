package TP2;

import java.util.Scanner;

public class Ejercicio_04 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;
		do {
			System.out.println("Ingresa num1: ");
			num1 = input.nextInt();
			input.nextLine();
			System.out.println("Ingresa num2: ");
			num2 = input.nextInt();
			input.nextLine();
			if (num1 > num2) {
				System.out.println("num1 debe ser menor o igual que num2");
			}
		} while (num1 > num2);

		rangoInclusivo(num1, num2);
		rangoExclusivo(num1, num2);

	}

	public static void rangoExclusivo(int num1, int num2) {
		System.out.println("Rango Exlusivo : \n");
		if (num1 == num2) {
			System.out.println(" () \n");
		} else {
			for (int i = (num1 + 1); i < num2; i++) {
				System.out.print(i+",");
			}
			System.out.println("\n");
		}
	}

	public static void rangoInclusivo(int num1, int num2) {
		System.out.println("Rango Inclusivo : \n");
		if (num1 == num2) {
			System.out.println("(" + num1 + "," + num2 + ")");
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i+",");
			}
			System.out.println("\n");
		}
	}
}

/*
 * 4. Realizar un programa en el cual se pida al usuario el ingreso de dos
 * n�meros enteros num1 y num2, cuya relaci�n de valores es que el primero es
 * menor o igual al segundo y mostrar por pantalla la secuencia de n�meros que
 * existe entre ambos: a) Incluy�ndolos; b) Excluy�ndolos. Obs: Validar que el
 * primer n�mero sea menor o igual al segundo. Pedir el ingreso de ambos n�meros
 * las veces que sea necesario hasta que se cumpla dicha condici�n. �Qu� pasar�a
 * si esta validaci�n no la realiz�ramos y el ingreso es incorrecto?
 */
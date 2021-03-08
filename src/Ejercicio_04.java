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
 * números enteros num1 y num2, cuya relación de valores es que el primero es
 * menor o igual al segundo y mostrar por pantalla la secuencia de números que
 * existe entre ambos: a) Incluyéndolos; b) Excluyéndolos. Obs: Validar que el
 * primer número sea menor o igual al segundo. Pedir el ingreso de ambos números
 * las veces que sea necesario hasta que se cumpla dicha condición. ¿Qué pasaría
 * si esta validación no la realizáramos y el ingreso es incorrecto?
 */
package Package;

import java.util.Random;

public class CiclosRepeticionEjercicios {

	public static void main(String[] args) {
		// ejerciciosBasicos();
		ejerciciosIntermedios();
		ejerciciosAvanzados();
	}

	public static void ejerciciosBasicos() {
		int numPar = 0;
		int numComparar = 0;
		int sumaCien = 0;

		System.out.println("\n\t\t\tEjercicios Básicos\t\n");

		System.out.println("1. Usa un for para imprimir los números del 10 al 20\n");
		for (int i = 10; i <= 20; ++i) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n2. Usa un for para imprimir \"Estudiando Java - Día X\" donde X va del 1 al 7\n");
		for (int i = 1; i <= 7; ++i) {
			System.out.println("Estudiando Java - Día" + i);
		}

		System.out.println(
				"\n3. Modifica el ejercicio del taco para que enumere del 5 al 1 (\"Preparando taco #5...\")\n");
		for (int i = 5; i >= 1; --i) {
			System.out.println("Preparando taco #" + i);
		}

		System.out.println("\n4. Imprime los primeros 10 números pares usando for\n");
		int modE = 4 % 2;
		// System.out.println(modE);
		while (numPar < 10) {
			numComparar = ++numComparar;
			if (numComparar % 2 == 0) {
				numPar = ++numPar;
				System.out.println("El #" + numPar + " de los pares es: " + numComparar);
			}
		}
		//
		System.out.println("\n5. Crea un for que sume todos los números del 1 al 100 e imprima el resultado\n");
		for (int i = 0; i <= 100; i++) {
			sumaCien = sumaCien + i;
		}
		System.out.println("La suma de los numeros del 1 al 100 es igual a: " + sumaCien);
		// final
	}

	public static void ejerciciosIntermedios() {
		System.out.println("\n\t\t\tEjercicios Intermedios\t\n");
		boolean llegadaCamion = false;
		boolean cafeSi = true;
		boolean llegoProfe = false;
		int numInfinito = 0;

		// 1. Crea un while que simule esperar el autobús (imprimir "Esperando...")
		// hasta que llegue (variable booleana), pero que llegue después de 15
		// iteraciones

		while (!llegadaCamion) {
			for (int i = 1; i <= 15; i++) {
				System.out.println("Esperando...");
				if (i == 15) {
					llegadaCamion = true;
				}
			}
		}
		System.out.println("\n Ya llegué!!! :)");

		// 2. Usa do-while para preguntar "¿Quieres otro café?" hasta que la respuesta
		// sea "no"
		// (simula con un contador que llegue a 3)

		System.out.println("\nPreguntar \"¿Quieres otro café?\" hasta que la respuesta sea no\n");

		int o = 0;
		do {
			System.out.println("¿Quieres otro café?");
			o = o + 1;
			if (o == 3) {
				System.out.println("Ya no gracias");
				cafeSi = false;
			} else {
				System.out.println("Sí, por favor!");
			}
		} while (cafeSi);

		// 3. Combina while y for: mientras no haya llegado el profesor (boolean),
		// los alumnos siguen haciendo ejercicios (for del 1 al 5)
		System.out.println("\n3. Combina while y for: mientras no haya llegado el profesor\n");
		while (!llegoProfe) {
			for (int i = 0; i < 5; i++) {
				System.out.println("No he llegado");
				System.out.println("Los alumnos siguen haciendo ejercicios");
				if (i == 4) {
					llegoProfe = true;
					System.out.println("Ya llegué");
				}
			}
		}

		// 4. Crea un while infinito que se rompa cuando un número aleatorio sea mayor
		// que 90

		while (numInfinito != 100) {
			numInfinito = (int)(Math.random() * 105);
			System.out.println(numInfinito);
		}
		System.out.println(numInfinito);
	}

	public static void ejerciciosAvanzados() {
		System.out.println("\n\t\t\tEjercicios Avanzados\t\n");

		// 1. Anidación: Imprime tablas de multiplicar del 1 al 5 (1x1=1, 1x2=2...)

		// 2. Usa break para encontrar el primer número divisible entre 7 y 9 entre
		// 1-1000

		// 3. Crea un reloj digital (horas:minutos) usando dos for anidados
		// (para horas 0-23 y minutos 0-59)

		// 4. Simula un buscaminas: matriz 5x5 donde un break sale al encontrar "mina"
		// (número 9)

		// 5. Crea un menú con while + switch-case que permita elegir entre los
		// ejercicios anteriores
	}
}
package Package;

public class ciclosRepetición {
	public static void main(String[] args) {
		nivelBasico();
		nivelIntermedio();
		nivelAvanzado();

	}

	public static void nivelBasico() {

		System.out.println("\n\t\t\tNivel Básico\t\n");
		System.out.println("Preparando taco #1");
		System.out.println("Preparando taco #2\n");
		// ... (y así hasta el 5, ¡qué flojera!)
		for (int i = 1; i <= 5; i++) {
			System.out.println("Preparando taco #" + i);
		}

	}

	public static void nivelIntermedio() {
		System.out.println("\n\t\t\tNivel Intermedio\t\n");

		boolean llegoElCamion = false;
		int i;
		i = 0;
		int tacosProbados = 0;

		while (!llegoElCamion) {
			i = ++i;
			System.out.println(i + " Siguiendo esperando...");
			if (i == 10) {
				llegoElCamion = true;
			}
		}

		do {

			System.out.println("¡Qué rico! Probando taco #" + (++tacosProbados));

		} while (tacosProbados < 3);
		// Aunque sea 1 taco, siempre se ejecuta al menos una vez.
	}

	public static void nivelAvanzado() {
		// Caso anidados
		System.out.println("\n\t\t\tNivel Avanzado\t\n");
		//
		for (int genero = 1; genero <= 3; genero++) {
			for (int artista = 1; artista <= 5; artista++) {
				System.out.println("Reproduciendo canción del género " + genero + ", artista " + artista);
			}
		}
		// Caso BREAK

		for (int item = 1; item <= 10; item++) {
			System.out.println(item);
			if (item == 5) {
				System.out.println("¡Encontré la llave en el bolsillo " + item + "!");
				break; // Sale del ciclo inmediatamente. y ya no lo termina
			}
		}
	}

}
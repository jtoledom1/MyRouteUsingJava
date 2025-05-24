package Mouredev;

import java.util.ArrayList;
import java.util.List;

public class ejerciciosVariables {

	public static void main(String[] args) {

		System.out.println("Ejercicio con variables\n");

		// 1. Crea una variable String con tu nombre y otra con tu apellido, luego
		// concaténalas e imprímelas.
		System.out.println(" Ejercicio 1\n");
		String Nombre = "Diego";
		String Apellido = "Toledo";

		System.out.println(Nombre + " " + Apellido);

		// 2. Declara un Integer con valor 100, divídelo entre 3 e imprime el resultado.
		System.out.println("\n Ejercicio 2\n");
		int valorDiv = 100;
		double valorDivDouble = valorDiv / 3.0;
		System.out.println(valorDivDouble);

		// 3. Crea un Double y un Float con valores decimales distintos, súmalos e
		// imprime el resultado.
		System.out.println("\n Ejercicio 3\n");
		double valorSum1 = 1.0;
		float valorSum2 = 1.31f;

		double valorSum1_2 = valorSum2;
		System.out.println(valorSum1 + valorSum1_2);

		// 4. Declara un Boolean que sea verdadero si 10 es mayor que 5, y falso en caso
		// contrario. Imprime el resultado.
		System.out.println("\n Ejercicio 4\n");
		boolean thisBool = true;
		int numCond = 5;
		if (numCond < 10) {
			System.out.print(thisBool);
		} else {
			thisBool = false;
			System.out.print(thisBool);
		}

		// 5. Crea una Lista (ArrayList) y añádele 3 elementos de diferentes tipos
		// (String, Integer, Double). Imprime la lista.
		System.out.println("\n Ejercicio 5\n");

		List nuevoArray = new ArrayList();
		nuevoArray.add("valorUno");
		nuevoArray.add(2);
		nuevoArray.add(3.1);

		System.out.println(nuevoArray);

		// 6. Modifica el ejercicio 5 para que verifique si la lista está vacía antes de
		// imprimirla.
		System.out.println("\n Ejercicio 6\n");

		int sizeInd = nuevoArray.size();

		if (sizeInd != 0) {
			System.out.print("\n El tamaño del array es de: " + sizeInd + "\n\n Y los valores son: ");
			System.out.println(nuevoArray);
		} else {
			System.out.println("\n Array Vacío\n");
		}

		// 7. Crea una condición que compare si tu edad (como Integer) es mayor o igual
		// a 18 e imprima "Mayor de edad" o "Menor de edad".
		System.out.println("\n Ejercicio 7\n");

		int edadYo = 23;
		if (edadYo >= 18) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("Menor de edad");
		}

		// 8. Intenta sumar un String y un Integer, ¿qué ocurre? Explica el resultado
		// con un comentario.
		System.out.println("\n Ejercicio 8\n");
		String stringSuma = "string";
		System.out.println(edadYo + " " + stringSuma);
		System.out.println("Lo que pasa es que se concatena por eso no tenemos fallo");

		// 9. Declara una variable Integer con valor null y usa un if para evitar un
		// NullPointerException al imprimirla.
		System.out.println("\n Ejercicio 9\n");
		Integer nullPoint = null;

		if (nullPoint != null) {	
			System.out.println(nullPoint);
			System.out.println("El valor es correcto");
		}else {
			System.out.println("El valor es nulo");
		}

		// 10. Crea un programa que tome dos Integers (a y b) e imprima "a es mayor" si
		// a > b, "b es mayor" si b > a, o "iguales" si son iguales.
		System.out.println("\n Ejercicio 10\n");
		Integer intA = 0;
		Integer intB = 1;
		if (intA == intB) {
			System.out.println("iguales");
		}else if(intA > intB) {
			System.out.println("A es mayor");
		}else {
			System.out.println("B es mayor");
		}
		
	}
}
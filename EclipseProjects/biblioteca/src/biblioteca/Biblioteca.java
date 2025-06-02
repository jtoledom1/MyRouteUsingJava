package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/*Esta clase es especial, ya que aquí declaramos el ARRAY
 * y a su vez  la estructura con la que lo vamos a iterar*/

/*Los pasos consisten en:
 * 
 * Declarar el Array dentrop de la clase
 * inicializar el Array desde el constructor de la clase
 * Desde los métodos trabajar con el array, remove, add.
 * 
 * En el for lo usaremos así --> (Variable v : nombreArray)*/

/*Modificadores de acceso:
 * Clase publica
 * Constructor privado
 * Métodos publicos o privados en algunos casos*/

public class Biblioteca {

	private ArrayList<Libro> catalogo;
	
	Scanner scanner = new Scanner(System.in);
	
	/*Constructor*/
	public Biblioteca() {this.catalogo = new ArrayList<Libro>();}

	/*Métodos personalizados*/
	public void agregarLibro(Libro libro) {catalogo.add(libro);}

	public void mostrarCatalogo() {
		for (Libro l : catalogo) {
			System.out.println(l.toString());
		}
	}

	public Libro buscarPorTitulo() {

		System.out.print("Ingrese el Titulo del Libro a buscar: ");
		String nombreBuscado = scanner.nextLine();

		for (Libro l : catalogo) {
			if (l.getTitulo().equalsIgnoreCase(nombreBuscado)) {
				System.out.println("El libro solicitado es: " + l.toString());
				return l;
			}
		}

		System.out.println("Libro no encontrado");
		return null;

	}

	public void prestarLibro() {
		Libro librobuscado = buscarPorTitulo();
		if (librobuscado == null) {
			System.out.println("No se puede prestar el Libro ya que no se encontró");
		}
		if (!librobuscado.isDisponible()) {
			System.out.println("Libro no disponible");
		} else {
			System.out.println("Libro prestado exitosamente");
			librobuscado.setDisponible(false);
		}
	}

	public void devolverLibro() {
		Libro librobuscado = buscarPorTitulo();
		if (librobuscado == null) {
			System.out.println("No se puede devolver el Libro ya que no existe");
		}
		if (librobuscado.isDisponible()) {
			System.out.println("El Libro no ha sido prestado");
		} else {
			System.out.println("Libro devuelto exitosamente");
			librobuscado.setDisponible(true);
		}

	}

}

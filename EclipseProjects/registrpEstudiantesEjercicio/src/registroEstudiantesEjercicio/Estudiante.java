package registroEstudiantesEjercicio;

import java.util.Scanner;

public class Estudiante {
	private String nombre;
	private int edad;
	private double calificacion;
	Scanner scanner = new Scanner(System.in);
	public Estudiante() {

	}

	public Estudiante(String nombre, int edad, double calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public double getCalificacion() {
		return calificacion;
	}

	private void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	private void mostrarResultados() {
		
		System.out.println("\n\n-----------Datos Ingresados-----------\n\n");

		System.out.println("El nombre es: " + getNombre());
		System.out.println("La edad de " + getNombre() + " es de: " + getEdad());
		System.out.println("La calificación de " + getNombre() + " es de: " + getEdad());

	}
	public void pedirDatos() {
		
		boolean bandera = false;
		boolean bandera1 = false;
		
		System.out.print("Ingresa el Nombre del alumno: ");
		setNombre(scanner.nextLine());
//		System.out.print("\n");
		
		while (!bandera) {

			if (!bandera) {
				System.out.print("\nCaptura la calificación: ");
				setCalificacion(scanner.nextDouble());
//				System.out.print("\n");

			}

			if (calificacion < 0.0 || calificacion > 10.0) {
				System.out.print("Error al capturar la información\n");
			} else {
				bandera = true;
			}
		}
		
		while (!bandera1) {
			if (!bandera1) {
				System.out.print("\nCaptura la edad: ");
				setEdad(scanner.nextInt());
//				System.out.print("\n");

			}
			if (edad < 0) {
				System.out.print("Error al capturar la edad\n");
			} else {
				bandera1=true;
			}
		}
		
		mostrarResultados();
	}

}

package biblioteca;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		boolean banderaMenu=false;
		
		while(!banderaMenu) {
			System.out.println("__________Bienvenido al sistema__________");
			System.out.println("Escoge el número de la opción: ");
			System.out.println("1. Crear una biblioteca ");
			System.out.println("2. Agregar varios libros (físicos y digitales)");
			System.out.println("3. Mostrar el catálogo");
			System.out.println("4. Prestar y devolver libros ");
			System.out.println("5. Estado de disponibilidad");
			System.out.println("6. Salir");
			try {
				
				Short opcionMenu =scanner.nextShort();				
				switch (opcionMenu) {
				case 1: {
					System.out.println("___Crear una biblioteca___");
					break;
				}
				case 2: {
					System.out.println("___ Agregar varios libros (físicos y digitales) ___");
					break;
				} 
				case 3: {
					System.out.println("___ Mostrar el catálogo ___");
					break;
				} 
				case 4: {
					System.out.println("___ Prestar y devolver libros ___");
					break;
				} 
				case 5: {
					System.out.println("___Estado de disponibilidad ___");
					break;
				} 
				case 6: {
					System.out.println("___ Salir___");
					banderaMenu =true;
					break;
				} 
				default:
					throw new IllegalArgumentException("Valor fuera del rango: " + opcionMenu);
				}
			} catch (Exception e) {
				System.out.println("Valor fuera del rango");
			}
			
		}
	}
	
}

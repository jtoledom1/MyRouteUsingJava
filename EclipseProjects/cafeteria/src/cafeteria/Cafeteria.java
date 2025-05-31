package cafeteria;

import java.util.ArrayList;
import java.util.Scanner;


public class Cafeteria {

	private ArrayList<Producto> menu;
	Scanner scanner = new Scanner(System.in);
	
	public Cafeteria() {this.menu = new ArrayList<>();}
	
	public void agregarAlMenu(Producto producto) {
		
		menu.add(producto);
	}
	
	public void mostrarMenu() {
		
		System.out.println("    📖 NUESTRO MENÚ");
		System.out.println("--------------------------\n");
		
		for (Producto p : menu) 
		{
			System.out.println("- " + p.toString());
		}

	}
	public void buscarProducto() {
	    System.out.print("Ingrese el nombre del producto a buscar: ");
	    String nombreBuscado = scanner.nextLine();

	    boolean encontrado = false;
	    for (Producto p : menu) {
	        if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
	            System.out.println("🔍 Producto encontrado: " + p.toString());
	            encontrado = true;
	            break;
	        }
	    }

	    if (!encontrado) {
	        System.out.println("❌ Producto no encontrado.");
	    }

	}
}

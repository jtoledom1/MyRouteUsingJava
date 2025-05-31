package cafeteria;

import java.util.ArrayList;


public class Pedido {
	private ArrayList<Producto> items;

	public Pedido() {
		this.items = new ArrayList<>();
	}

	public void agregarProducto(Producto producto) {
		items.add(producto);
	}


	public double calcularTotal() {
		/*Se declara una variable de tipo Producto "p" y va a recorrer el array de items completo*/	
		double precioTotal = 0;
		
		for (Producto p : items) {
			precioTotal += p.getPrecio();
		}
		return precioTotal;
	}

	public void mostrarTotal() {
		
		
		System.out.println("🧾 TU PEDIDO:");
		
		for (Producto p : items) {
	
			System.out.println("- " + p.toString());
			
		}
		
		System.out.println("--------------------------");
		System.out.println("Total: $" + calcularTotal());
	
	}
	
}

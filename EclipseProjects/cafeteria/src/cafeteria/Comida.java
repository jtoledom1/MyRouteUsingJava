package cafeteria;

public class Comida extends Producto {
	
	protected boolean esCaliente;

	public Comida() {
	}

	public Comida(String nombre, double precio, boolean esCaliente) {
		super(nombre, precio);
		this.esCaliente = esCaliente;
	}

	public boolean isEsCaliente() {
		return esCaliente;
	}

	public void setEsCaliente(boolean esCaliente) {
		this.esCaliente = esCaliente;
	}

	@Override
	public String toString() {
		return "Comida [esCaliente=" + esCaliente + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
}

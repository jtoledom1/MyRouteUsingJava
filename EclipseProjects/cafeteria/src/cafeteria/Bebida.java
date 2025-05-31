package cafeteria;

public class Bebida extends Producto {
	protected String tamanio;

	public Bebida() {}

	public Bebida(String nombre, double precio, String tamanio) {
		super(nombre, precio);
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Bebida [tamanio=" + tamanio + ", nombre=" + getNombre() + ", precio=" + getPrecio() + "]";
	}

}

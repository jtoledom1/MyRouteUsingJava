package biblioteca;

public class LibroFisico extends Libro {
	public String codigoBarras;
	
	public LibroFisico() {}
	
	public LibroFisico(String titulo, String autor, int anioPublicacion, boolean disponible, String codigoBarras) {
		super(titulo, autor, anioPublicacion, disponible);
		this.codigoBarras = codigoBarras;
	}


	@Override
	public String toString() {
		return "LibroFisico [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion
				+ ", disponible=" + disponible + ", codigoBarras=" + codigoBarras + "]";
	}
	
}

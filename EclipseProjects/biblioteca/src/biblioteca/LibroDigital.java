package biblioteca;

public class LibroDigital extends Libro {
	public String urlDescarga;
	
	public LibroDigital() {}

	public LibroDigital(String titulo, String autor, int anioPublicacion, boolean disponible, String urlDescarga) {
		super(titulo, autor, anioPublicacion, disponible);
		this.urlDescarga = urlDescarga;
	}


	@Override
	public String toString() {
		return "LibroDigital [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion
				+ ", disponible=" + disponible + ", urlDescarga=" + urlDescarga + "]";
	}

}

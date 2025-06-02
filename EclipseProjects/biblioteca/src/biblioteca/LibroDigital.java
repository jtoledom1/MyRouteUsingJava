package biblioteca;

public class LibroDigital extends Libro {
	public String urlDescarga;

	@Override
	public String toString() {
		return "LibroDigital [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion
				+ ", disponible=" + disponible + ", urlDescarga=" + urlDescarga + "]";
	}

}

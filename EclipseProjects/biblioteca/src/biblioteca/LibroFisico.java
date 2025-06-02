package biblioteca;

public class LibroFisico extends Libro {
	public String codigoBarras;

	@Override
	public String toString() {
		return "LibroFisico [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion
				+ ", disponible=" + disponible + ", codigoBarras=" + codigoBarras + "]";
	}
	
}

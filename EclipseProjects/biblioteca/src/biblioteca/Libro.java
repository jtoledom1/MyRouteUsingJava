package biblioteca;

public abstract class Libro {
	
	/*---------- Atributos ----------*/

	protected String titulo;
	protected String autor;
	protected int anioPublicacion;
	protected boolean disponible;
	
	/*---------- Constructor ----------*/
	
	public Libro() {}	
	
	public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.disponible = disponible;
	}
	

	/*---------- Métodos abstractos ----------*/
	@Override
	public abstract String toString();
	

	/*---------- Métodos personalizados ----------*/
	protected void prestar() {setDisponible(false);}
	protected void devolver() {setDisponible(true);}

	/*---------- Getters ----------*/
	protected String getTitulo() {return titulo;}
	protected String getAutor() {return autor;}
	protected int getAnioPublicacion() {return anioPublicacion;}
	protected boolean isDisponible() {return disponible;}

	/*---------- Setters ----------*/
	protected  void setTitulo(String titulo) {this.titulo = titulo;}
	protected void setAutor(String autor) {this.autor = autor;}
	protected void setAnioPublicacion(int anioPublicacion) {this.anioPublicacion = anioPublicacion;}
	protected void setDisponible(boolean disponible) {this.disponible = disponible;}
	

}

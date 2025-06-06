package adopcionMascotas;

public abstract class Mascota {
	
	/*Atributos*/
	protected String nombre;
	protected String especie;
	protected int edad;
	protected boolean adoptado=false;
	
	/*Constructores*/
	protected Mascota() {}

	protected Mascota(String nombre, String especie, int edad, boolean adoptado) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.adoptado = adoptado;
	}

	/*Métodos abstractos*/
	
	
	@Override
	public abstract String toString();
	
	
	/*Getters*/

	public String getNombre() {
		return nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isAdoptado() {
		return adoptado;
	}

	
	/*Setters*/

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	
	
	/*Métodos personalizados*/
	
	protected void marcarComoAdoptado() {
		try {
			setAdoptado(true);			
			System.out.println("Adoptado exitosamente");
		} catch (Exception e) {
			System.out.println("Ya estaba adoptado el nene");
		}
	}
	
	
}

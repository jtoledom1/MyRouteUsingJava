package logica;

public class Alumno {
	int id;
	String nombre;					/*Variables globales*/
	String apellido;
	
	 
	/*Constructores*/
	public Alumno(int id, String nombre, String apellido) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;		/*Variables locales*/
	}

	public Alumno() {
		
	}
	/*Métodos*/
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/*Métodos personalizados*/
	public void mostrarNombre() { /* Void indica procedimiento */
		System.out.println("Hola, soy un alumno y se decir mi nombre");
	}
	

	public void saberAprobado(double calificacion) {
		if (calificacion >= 6) {
			System.out.println("Aprobé la materia");
		}else {
			System.out.println("Uyy noooo, REPROBÉ");
			
		}
	}
	
}

package herencia;

public class Consultor extends Persona{
	String nombre_Consultora;
	int num_consultor;
	
	public Consultor() {

	}

	public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
			String nombre_Consultora, int num_consultor) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.nombre_Consultora = nombre_Consultora;
		this.num_consultor = num_consultor;
	}

	public String getNombre_Consultora() {
		return nombre_Consultora;
	}

	public void setNombre_Consultora(String nombre_Consultora) {
		this.nombre_Consultora = nombre_Consultora;
	}

	public int getNum_consultor() {
		return num_consultor;
	}

	public void setNum_consultor(int num_consultor) {
		this.num_consultor = num_consultor;
	}
	
	

}

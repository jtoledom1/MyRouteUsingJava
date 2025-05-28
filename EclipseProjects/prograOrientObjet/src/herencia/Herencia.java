package herencia;

public class Herencia {

	public static void main(String[] args) {
		
		Empleado emple1 = new Empleado();
		
		emple1.getNum_legajo();
		emple1.getNombre();
		
		Consultor consul = new Consultor();
		
		consul.getNombre_Consultora();
		consul.getApellido();
		
		Persona vector [] = new Persona[5];
		vector [0] = new Persona();
		vector [0] = new Empleado();
		vector [0] = new Consultor();
		  
		Persona perso = new Persona();
		Consultor consu = new Consultor();
		
		perso = consu;
		// consu = perso; 		/*Estaa línea daría error porque el superclass es Persona*/
		System.out.println();
		
	}

}

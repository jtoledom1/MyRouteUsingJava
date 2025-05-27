package logica;

public class Poo {
	public static void main(String[] args) {
		Alumno alu1 = new Alumno(); 											/* CTOR vacío */
		Alumno alu2 = new Alumno(5, "Diego", "Toledin"); 		/* CTOR Con parámetros */

		System.out.println("La id del alumno 2 es: " + alu2.getId());
		System.out.println("El nombre  del alumno 2 es: " + alu2.getNombre());
		System.out.println("El Apellido  del alumno 2 es: " + alu2.getApellido());

		alu1.setId(8);
		alu1.setNombre("Papo");
		alu1.setApellido("Gutierrez");

		System.out.println("La id del alumno 2 es: " + alu1.getId());
		System.out.println("El nombre  del alumno 2 es: " + alu1.getNombre());
		System.out.println("El Apellido  del alumno 2 es: " + alu1.getApellido());
	
		alu1.setId(2);
		alu1.setNombre("Pedrito");
		alu1.setApellido("Sola");

		System.out.println("La id del alumno 2 es: " + alu1.getId());
		System.out.println("El nombre  del alumno 2 es: " + alu1.getNombre());
		System.out.println("El Apellido  del alumno 2 es: " + alu1.getApellido());

	}

}

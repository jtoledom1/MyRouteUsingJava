package adopcionMascotas;

import java.util.ArrayList;

public class Refugio extends Mascota {
	private ArrayList<Mascota> mascotas;

	public Refugio() {this.mascotas = new ArrayList<Mascota>();}

	public Refugio(String nombre, String especie, int edad, boolean adoptado, ArrayList<Mascota> mascotas) {
		super(nombre, especie, edad, adoptado);
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Refugio [mascotas=" + mascotas + ", nombre=" + nombre + ", especie=" + especie + ", edad=" + edad
				+ ", adoptado=" + adoptado + "]";
	}
	
	public void agregarMascota(Mascota m) {
		mascotas.add(m);
	}
	
	public void listarMascotasDisponibles() {
		for (Mascota m : mascotas) {
			if (m.adoptado==false) {				
				System.out.println(toString());
			}
		}
	}
	
	/*Aquí al llamarlo le debes poner el nombre que estás buscando*/
	public Mascota buscarPorNombre(String nombre) {					
		for (Mascota m: mascotas) {
			if (m.nombre.equalsIgnoreCase(nombre)) {
				System.out.println("La mascota que buscas es: "+ m.toString());
				return m; 
			}
		}
		System.out.println("La mascota no fue encontrada");
		return null;
	}
	
	public void adoptarMascota(String nombre) {
		
		Mascota m = buscarPorNombre(nombre);
		
		if (m !=null) {
			m.setAdoptado(true);
			System.out.println("Has adoptado exitosamente a: "+m.getNombre());
		}else {
	        System.out.println("No se puede adoptar. La mascota no fue encontrada.");
	    }
	}
	
}

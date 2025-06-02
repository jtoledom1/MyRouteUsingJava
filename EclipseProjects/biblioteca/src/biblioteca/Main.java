package biblioteca;

//import java.util.Scanner;

public class Main {
	
//	private static Scanner scanner;

	public static void main(String[] args) {
//		scanner = new Scanner(System.in);
//		boolean banderaMenu=false;
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarLibro(new LibroDigital("Las aventuras de willy rex digital","Staxx",2012,true,"https://WillyStaxx.com"));
		biblioteca.agregarLibro(new LibroFisico("Las aventuras de willy rex","Staxx",2012,true,"1477888"));
		biblioteca.agregarLibro(new LibroFisico("Tango amarillo","Jimenz O.",2023,true,"1477888"));
		biblioteca.agregarLibro(new LibroDigital("Tango amarillo digital","Jimenz O.",2023,true,"https://Tango.com"));
		biblioteca.mostrarCatalogo();
		biblioteca.prestarLibro();
		biblioteca.devolverLibro();
	}
	
}

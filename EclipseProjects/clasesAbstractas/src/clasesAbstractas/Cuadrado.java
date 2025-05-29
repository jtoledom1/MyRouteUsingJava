package clasesAbstractas;

public class Cuadrado extends Figura{
	private double lado;
	
	
	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
	}


	@Override
	public double calcularArea() {
		double resultado = lado *lado;
		System.out.println("ss");
		return resultado;
	}
	
}

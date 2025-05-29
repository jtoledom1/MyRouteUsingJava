package clasesAbstractas;

public class Circulo extends Figura{

	private double redio;
	
	public Circulo() {

	}
	
	public Circulo(double x, double y, double redio) {
		super(x, y);
		this.redio = redio;
	}

	@Override
	public double calcularArea() {
		double pi=3.14;
		double resultado= pi * redio *redio;
		
		return resultado;
	}
	

}

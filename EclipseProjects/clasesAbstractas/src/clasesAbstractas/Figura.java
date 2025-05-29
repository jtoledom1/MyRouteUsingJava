package clasesAbstractas;

public abstract class Figura {
	protected double x;
	protected double y;

	protected  Figura() {
	}

	protected Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public abstract double calcularArea();

}

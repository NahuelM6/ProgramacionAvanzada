package bobconstruyeABML;

public class Apartamento extends Edificio {
	private int numeroapartamento;
	private double alquiler;

	public Apartamento(int pisos, String direccion, int cantidadascensores, int numeroapartamento, double alquiler) {
		super(pisos, direccion, cantidadascensores);
		this.numeroapartamento = numeroapartamento;
		this.alquiler = alquiler;
	}

	public int getNumeroapartamento() {
		return numeroapartamento;
	}

	public void setNumeroapartamento(int numeroapartamento) {
		this.numeroapartamento = numeroapartamento;
	}

	public double getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(double alquiler) {
		this.alquiler = alquiler;
	}

}

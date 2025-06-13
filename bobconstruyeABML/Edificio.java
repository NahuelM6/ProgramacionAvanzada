package bobconstruyeABML;

public class Edificio {
	private int pisos;
	private String direccion;
	private int cantidadascensores;

	public Edificio(int pisos, String direccion, int cantidadascensores) {
		super();
		this.pisos = pisos;
		this.direccion = direccion;
		this.cantidadascensores = cantidadascensores;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadascensores() {
		return cantidadascensores;
	}

	public void setCantidadascensores(int cantidadascensores) {
		this.cantidadascensores = cantidadascensores;
	}

}

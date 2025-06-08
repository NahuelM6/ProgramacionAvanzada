package bobconstruye;

public class Casa extends Edificio {
	private int numerochimeneas;
	private int areadeterreno;

	public Casa(int pisos, String direccion, int cantidadascensores, int numerochimeneas, int areadeterreno) {
		super(pisos, direccion, cantidadascensores);
		this.numerochimeneas = numerochimeneas;
		this.areadeterreno = areadeterreno;
	}

	public int getNumerochimeneas() {
		return numerochimeneas;
	}

	public void setNumerochimeneas(int numerochimeneas) {
		this.numerochimeneas = numerochimeneas;
	}

	public int getAreadeterreno() {
		return areadeterreno;
	}

	public void setAreadeterreno(int areadeterreno) {
		this.areadeterreno = areadeterreno;
	}

}

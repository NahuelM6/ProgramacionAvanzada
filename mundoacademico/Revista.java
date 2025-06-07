package mundoacademico;

public class Revista extends Publicación {

	private String periodicidad;
	private String tematica;
	private String paisdeorigen;

	public Revista(String titulo, String fechapublicacion, int páginas, String autor, String periodicidad, String tematica, String paisdeorigen) {
		super(titulo, fechapublicacion, páginas, autor);
		this.periodicidad = periodicidad;
		this.tematica = tematica;
		this.paisdeorigen = paisdeorigen;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getPaisdeorigen() {
		return paisdeorigen;
	}

	public void setPaisdeorigen(String paisdeorigen) {
		this.paisdeorigen = paisdeorigen;
	}

}

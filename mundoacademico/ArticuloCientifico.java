package mundoacademico;

public class ArticuloCientifico extends Publicación {

	private String areacientifica;
	private String resumen;

	public ArticuloCientifico(String titulo, String fechapublicacion, int páginas, String autor, String areacientifica, String resumen) {
		super(titulo, fechapublicacion, páginas, autor);
		this.areacientifica = areacientifica;
		this.resumen = resumen;
	}

	public String getAreacientifica() {
		return areacientifica;
	}

	public void setAreacientifica(String areacientifica) {
		this.areacientifica = areacientifica;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
}

package mundoacademico;

public class Publicación {

	private String titulo;
	private String fechapublicacion;
	private int páginas;
	private String autor;

	public Publicación(String titulo, String fechapublicacion, int páginas, String autor) {
		super();
		this.titulo = titulo;
		this.fechapublicacion = fechapublicacion;
		this.páginas = páginas;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechapublicacion() {
		return fechapublicacion;
	}

	public void setFechapublicacion(String fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}

	public int getPáginas() {
		return páginas;
	}

	public void setPáginas(int páginas) {
		this.páginas = páginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}

package terceraimplementacion;

public class Libro {
	
	private String ISBN;
	private String autor;
	private String titulo;
	
	public Libro(String iSBN, String autor, String titulo) {
		super();
		ISBN = iSBN;
		this.autor = autor;
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return this.getISBN() + "" + this.getAutor() + "" + this.getTitulo();
	}
}

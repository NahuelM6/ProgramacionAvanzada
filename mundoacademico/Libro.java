package mundoacademico;

public class Libro extends Publicación {

	private int ISBN;
	private String edicion;

	public Libro(String titulo, String fechapublicacion, int páginas, String autor, int iSBN, String edicion) {
		super(titulo, fechapublicacion, páginas, autor);
		ISBN = iSBN;
		this.edicion = edicion;

	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

}

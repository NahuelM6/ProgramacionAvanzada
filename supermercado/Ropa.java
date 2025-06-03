package supermercado;

public class Ropa extends Producto {
	
	private String tela;
	private String talla;
	
	public Ropa(String nombre, int iD, double precio, String fabricante, String tela, String talla) {
		super(nombre, iD, precio, fabricante);
		this.tela = tela;
		this.talla = talla;
	}
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	
	
}

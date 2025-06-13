package supermercadoABML;

public class Producto {
	
	private String nombre;
	private int ID;
	private double precio;
	private String fabricante;
	
	public Producto(String nombre, int iD, double precio, String fabricante) {
		super();
		this.nombre = nombre;
		this.ID = iD;
		this.precio = precio;
		this.fabricante = fabricante;
}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}

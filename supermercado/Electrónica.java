package supermercado;

public class Electrónica extends Producto{
	
	private int voltios;
	private String tipo;
	
	public Electrónica(String nombre, int iD, double precio, String fabricante, int voltios, String tipo) {
		super(nombre, iD, precio, fabricante);
		this.voltios = voltios;
		this.tipo = tipo;
	}
	public int getVoltios() {
		return voltios;
	}
	public void setVoltios(int voltios) {
		this.voltios = voltios;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

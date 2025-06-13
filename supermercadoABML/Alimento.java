package supermercadoABML;

public class Alimento extends Producto{
	
	private String vencimiento;
	private double pesoneto;
	
	public Alimento(String nombre, int iD, double precio, String fabricante, String vencimiento, double pesoneto) {
		super(nombre, iD, precio, fabricante);
		this.vencimiento = vencimiento;
		this.pesoneto = pesoneto;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	public double getPesoneto() {
		return pesoneto;
	}
	public void setPesoneto(double pesoneto) {
		this.pesoneto = pesoneto;
	}
}

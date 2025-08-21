package terceraimplementacion;

import java.util.ArrayList;


public class Logica {
	
	ArrayList<Libro> arreglo = new ArrayList<>();
	boolean validacion = false;
	
	public static void main(String[] args) {
		
		Presentación ventana = new Presentación();
		ventana.setVisible(true);	
		
	}
	
	
public String listarlibros() {
	
	System.out.println("ISBN " + arreglo.get(0).getISBN() + " Autor " + arreglo.get(0).getAutor() + " Titulo " + arreglo.get(0).getAutor());
	
	return null;
	
}
	
public boolean guardarlibro(String isbn, String autor, String titulo) {
		
		boolean resultado = false;
		
		
		if(arreglo.add(new Libro(isbn, autor, titulo))) {
			System.out.println("Llegaron");
			resultado = true;
			validacion = true;
		}
		
		return resultado;
		
	}

public boolean isValidacion() {
	return validacion;
}


public void setValidacion(boolean validacion) {
	this.validacion = validacion;
}
	
	
}

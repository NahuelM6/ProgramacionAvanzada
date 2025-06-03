package supermercado;
import java.util.*;
public class Gestor {

	public static void main(String[] args) {
		
		int opcion;
		
		Scanner Usuario = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto");
		System.out.print("> ");
		String nombre = Usuario.next();
		System.out.println("Ingrese una ID para su producto (solo números)");
		System.out.print("> ");
		int ID = Usuario.nextInt();
		System.out.println("Ingrese el precio de su producto (con comas Ej: 200,00)");
		System.out.print("> ");
		double precio = Usuario.nextDouble();
		System.out.println("Ingrese la empresa fabricante del producto");
		System.out.print("> ");
		String fabricante = Usuario.next();
		
		System.out.println("");
		System.out.println("Elija una opción de las siguientes");
		System.out.println("Su producto es...");
		System.out.println("1 - Ropa");
		System.out.println("2 - Alimento");
		System.out.println("3 - Electrónica");
		System.out.print("> ");
		opcion = Usuario.nextInt();
		
		switch (opcion) {
		
		case 1: 
			
			System.out.println("");
			System.out.println("Ingrese de que tela está hecho su producto");
			System.out.print("> ");
			String tela = Usuario.next();
			System.out.println("Ingrese la talla de su producto");
			System.out.print("> ");
			String talla = Usuario.next();
			Ropa ro1 = new Ropa(nombre, ID, precio, fabricante, tela, talla);
			ro1.setNombre(nombre);
			ro1.setID(ID);
			ro1.setPrecio(precio);
			ro1.setFabricante(fabricante);
			ro1.setTela(tela);
			ro1.setTalla(talla);
			
			System.out.println("");
			System.out.println("Detalles del Producto:");
			System.out.println("Nombre: "+ro1.getNombre());
			System.out.println("ID: "+ro1.getID());
			System.out.println("Precio: "+ro1.getPrecio());
			System.out.println("Fabricante: "+ro1.getFabricante());
			System.out.println("Tela: "+ro1.getTela());
			System.out.println("Talla: "+ro1.getTalla());
			
			break;
			
		case 2:
			
			System.out.println("");
			System.out.println("Ingrese la fecha de vencimiento de su producto");
			System.out.print("> ");
			String vencimiento = Usuario.next();
			System.out.println("Ingrese el peso neto de su producto");
			System.out.print("> ");
			double pesoneto = Usuario.nextDouble();
			Alimento al1 = new Alimento(nombre, ID, precio, fabricante, vencimiento, pesoneto);
			al1.setNombre(nombre);
			al1.setID(ID);
			al1.setPrecio(precio);
			al1.setFabricante(fabricante);
			al1.setVencimiento(vencimiento);
			al1.setPesoneto(pesoneto);
			
			System.out.println("");
			System.out.println("Detalles del Producto:");
			System.out.println("Nombre: "+al1.getNombre());
			System.out.println("ID: "+al1.getID());
			System.out.println("Precio: "+al1.getPrecio());
			System.out.println("Fabricante: "+al1.getFabricante());
			System.out.println("Vencimiento: "+al1.getVencimiento());
			System.out.println("Peso neto: "+al1.getPesoneto());
			
			break;
			
		case 3:
			
			System.out.println("");
			System.out.println("Ingrese la cantidad de voltios de su producto");
			System.out.print("> ");
			int voltios = Usuario.nextInt();
			System.out.println("Ingrese el tipo de su electrodomestico");
			System.out.print("> ");
			String tipo = Usuario.next();
			Electrónica el1 = new Electrónica(nombre, ID, precio, fabricante, voltios, tipo);
			el1.setNombre(nombre);
			el1.setID(ID);
			el1.setPrecio(precio);
			el1.setFabricante(fabricante);
			el1.setVoltios(voltios);
			el1.setTipo(tipo);
			
			System.out.println("");
			System.out.println("Detalles del Producto:");
			System.out.println("Nombre: "+el1.getNombre());
			System.out.println("ID: "+el1.getID());
			System.out.println("Precio: "+el1.getPrecio());
			System.out.println("Fabricante: "+el1.getFabricante());
			System.out.println("Voltios: "+el1.getVoltios());
			System.out.println("Tipo: "+el1.getTipo());
			
			break;
		}
		
	}
}

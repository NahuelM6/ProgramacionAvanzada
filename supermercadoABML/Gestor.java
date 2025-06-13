package supermercadoABML;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {

		int opcion;
		Ropa[] arropa = new Ropa[10];
		Alimento[] aralimento = new Alimento[10];
		Electrónica[] arelectronica = new Electrónica[10];
		Scanner Usuario = new Scanner(System.in);

		do {
			System.out.println("");
			System.out.println("Elija una opción de las siguientes");
			System.out.println("Su producto es...");
			System.out.println("1 - Ropa");
			System.out.println("2 - Alimento");
			System.out.println("3 - Electrónica");
			System.out.println("4 - Salir");
			System.out.print("> ");
			opcion = Usuario.nextInt();

			switch (opcion) {

			case 1:
				gestionRopa(arropa, Usuario);
				break;

			case 2:
				gestionAlimento(aralimento, Usuario);
				break;

			case 3:
				gestionElectronica(arelectronica, Usuario);
				break;
			case 4:
				System.out.println("");
				System.out.println("Bye bye");
			default:
				System.out.println("");
				System.out.println("Porfavor, ingrese una opción válida");
				System.out.println("");
			}
		} while (opcion != 4);

	}

	public static void gestionRopa(Ropa[] arropa, Scanner Usuario) {

		int opciongR;

		System.out.println("");
		System.out.println("Elija una opción: ");
		System.out.println("1 - Agregar");
		System.out.println("2 - Eliminar");
		System.out.println("3 - Modificar");
		System.out.println("4 - Listar");
		System.out.print("> ");
		opciongR = Usuario.nextInt();

		switch (opciongR) {

		case 1:
			System.out.println("");
			System.out.println("Ingrese el nombre de su producto");
			System.out.print("> ");
			String nombre = Usuario.next();
			System.out.println("Ingrese la ID de su producto");
			System.out.print("> ");
			int ID = Usuario.nextInt();
			System.out.println("Ingrese el precio de su producto (con comas, ej: 200.00)");
			System.out.print("> ");
			double precio = Usuario.nextDouble();
			System.out.println("Ingrese el nombre del fabricante del producto");
			System.out.print("> ");
			String fabricante = Usuario.next();
			System.out.println("Ingresa la tela con la que está hecho");
			System.out.print("> ");
			String tela = Usuario.next();
			System.out.println("Ingresa la talla de su producto");
			System.out.print("> ");
			String talla = Usuario.next();

			for (int i = 0; i < arropa.length; i++) {
				if (arropa[i] == null) {
					arropa[i] = new Ropa(nombre, ID, precio, fabricante, tela, talla);
					break;
				}
			}
			break;
		case 2:
			int eliminarR;
			System.out.println("Escriba la ID de la ropa a eliminar: ");
			System.out.println("Ropas: ");
			for (int i = 0; i < arropa.length; i++) {
				if (arropa[i] != null) {
					System.out.print("Ropa N°" + i + " Nombre: " + arropa[i].getNombre());
					System.out.print(" ID: " + arropa[i].getID());
					System.out.print(" Precio: " + arropa[i].getPrecio());
					System.out.print(" Fabricante: " + arropa[i].getFabricante());
					System.out.println(" Tela: " + arropa[i].getTela());
					System.out.println(" Talla: " + arropa[i].getTalla());
				} else {
					System.out.println("En la posición N°" + i + " no hay ropa registrada");
				}
			}
			eliminarR = Usuario.nextInt();

			for (int i = 0; i < arropa.length; i++) {
				if (arropa[i].getID() == eliminarR && arropa[i] != null) {
					arropa[i] = null;
					System.out.println("Eliminado");
					break;
				} else {

				}
			}
			break;
		case 3:
			int nuevaID;
			int modificar;
			System.out.println("Lista Ropas: ");
			for (int i = 0; i < arropa.length; i++) {
				if (arropa[i] != null) {
					System.out.print("Ropa N°" + i + " Nombre: " + arropa[i].getNombre());
					System.out.print(" ID: " + arropa[i].getID());
					System.out.print(" Precio: " + arropa[i].getPrecio());
					System.out.print(" Fabricante: " + arropa[i].getFabricante());
					System.out.println(" Tela: " + arropa[i].getTela());
					System.out.println(" Talla: " + arropa[i].getTalla());
				} else {
					System.out.println("En la posición N°" + i + " no hay ropa registrada");
				}
			}
			System.out.println("");
			System.out.println("Ingrese la ID de la ropa a modificar");
			System.out.print("> ");
			modificar = Usuario.nextInt();

			for (int i = 0; i < arropa.length; i++) {
				if (arropa[i].getID() == modificar && arropa[i] != null) {
					System.out.println("Ingrese la nueva ID:");
					nuevaID = Usuario.nextInt();
					arropa[i].setID(nuevaID);
					System.out.println("ID modificada con éxito");
					break;
				} else {
					System.out.println("La ropa no existe");
				}
			}
			break;
		case 4:
			System.out.println("");
			System.out.println("Lista de Ropas: ");
			for (int i = 0; i < arropa.length; i++) {
				if (arropa[i] != null) {
					System.out.print("Ropa N°" + i + " Nombre: " + arropa[i].getNombre());
					System.out.print(" ID: " + arropa[i].getID());
					System.out.print(" Precio: " + arropa[i].getPrecio());
					System.out.print(" Fabricante: " + arropa[i].getFabricante());
					System.out.println(" Tela: " + arropa[i].getTela());
					System.out.println(" Talla: " + arropa[i].getTalla());
				} else {
					System.out.println("En la posición N°" + i + " no hay ropa registrada");
				}
			}
		}
	}
	
	public static void gestionAlimento(Alimento[] aralimento, Scanner Usuario) {
		int opciongA;

		System.out.println("");
		System.out.println("Elija una opción: ");
		System.out.println("1 - Agregar");
		System.out.println("2 - Eliminar");
		System.out.println("3 - Modificar");
		System.out.println("4 - Listar");
		System.out.print("> ");
		opciongA = Usuario.nextInt();

		switch (opciongA) {

		case 1:
			System.out.println("");
			System.out.println("Ingrese el nombre de su producto");
			System.out.print("> ");
			String nombre = Usuario.next();
			System.out.println("Ingrese la ID de su producto");
			System.out.print("> ");
			int ID = Usuario.nextInt();
			System.out.println("Ingrese el precio de su producto (con comas, ej: 200.00)");
			System.out.print("> ");
			double precio = Usuario.nextDouble();
			System.out.println("Ingrese el nombre del fabricante del producto");
			System.out.print("> ");
			String fabricante = Usuario.next();
			System.out.println("Ingresa la fecha de vencimiento de su producto");
			System.out.print("> ");
			String vencimiento = Usuario.next();
			System.out.println("Ingresa el peso neto de su producto");
			System.out.print("> ");
			double pesoneto = Usuario.nextDouble();

			for (int i = 0; i < aralimento.length; i++) {
				if (aralimento[i] == null) {
					aralimento[i] = new Alimento(nombre, ID, precio, fabricante, vencimiento, pesoneto);
					break;
				}
			}
			break;
		case 2:
			int eliminarA;
			System.out.println("Escriba la ID del alimento a eliminar: ");
			System.out.println("Alimentos: ");
			for (int i = 0; i < aralimento.length; i++) {
				if (aralimento[i] != null) {
					System.out.print("Alimento N°" + i + " Nombre: " + aralimento[i].getNombre());
					System.out.print(" ID: " + aralimento[i].getID());
					System.out.print(" Precio: " + aralimento[i].getPrecio());
					System.out.print(" Fabricante: " + aralimento[i].getFabricante());
					System.out.println(" Vencimiento: " + aralimento[i].getVencimiento());
					System.out.println(" Peso neto: " + aralimento[i].getPesoneto());
				} else {
					System.out.println("En la posición N°" + i + " no hay alimentos registrados");
				}
			}
			eliminarA = Usuario.nextInt();

			for (int i = 0; i < aralimento.length; i++) {
				if (aralimento[i].getID() == eliminarA && aralimento[i] != null) {
					aralimento[i] = null;
					System.out.println("Eliminado");
					break;
				} else {

				}
			}
			break;
		case 3:
			int nuevaID;
			int modificar;
			System.out.println("Lista Alimentos: ");
			for (int i = 0; i < aralimento.length; i++) {
				if (aralimento[i] != null) {
					System.out.print("Alimento N°" + i + " Nombre: " + aralimento[i].getNombre());
					System.out.print(" ID: " + aralimento[i].getID());
					System.out.print(" Precio: " + aralimento[i].getPrecio());
					System.out.print(" Fabricante: " + aralimento[i].getFabricante());
					System.out.println(" Vencimiento: " + aralimento[i].getVencimiento());
					System.out.println(" Peso neto: " + aralimento[i].getPesoneto());
				} else {
					System.out.println("En la posición N°" + i + " no hay alimentos registrados");
				}
			}
			System.out.println("");
			System.out.println("Ingrese la ID del alimento a modificar");
			System.out.print("> ");
			modificar = Usuario.nextInt();

			for (int i = 0; i < aralimento.length; i++) {
				if (aralimento[i].getID() == modificar && aralimento[i] != null) {
					System.out.println("Ingrese la nueva ID:");
					nuevaID = Usuario.nextInt();
					aralimento[i].setID(nuevaID);
					System.out.println("ID modificada con éxito");
					break;
				} else {
					System.out.println("El alimento no existe");
				}
			}
			break;
		case 4:
			System.out.println("");
			System.out.println("Lista de Alimentos: ");
			for (int i = 0; i < aralimento.length; i++) {
				if (aralimento[i] != null) {
					System.out.print("Alimento N°" + i + " Nombre: " + aralimento[i].getNombre());
					System.out.print(" ID: " + aralimento[i].getID());
					System.out.print(" Precio: " + aralimento[i].getPrecio());
					System.out.print(" Fabricante: " + aralimento[i].getFabricante());
					System.out.println(" Vencimiento: " + aralimento[i].getVencimiento());
					System.out.println(" Peso neto: " + aralimento[i].getPesoneto());
				} else {
					System.out.println("En la posición N°" + i + " no hay alimentos registrados");
				}
			}
		}
	}
	
	public static void gestionElectronica(Electrónica[] arelectronica, Scanner Usuario) {
		int opciongE;

		System.out.println("");
		System.out.println("Elija una opción: ");
		System.out.println("1 - Agregar");
		System.out.println("2 - Eliminar");
		System.out.println("3 - Modificar");
		System.out.println("4 - Listar");
		System.out.print("> ");
		opciongE = Usuario.nextInt();

		switch (opciongE) {

		case 1:
			System.out.println("");
			System.out.println("Ingrese el nombre de su producto");
			System.out.print("> ");
			String nombre = Usuario.next();
			System.out.println("Ingrese la ID de su producto");
			System.out.print("> ");
			int ID = Usuario.nextInt();
			System.out.println("Ingrese el precio de su producto (con comas, ej: 200.00)");
			System.out.print("> ");
			double precio = Usuario.nextDouble();
			System.out.println("Ingrese el nombre del fabricante del producto");
			System.out.print("> ");
			String fabricante = Usuario.next();
			System.out.println("Ingresa los voltios de su producto");
			System.out.print("> ");
			int voltios = Usuario.nextInt();
			System.out.println("Ingresa el tipo del que es su producto");
			System.out.print("> ");
			String tipo = Usuario.next();

			for (int i = 0; i < arelectronica.length; i++) {
				if (arelectronica[i] == null) {
					arelectronica[i] = new Electrónica(nombre, ID, precio, fabricante, voltios, tipo);
					break;
				}
			}
			break;
		case 2:
			int eliminarE;
			System.out.println("Escriba la ID del alimento a eliminar: ");
			System.out.println("Electrónicos: ");
			for (int i = 0; i < arelectronica.length; i++) {
				if (arelectronica[i] != null) {
					System.out.print("Electrónico N°" + i + " Nombre: " + arelectronica[i].getNombre());
					System.out.print(" ID: " + arelectronica[i].getID());
					System.out.print(" Precio: " + arelectronica[i].getPrecio());
					System.out.print(" Fabricante: " + arelectronica[i].getFabricante());
					System.out.println(" Voltios: " + arelectronica[i].getVoltios());
					System.out.println(" Tipo: " + arelectronica[i].getTipo());
				} else {
					System.out.println("En la posición N°" + i + " no hay electrónicos registrados");
				}
			}
			eliminarE = Usuario.nextInt();

			for (int i = 0; i < arelectronica.length; i++) {
				if (arelectronica[i].getID() == eliminarE && arelectronica[i] != null) {
					arelectronica[i] = null;
					System.out.println("Eliminado");
					break;
				} else {

				}
			}
			break;
		case 3:
			int nuevaID;
			int modificar;
			System.out.println("Lista Alimentos: ");
			for (int i = 0; i < arelectronica.length; i++) {
				if (arelectronica[i] != null) {
					System.out.print("Electrónico N°" + i + " Nombre: " + arelectronica[i].getNombre());
					System.out.print(" ID: " + arelectronica[i].getID());
					System.out.print(" Precio: " + arelectronica[i].getPrecio());
					System.out.print(" Fabricante: " + arelectronica[i].getFabricante());
					System.out.println(" Voltios: " + arelectronica[i].getVoltios());
					System.out.println(" Tipo: " + arelectronica[i].getTipo());
				} else {
					System.out.println("En la posición N°" + i + " no hay electrónicos registrados");
				}
			}
			System.out.println("");
			System.out.println("Ingrese la ID del alimento a modificar");
			System.out.print("> ");
			modificar = Usuario.nextInt();

			for (int i = 0; i < arelectronica.length; i++) {
				if (arelectronica[i].getID() == modificar && arelectronica[i] != null) {
					System.out.println("Ingrese la nueva ID:");
					nuevaID = Usuario.nextInt();
					arelectronica[i].setID(nuevaID);
					System.out.println("ID modificada con éxito");
					break;
				} else {
					System.out.println("El electrónico no existe");
				}
			}
			break;
		case 4:
			System.out.println("");
			System.out.println("Lista de Electrónicos: ");
			for (int i = 0; i < arelectronica.length; i++) {
				if (arelectronica[i] != null) {
					System.out.print("Electrónico N°" + i + " Nombre: " + arelectronica[i].getNombre());
					System.out.print(" ID: " + arelectronica[i].getID());
					System.out.print(" Precio: " + arelectronica[i].getPrecio());
					System.out.print(" Fabricante: " + arelectronica[i].getFabricante());
					System.out.println(" Voltios: " + arelectronica[i].getVoltios());
					System.out.println(" Tipo: " + arelectronica[i].getTipo());
				} else {
					System.out.println("En la posición N°" + i + " no hay electrónicos registrados");
				}
			}
		}
	}
}

package bobconstruyeABML;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {

		int opcion;
		Casa[] arcasa = new Casa[10];
		Apartamento[] arapartamento = new Apartamento[10];
		Scanner Usuario = new Scanner(System.in);
		
		do {
		System.out.println("");
		System.out.println("Elija una opción de las siguientes");
		System.out.println("Su edificio es una/un...");
		System.out.println("1 - Casa");
		System.out.println("2 - Apartamento");
		System.out.println("3 - Salir");
		System.out.print("> ");
		opcion = Usuario.nextInt();

		switch (opcion) {

		case 1:
			gestionCasa(arcasa, Usuario);
			break;

		case 2:
			gestionApartamento(arapartamento, Usuario);
			break;
		
		case 3:
			System.out.println("");
			System.out.println("Programa cerrado");
			break;
			
		default:
			System.out.println("");
			System.out.println("Elección no disponible");
			System.out.println("");
		}
		} while(opcion != 3);
		
	}

	public static void gestionCasa(Casa[] arcasa, Scanner Usuario) {

		int opciongC;

		System.out.println("");
		System.out.println("Elija una opción: ");
		System.out.println("1 - Agregar");
		System.out.println("2 - Eliminar");
		System.out.println("3 - Modificar");
		System.out.println("4 - Listar");
		System.out.print("> ");
		opciongC = Usuario.nextInt();

		switch (opciongC) {

		case 1:
			System.out.println("");
			System.out.println("Ingrese la cantidad de pisos en su casa (0 si no tiene)");
			System.out.print("> ");
			int pisos = Usuario.nextInt();
			System.out.println("Ingrese la dirección de su casa");
			System.out.print("> ");
			String direccion = Usuario.next();
			System.out.println("Ingrese la cantidad de ascensores de su casa (0 si no tiene)");
			System.out.print("> ");
			int cantidadascensores = Usuario.nextInt();
			System.out.println("Ingrese el número de chimeneas de su casa (0 si no tiene)");
			System.out.print("> ");
			int numerochimeneas = Usuario.nextInt();
			System.out.println("Ingresa el área del terreno de su casa (sin comas ni puntos, redondeado)");
			System.out.print("> ");
			int areadeterreno = Usuario.nextInt();

			for (int i = 0; i < arcasa.length; i++) {
				if (arcasa[i] == null) {
					arcasa[i] = new Casa(pisos, direccion, cantidadascensores, numerochimeneas, areadeterreno);
					break;
				}
			}
			break;
		case 2:
			String eliminarD;
			System.out.println("Escriba la dirección de la casa a eliminar: ");
			System.out.println("Casas: ");
			for (int i = 0; i < arcasa.length; i++) {
				if (arcasa[i] != null) {
					System.out.print("Casa N°" + i + " Pisos: " + arcasa[i].getPisos());
					System.out.print(" Dirección: " + arcasa[i].getDireccion());
					System.out.print(" Cantidad ascensores: " + arcasa[i].getCantidadascensores());
					System.out.print(" Número de chimeneas: " + arcasa[i].getNumerochimeneas());
					System.out.println(" Área del terreno: " + arcasa[i].getAreadeterreno());
				} else {
					System.out.println("En la posición N°" + i + " no hay casas");
				}
			}
			eliminarD = Usuario.next();

			for (int i = 0; i < arcasa.length; i++) {
				if (arcasa[i].getDireccion().equals(eliminarD) && arcasa[i] != null) {
					arcasa[i] = null;
					System.out.println("Eliminado");
					break;
				} else {

				}
			}
			break;
		case 3:
			String nuevaDir;
			String modificar;
			System.out.println("Lista Casas: ");
			for (int i = 0; i < arcasa.length; i++) {
				if (arcasa[i] != null) {
					System.out.print("Casa N°" + i + " Pisos: " + arcasa[i].getPisos());
					System.out.print(" Dirección: " + arcasa[i].getDireccion());
					System.out.print(" Cantidad ascensores: " + arcasa[i].getCantidadascensores());
					System.out.print(" Número de chimeneas: " + arcasa[i].getNumerochimeneas());
					System.out.println(" Área del terreno: " + arcasa[i].getAreadeterreno());
				} else {
					System.out.println("En la posición N°" + i + " no hay casas");
				}
			}
			System.out.println("");
			System.out.println("Ingrese la dirección de la casa a modificar");
			System.out.print("> ");
			modificar = Usuario.next();

			for (int i = 0; i < arcasa.length; i++) {
				if (arcasa[i].getDireccion().equals(modificar) && arcasa[i] != null) {
					System.out.println("Ingrese la nueva dirección:");
					nuevaDir = Usuario.next();
					arcasa[i].setDireccion(nuevaDir);
					System.out.println("Dirección modificada con éxito");
					break;
				} else {
					System.out.println("La casa no existe");
				}
			}
			break;
		case 4:
			System.out.println("");
			System.out.println("Lista de Casas: ");
			for (int i = 0; i < arcasa.length; i++) {
				if (arcasa[i] != null) {
					System.out.print("Casa N°" + i + " Pisos: " + arcasa[i].getPisos());
					System.out.print(" Dirección: " + arcasa[i].getDireccion());
					System.out.print(" Cantidad ascensores: " + arcasa[i].getCantidadascensores());
					System.out.print(" Número de chimeneas: " + arcasa[i].getNumerochimeneas());
					System.out.println(" Área del terreno: " + arcasa[i].getAreadeterreno());
				} else {
					System.out.println("En la posición N°" + i + " no hay casas");
				}
			}
		}
	}
	
	public static void gestionApartamento(Apartamento[] arapartamento, Scanner Usuario) {
		
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
			System.out.println("Ingrese la cantidad de pisos en su apartamento (0 si no hay)");
			System.out.print("> ");
			int pisos = Usuario.nextInt();
			System.out.println("Ingrese la dirección de su apartamento");
			System.out.print("> ");
			String direccion = Usuario.next();
			System.out.println("Ingrese la cantidad de ascensores de su apartamento (0 si no hay)");
			System.out.print("> ");
			int cantidadascensores = Usuario.nextInt();
			System.out.println("Ingrese el número del apartamento");
			System.out.print("> ");
			int numeroapartamento = Usuario.nextInt();
			System.out.println("Ingrese el alquiler de su apartamento (con comas, ej: 200,00)");
			System.out.print("> ");
			double alquiler = Usuario.nextDouble();

			for (int i = 0; i < arapartamento.length; i++) {
				if (arapartamento[i] == null) {
					arapartamento[i] = new Apartamento(pisos, direccion, cantidadascensores, numeroapartamento, alquiler);
					break;
				}
			}
			System.out.println("");
			break;
		case 2:
			int eliminarA;
			System.out.println("Escriba el número del apartamento a eliminar: ");
			System.out.println("Apartamentos: ");
			for (int i = 0; i < arapartamento.length; i++) {
				if (arapartamento[i] != null) {
					System.out.print("Apartamento N°" + i + " Pisos: " + arapartamento[i].getPisos());
					System.out.print(" Dirección: " + arapartamento[i].getDireccion());
					System.out.print(" Cantidad ascensores: " + arapartamento[i].getCantidadascensores());
					System.out.print(" Número de apartamento: " + arapartamento[i].getNumeroapartamento());
					System.out.println(" Alquiler: " + arapartamento[i].getAlquiler());
				} else {
					System.out.println("En la posición N°" + i + " no hay apartamentos");
				}
			}
			eliminarA = Usuario.nextInt();

			for (int i = 0; i < arapartamento.length; i++) {
				if (arapartamento[i].getNumeroapartamento() == eliminarA && arapartamento[i] != null) {
					arapartamento[i] = null;
					System.out.println("Eliminado");
					break;
				} else {

				}
			}
			break;
		case 3:
			String nuevoNum;
			String modificar;
			System.out.println("Lista Apartamentos: ");
			for (int i = 0; i < arapartamento.length; i++) {
				if (arapartamento[i] != null) {
					System.out.print("Apartamento N°" + i + " Pisos: " + arapartamento[i].getPisos());
					System.out.print(" Dirección: " + arapartamento[i].getDireccion());
					System.out.print(" Cantidad ascensores: " + arapartamento[i].getCantidadascensores());
					System.out.print(" Número de apartamento: " + arapartamento[i].getNumeroapartamento());
					System.out.println(" Alquiler: " + arapartamento[i].getAlquiler());
				} else {
					System.out.println("En la posición N°" + i + " no hay Apartamentos");
				}
			}
			System.out.println("");
			System.out.println("Ingrese la dirección del apartamento a modificar");
			modificar = Usuario.next();

			for (int i = 0; i < arapartamento.length; i++) {
				if (arapartamento[i].getDireccion().equals(modificar) && arapartamento[i] != null) {
					System.out.println("Ingrese la nueva dirección:");
					nuevoNum = Usuario.next();
					arapartamento[i].setDireccion(nuevoNum);
					System.out.println("Número modificado con éxito");
					break;
				} else {
					System.out.println("El apartamento no existe");
				}
			}
			break;
		case 4:
			System.out.println("");
			System.out.println("Lista de Apartamentos: ");
			for (int i = 0; i < arapartamento.length; i++) {
				if (arapartamento[i] != null) {
					System.out.print("Apartamento N°" + i + " Pisos: " + arapartamento[i].getPisos());
					System.out.print(" Dirección: " + arapartamento[i].getDireccion());
					System.out.print(" Cantidad ascensores: " + arapartamento[i].getCantidadascensores());
					System.out.print(" Número de apartamento: " + arapartamento[i].getNumeroapartamento());
					System.out.println(" Alquiler: " + arapartamento[i].getAlquiler());
				} else {
					System.out.println("En la posición N°" + i + " no hay apartamentos");
				}
			}
		}
	}

}

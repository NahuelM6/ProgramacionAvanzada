package bobconstruye;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {

		int opcion;

		Scanner Usuario = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de pisos en su edificio");
		System.out.print("> ");
		int pisos = Usuario.nextInt();
		System.out.println("Ingrese la dirección de su edificio");
		System.out.print("> ");
		String direccion = Usuario.next();
		System.out.println("Ingrese la cantidad de ascensores de su edificio");
		System.out.print("> ");
		int cantidadascensores = Usuario.nextInt();

		System.out.println("");
		System.out.println("Elija una opción de las siguientes");
		System.out.println("Su edificio es una/un...");
		System.out.println("1 - Casa");
		System.out.println("2 - Apartamento");
		System.out.print("> ");
		opcion = Usuario.nextInt();

		switch (opcion) {

		case 1:

			System.out.println("");
			System.out.println("Ingrese el número de chimeneas de su casa");
			System.out.print("> ");
			int numerochimeneas = Usuario.nextInt();
			System.out.println("Ingrese el área del terreno de su casa (m²)");
			System.out.print("> ");
			int areaterreno = Usuario.nextInt();
			Casa ca1 = new Casa(pisos, direccion, cantidadascensores, numerochimeneas, areaterreno);
			ca1.setPisos(pisos);
			ca1.setDireccion(direccion);
			ca1.setCantidadascensores(cantidadascensores);
			ca1.setNumerochimeneas(numerochimeneas);
			ca1.setAreadeterreno(areaterreno);

			System.out.println("");
			System.out.println("Detalles de la casa:");
			System.out.println("Nro de pisos: " + ca1.getPisos());
			System.out.println("Dirección: " + ca1.getDireccion());
			System.out.println("Cantidad ascensores: " + ca1.getCantidadascensores());
			System.out.println("Nro de chimeneas: " + ca1.getNumerochimeneas());
			System.out.println("Área del terreno: " + ca1.getAreadeterreno() + "²");

			break;

		case 2:

			System.out.println("");
			System.out.println("Ingrese el número de apartamento de su apartamento");
			System.out.print("> ");
			int numeroapartamento = Usuario.nextInt();
			System.out.println("Ingrese el precio del alquiler de su apartamento (con comas, ej: 200,00)");
			System.out.print("> ");
			double alquiler = Usuario.nextDouble();
			Apartamento ap1 = new Apartamento(pisos, direccion, cantidadascensores, numeroapartamento, alquiler);
			ap1.setPisos(pisos);
			ap1.setDireccion(direccion);
			ap1.setCantidadascensores(cantidadascensores);
			ap1.setNumeroapartamento(numeroapartamento);
			ap1.setAlquiler(alquiler);

			System.out.println("");
			System.out.println("Detalles del apartamento:");
			System.out.println("Nro Pisos: " + ap1.getPisos());
			System.out.println("Dirección: " + ap1.getDireccion());
			System.out.println("Cantidad ascensores: " + ap1.getCantidadascensores());
			System.out.println("Nro apartamento: " + ap1.getNumeroapartamento());
			System.out.println("Alquiler: " + ap1.getAlquiler());

			break;
		}
	}

}

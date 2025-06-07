package mundoacademico;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {

		int opcion;

		Scanner Usuario = new Scanner(System.in);
		System.out.println("Ingrese el titulo de su publicación");
		System.out.print("> ");
		String titulo = Usuario.next();
		System.out.println("Ingrese la fecha de publicación");
		System.out.print("> ");
		String fechapublicacion = Usuario.next();
		System.out.println("Ingrese el número de páginas de su publicación");
		System.out.print("> ");
		int páginas = Usuario.nextInt();
		System.out.println("Ingrese el nombre del autor de la publicación");
		System.out.print("> ");
		String autor = Usuario.next();

		System.out.println("");
		System.out.println("Elija una opción de las siguientes");
		System.out.println("Su publicación es...");
		System.out.println("1 - Libro");
		System.out.println("2 - Revista");
		System.out.println("3 - Artículo Científico");
		System.out.print("> ");
		opcion = Usuario.nextInt();

		switch (opcion) {

		case 1:

			System.out.println("");
			System.out.println("Ingrese el ISBN (International Standard Book Number) de su libro");
			System.out.print("> ");
			int ISBN = Usuario.nextInt();
			System.out.println("Ingrese la edición de su libro");
			System.out.print("> ");
			String edicion = Usuario.next();
			Libro li1 = new Libro(titulo, fechapublicacion, páginas, autor, ISBN, edicion);
			li1.setTitulo(titulo);
			li1.setFechapublicacion(fechapublicacion);
			li1.setPáginas(páginas);
			li1.setAutor(autor);
			li1.setISBN(ISBN);
			li1.setEdicion(edicion);

			System.out.println("");
			System.out.println("Detalles del Producto:");
			System.out.println("Titulo: " + li1.getTitulo());
			System.out.println("Fecha de Publicación: " + li1.getFechapublicacion());
			System.out.println("Páginas: " + li1.getPáginas());
			System.out.println("Autor: " + li1.getAutor());
			System.out.println("ISBN: " + li1.getISBN());
			System.out.println("Edición: " + li1.getEdicion());

			break;

		case 2:

			System.out.println("");
			System.out.println("Ingrese la periodicidad de la Revista (que tan seguido se publican nuevos ejemplares)");
			System.out.print("> ");
			String periodicidad = Usuario.next();
			System.out.println("Ingrese la temática de su revista");
			System.out.print("> ");
			String tematica = Usuario.next();
			System.out.println("Ingrese el país de origen de la revista");
			System.out.print("> ");
			String paisdeorigen = Usuario.next();
			Revista re1 = new Revista(titulo, fechapublicacion, páginas, autor, periodicidad, tematica, paisdeorigen);
			re1.setTitulo(titulo);
			re1.setFechapublicacion(fechapublicacion);
			re1.setPáginas(páginas);
			re1.setAutor(autor);
			re1.setPeriodicidad(periodicidad);
			re1.setTematica(tematica);
			re1.setPaisdeorigen(paisdeorigen);

			System.out.println("");
			System.out.println("Detalles del Producto:");
			System.out.println("Titulo: " + re1.getTitulo());
			System.out.println("Fecha de Publicación: " + re1.getFechapublicacion());
			System.out.println("Páginas: " + re1.getPáginas());
			System.out.println("Autor: " + re1.getAutor());
			System.out.println("Periodicidad: " + re1.getPeriodicidad());
			System.out.println("Temática: " + re1.getTematica());
			System.out.println("País de origen: " + re1.getPaisdeorigen());

			break;

		case 3:

			System.out.println("");
			System.out.println("Ingrese el área científica de su artículo");
			System.out.print("> ");
			String areacientifica = Usuario.next();
			System.out.println("Ingrese un resumen de su artículo");
			System.out.print("> ");
			String resumen = Usuario.next();
			ArticuloCientifico ar1 = new ArticuloCientifico(titulo, fechapublicacion, páginas, autor, areacientifica, resumen);
			ar1.setTitulo(titulo);
			ar1.setFechapublicacion(fechapublicacion);
			ar1.setPáginas(páginas);
			ar1.setAutor(autor);
			ar1.setAreacientifica(areacientifica);
			ar1.setResumen(resumen);

			System.out.println("");
			System.out.println("Detalles del Producto:");
			System.out.println("Titulo: " + ar1.getTitulo());
			System.out.println("Fecha de Publicación: " + ar1.getFechapublicacion());
			System.out.println("Páginas: " + ar1.getPáginas());
			System.out.println("Autor: " + ar1.getAutor());
			System.out.println("Área científica: " + ar1.getAreacientifica());
			System.out.println("Resumen: " + ar1.getResumen());

			break;
		}

	}
}

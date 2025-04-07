package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Catalogo libro;
		Scanner sc = new Scanner(System.in);
		libro = new Catalogo(sc,100);
		int opcion;
		
		do {
			opcion = menu(sc);
			switch(opcion)
			{
			case 1:
				libro.altaLibro();
				break;
			case 2:
				libro.buscarLibroISBN();
				break;
			case 3:
				libro.modificarLibroISBN();
				break;
			case 4:
				libro.bajaLibro();
				break;
			case 5:
				libro.listaLibro();
				break;
			}
		} while(opcion != 6);		
		sc.close();


	}
	
	public static int menu(Scanner sc)
	{
		int opcion;
		do {
			System.out.println("1 - Create – dar de alta un nuevo libro");
			System.out.println("2 - Read -consultar un libro por su ISBN");
			System.out.println("3 - Update – modificar el título de un libro buscado por su ISBN");
			System.out.println("4 - Delete - eliminar un libro buscado por ISBN");
			System.out.println("5 - Listado de libros");
			System.out.println("6 - Salir");
			try {
				opcion = sc.nextInt();
			}catch (InputMismatchException e)
			{
				opcion = 0;
			}
			sc.nextLine();
			if(opcion < 1 || opcion > 6)
				System.out.println("Opcion Incorrecta");
		} while(opcion < 1 || opcion > 6);
		return opcion;
	}
}

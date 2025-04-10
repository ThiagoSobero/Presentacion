package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		ComunidadesAutonomas cAutonoma;
		RelacionProvincias rProvincia;
		
		cAutonoma = new ComunidadesAutonomas(20);
		rProvincia = new RelacionProvincias(60);
		
		do {
			opcion = menu(sc);
			switch(opcion)
			{
			case 1:
				cAutonoma.add(sc);
				break;
			case 2:
				rProvincia.add(sc,cAutonoma);
				break;
			case 3:
				cAutonoma.imprimir(rProvincia);
				break;
			case 4:
			}
			
		} while(opcion!= 4);
		
		
		
		
		sc.close();
	}
	public static int menu(Scanner sc)
	{
		int opcion;
		do {
		System.out.println("1 - Nueva CCAA");
		System.out.println("2 - Nueva Provincia");
		System.out.println("3 - Listado de todas las CCAA");
		System.out.println("4 - Salir");
		System.out.println("Introduzca la opcion deseada:");
		opcion = sc.nextInt();
		sc.nextLine();
		if(opcion<1||opcion>4)
			System.out.println("Opcion incorrecta");
		}while(opcion<1||opcion>4);
		return opcion;
	}

}

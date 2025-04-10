package Principal;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		Empleados empleados = new Empleados();

		empleados.add(new Empleado("pepe",20,3500));
		empleados.add(new Empleado("Ana",30,4500));
		empleados.add(new Empleado("Gabriel",4,1800));

		//Metodo leer 1
		//empleados.leerFicheroV1("Empleados.txt"); 
		
		//Metodo escribir 2
		 //empleados.escribirFicheroV2("Empleadosv2.txt");
		
		empleados.leerFicheroV2("Empleadosv2.txt");
		
		/* version 1 lectura
		try {
		empleados.escribirFicheroV1("Empleados.txt");
		} catch(IOException e)
		{
			System.out.println("No se ha podido imprimir el fichero");
		}
		*/
		System.out.println(empleados);
		
	}
	
	

}

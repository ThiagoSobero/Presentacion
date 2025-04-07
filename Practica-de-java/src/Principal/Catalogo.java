package Principal;

import java.util.Scanner;

public class Catalogo {
	
	private Libro[] vector;
	private int librosActuales;
	private int librosMax;
	private Scanner sc;
	
	public Catalogo(Scanner sc, int n) {
		this.vector = new Libro[n];
		this.librosActuales = 0;
		this.librosMax = n;
		this.sc = sc;
	}
	
	public void altaLibro () 
	{
		if (librosActuales == librosMax)
			System.out.println("\nNo hay espacio suficiente\n");
		else
		{
			vector[librosActuales] = new Libro(sc);
			librosActuales++;
		}
	}
	public int buscarLibro()
	{
		String name;
		System.out.println("Introduzca nombre del Libro");
		name = sc.nextLine();
		for (int pos = 0;pos<this.librosActuales;pos++)
			if(name.equals(vector[pos].getNombreLibro()))
				return pos;
		return -1;
	}
	
	public void bajaLibro()
	{
		int pos;
		String respuesta;
		pos = buscarLibro();
		if(pos == -1)
			System.out.println("\nEl libro indicado no existe\n");
		else
		{
			System.out.println(vector[pos]);
			System.out.println("Confirma el borrado");
			respuesta = sc.nextLine();
			respuesta = respuesta.toUpperCase();
			if(respuesta.charAt(0)=='S')
			{
				for(int i=pos;i<this.librosActuales-1;i++)
					vector[i]=vector[i+1];
				this.librosActuales--;
			}
		}
	}
	
	public void listaLibro() 
	{

		if(this.librosActuales == 0)
			System.out.println("\nNo hay libros\n");
		else
			for(int i=0; i < this.librosActuales;i++)
			{
				System.out.println("Título: "+vector[i].getNombreLibro());
				System.out.println("Edición: "+vector[i].getEditorial());
				System.out.println("Autor: "+vector[i].getAutor());
				System.out.println("ISBN: "+vector[i].getISBN());
				System.out.println("Fecha: "+vector[i].getFecha());
				System.out.println(vector[i].getnPaginas()+" páginas");
				System.out.println();
			}
		System.out.println();
	}
	
	public int buscarLibroISBN()
	{
		String codigo;
		System.out.println("Introduzca ISBN del Libro");
		codigo = sc.nextLine();
		if(this.librosActuales == 0)
			System.out.println("\nNo hay libros\n");
		else
			for(int i=0; i < this.librosActuales;i++)
			{
				codigo = vector[i].getNombreLibro();	
				System.out.println("Nombre del libro: "+codigo);
			}
		return librosActuales;
	}
	
	public String modificarLibroISBN() 
	{
		String codigo = "";
		String nuevoNombrelibro = "";
		int constante = 0;
		
		if(this.librosActuales == 0)
			System.out.println("\nNo hay libros\n");
		else
		{
			
			System.out.println("Introduzca el ISBN del libro");
			codigo=sc.nextLine();
			for(int i=0; i < this.librosActuales;i++)
			{
				if(vector[i].getISBN().equals(codigo))
					constante = i;
			}
			System.out.println("Introduzca el nuevo nombre del libro");
			nuevoNombrelibro=sc.nextLine();
			if(!nuevoNombrelibro.equals(""))
				vector[constante].setNombreLibro(nuevoNombrelibro);
		}
		
	return codigo;
	}

}

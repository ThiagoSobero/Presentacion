package Principal;

import java.util.Scanner;

public class CCAA {

	private int codigo;
	private String nombre;
	
	public CCAA(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		//Provincia[] provincia; // Solo ocurre en el modelo orientado a objeto // Normalmente no es un vector es una lista
		//private int nProvincias;
	}
	
	public CCAA(Scanner sc)
	{
		System.out.println("Nombre de la CCAA:");
		nombre = sc.nextLine();
		System.out.println("Codigo de la CCAA:");
		codigo = sc.nextInt();
		sc.nextLine(); //Eliminar intro
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return codigo + " - " + nombre + "\n";
	}
	
	
	
	
	
}

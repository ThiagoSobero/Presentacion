package Principal;

import java.util.Scanner;

public class Provincia {
	
	private int codigo;
	private String nombre;
	// Solo se puede usar una de estas dos opciones
	private int codigoCCAA; // Enfoque relacional
	//private CCAA comunidadAutonoma; // Enfoque orientado a objeto
	
	public Provincia(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public Provincia(Scanner sc, ComunidadesAutonomas ca)
	{
		System.out.println("Nombre provincia:");
		nombre = sc.nextLine();
		System.out.println("Codigo provincia:");
		codigo = sc.nextInt();
		sc.nextLine(); // Eliminar el intro
		do {
			System.out.println("Selecciones la CCAA");
			System.out.println(ca);
			codigoCCAA = sc.nextInt();
			sc.nextLine(); // Eliminar el intro
		}while(ca.vereficaCodigo(codigoCCAA)==false);
	}
	
	
	
	
	public int getCodigoCCAA() {
		return codigoCCAA;
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
	
	public String toString() {
		return codigo + " - " + nombre;
	}

}

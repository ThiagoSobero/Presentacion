package Principal;

import java.io.Serializable;

public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int antiguedad;
	private double salario;
	
	public Empleado(String nombre, int antiguedad, double salario) {
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.salario = salario;
	}
	
	

	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String toString() {
		return nombre + " " + antiguedad + " " + salario ;
	}

	
	
	
	
	
	
}

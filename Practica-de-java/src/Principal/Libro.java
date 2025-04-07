package Principal;

import java.util.Scanner;

public class Libro {
	
	private String nombreLibro;
	private String autor;
	private String ISBN;
	private String editorial;
	private String fecha;
	private int nPaginas;
	
	
	public Libro(String nombreLibro, String editorial, String autor, String ISBN,String fecha,int nPaginas) {
		this.nombreLibro = nombreLibro;
		this.editorial = editorial;
		this.autor = autor;
		this.ISBN = ISBN;
		this.fecha = fecha;
		this.nPaginas = nPaginas;
	}
	
	public Libro(Scanner sc) {
		System.out.println("nombre_libro");
		this.nombreLibro = sc.nextLine();
		System.out.println("editorial");
		this.editorial = sc.nextLine();
		System.out.println("autor");
		this.autor = sc.nextLine();
		System.out.println("ISBN");
		this.ISBN= sc.nextLine();
		System.out.println("Fecha de publicación");
		this.fecha= sc.nextLine();
		System.out.println("Número de paginas");
		this.nPaginas= sc.nextInt();
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	public String toString() {
		return nombreLibro + " " + editorial + " "+ autor + " " + ISBN + " " + fecha + " " + nPaginas;
	}
	

}

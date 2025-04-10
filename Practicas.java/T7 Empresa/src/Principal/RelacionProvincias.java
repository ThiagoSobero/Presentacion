package Principal;

import java.util.Scanner;

public class RelacionProvincias {
	
	private Provincia [] provincias;
	private int nProvinciasMax;
	private int nProvinciasActual;

	public RelacionProvincias(int n)
	{
		this.nProvinciasActual = 0;
		this.nProvinciasMax = n;
		provincias = new Provincia[n];
	}
	
	public void add(Scanner sc, ComunidadesAutonomas ca)
	{
		if(this.nProvinciasActual==this.nProvinciasMax)
			System.out.println("No hay espacio para una nueva provincia");
		else
			this.provincias[this.nProvinciasActual++]= new Provincia(sc,ca);
	}
	
	public void imprimir(int codigoCCAA)
	{
		for(int i =0;i<this.nProvinciasActual;i++)
			if(codigoCCAA == this.provincias[i].getCodigoCCAA())
				System.out.println("\t\t"+this.provincias[i]);
	}
}

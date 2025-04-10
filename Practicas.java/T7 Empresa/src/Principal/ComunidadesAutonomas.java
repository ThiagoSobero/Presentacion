package Principal;

import java.util.Scanner;

public class ComunidadesAutonomas {
	
	private CCAA [] comunidades;
	private int nComunidadesMax = 25;
	private int nComunidadesActual = 0;
	
	public ComunidadesAutonomas(int n)
	{
		this.nComunidadesMax = n;
		this.nComunidadesActual = 0;
		comunidades = new CCAA[n];
	}
	
	public void add(Scanner sc)
	{
		if(this.nComunidadesActual==this.nComunidadesMax)
			System.out.println("sin espacio");
		else
		{
			comunidades[this.nComunidadesActual++]= new CCAA(sc);
		}
	}
	
	public boolean vereficaCodigo(int codigo)
	{
		for(int i=0;i<this.nComunidadesActual;i++)
			return true;
		return false;
	}
	
	public void imprimir(RelacionProvincias rp)
	{
		for(int i = 0;i<this.nComunidadesActual;i++)
		{
			System.out.println(this.comunidades[i]);
			rp.imprimir(this.comunidades[i].getCodigo());
		}
	}

	public String toString()
	{
		String resultado="";
		for(int i=0;i<this.nComunidadesActual;i++)
		{
			resultado += comunidades[i].toString();
		}
		return resultado;
	}
	
	
}

package Principal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Empleados {
	
	private ArrayList<Empleado> lista;
	
	public Empleados()
	{
		lista = new ArrayList<>();
	}
	
	public boolean add(Empleado e)
	{
		return lista.add(e);
	}

	public void escribirFicheroV1(String fileName) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(fileName);
		DataOutputStream salida = new DataOutputStream(fos);
		
		for(Empleado e: lista)
		{
			salida.writeUTF(e.getNombre());
			salida.writeInt(e.getAntiguedad());
			salida.writeDouble(e.getSalario());
		}
		
		salida.close();
		fos.close();
	}
	
	public void escribirFicheroV2(String fileName) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream salida = new ObjectOutputStream(fos);
		
		salida.writeObject(lista);
		
		//for(Empleado e: lista)
			//salida.writeObject(e);
		
		salida.close();
		fos.close();
	}
	
	public void leerFicheroV1(String fileName) throws IOException
	{
		FileInputStream fis = new FileInputStream(fileName);
		DataInputStream entrada = new DataInputStream(fis);
		String nombre;
		int antiguedad;
		double salario;
		nombre = entrada.readUTF();
		antiguedad = entrada.readInt();
		boolean fin=false;
		while(!fin) {
		try {
			lista.add(new Empleado (entrada.readUTF(),entrada.readInt(),entrada.readDouble()));
		} catch(FileNotFoundException e)
		{
			fin = true;
			break;
		}
		}
		entrada.close();
		fis.close();
	}
	
	public void leerFicheroV2(String fileName) throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream entrada = new ObjectInputStream(fis);
		
		lista = (ArrayList<Empleado>)entrada.readObject();
		
		entrada.close();
		fis.close();
	}
	
	public String toString() {
		
		String resultado = "";
		for(Empleado e : lista)
			resultado += e+"\n";
		return resultado;
		
		//return lista.toString();
	}

	
}

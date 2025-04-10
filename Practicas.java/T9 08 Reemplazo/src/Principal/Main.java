package Principal;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Criptografia crip= new Criptografia(1);
		
		//crip.encriptar("saludo.txt", "saludo_cryp.txt");
		crip.desencriptar("saludo_cryp.txt", "saludo_descryp.txt");

	}

}

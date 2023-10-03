import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CadenasAsterisco {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String cadena;
		boolean asterisco = false;
		/*
		 * for(;;) { System.out.println("introduce una cadena :"); cadena=br.readLine();
		 * System.out.println("la cadena introducida es : "+cadena );
		 * if(cadena.equals("*")){ System.out.
		 * println("has introducido un asterisco como finalizacion del programa");
		 * break; } }
		 */
		System.out.println("introduce una cadena :");
		cadena = br.readLine();
		while (!cadena.equals("*")) {
			System.out.println("introduce una cadena :");
			cadena = br.readLine();
		}
		
	}

}

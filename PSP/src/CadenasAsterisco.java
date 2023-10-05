import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CadenasAsterisco {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String cadena;
		/*
		 * for(;;) { System.out.println("introduce una cadena :"); cadena=br.readLine();
		 * System.out.println("la cadena introducida es : "+cadena );
		 * if(cadena.equals("*")){ System.out.
		 * println("has introducido un asterisco como finalizacion del programa");
		 * break; } }
		 */
			do {
			//System.out.println("introduce una cadena :");
			cadena = br.readLine();
			System.out.println("Has introducido "+cadena);
		}	
			while (!cadena.equals("*")) ;
			in.close();
			System.out.println("El programa se acabó ya que la cadena es un asterisco");
		System.exit(0);
	}
}


			

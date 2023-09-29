import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CadenasAsterisco {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String cadena;
		boolean asterisco=false;
		while(asterisco==false) {
			System.out.println("introduce una cadena :");
			cadena=br.readLine();
System.out.println("la cadena introducida es : "+cadena );
		if(!cadena.equals("*")) {
			asterisco=false;
			
		}else {
			System.out.println("has introducido un asterisco como finalizacion del programa");
			asterisco=true;
		}
		
		
		
	}

}
}

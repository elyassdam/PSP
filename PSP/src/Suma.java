import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Suma {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String cad1="", cad2="";
		try {
		System.out.println("Introduce un numero..."+cad1);
		cad1= br.readLine();
		System.out.println("Cadena escrita: " + cad2);
		cad2=br.readLine();
		}catch (Exception e) { e.printStackTrace();
		}
		
		
if(isNumeric(cad1)&&isNumeric(cad2)) {
	System.out.println(Integer.parseInt(cad1)+Integer.parseInt(cad1));
	System.exit(0);
}
	}
	public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
}

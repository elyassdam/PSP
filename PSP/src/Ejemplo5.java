import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ejemplo5 {

	public static void main(String[] args) throws IOException {
		
			File directorio = new File(".\\bin");
			ProcessBuilder pb = new ProcessBuilder("java", "EjemploLectura");
			pb.directory(directorio);
			// se ejecuta el proceso
			Process p = pb.start();
			// escritura -- envia entrada
			OutputStream os = p.getOutputStream();
			BufferedReader buf=new BufferedReader(new FileReader("entrada.txt"));
			String cadena=buf.readLine();
			os.write(cadena.getBytes());
			os.write(System.lineSeparator().getBytes());
			os.flush(); // vacia el buffer de salida
			os.close();
			// lectura -- obtiene la salida
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1)
			System.out.print((char) c);
			is.close();
			// COMPROBACION DE ERROR - 0 bien - 1 mal
			int exitVal;
			try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			try {
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new
			InputStreamReader(er));
			String liner = null;                                     
			while ((liner = brer.readLine()) != null)
			System.out.println("ERROR >" + liner);
			} catch (IOException ioe) {
			ioe.printStackTrace();
			}
	}
			
		
	}



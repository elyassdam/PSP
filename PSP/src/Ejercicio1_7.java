import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ejercicio1_7 {

	public static void main(String[] args) throws IOException {
		File fOut = new File("salida.txt");
	    File fErr = new File("error.txt");
	    File fIn=new File ("entrada.txt");
			File directorio = new File(".\\bin");
			ProcessBuilder pb = new ProcessBuilder("java", "EjemploLectura");
			pb.directory(directorio);
			// se ejecuta el proceso
		
		    pb.redirectOutput(fOut);
		    pb.redirectError(fErr); 
			pb.redirectInput(fIn);
			Process p = pb.start();
		  
		
			// COMPROBACION DE ERROR - 0 bien - 1 mal
			int exitVal;
			try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
			
		
	



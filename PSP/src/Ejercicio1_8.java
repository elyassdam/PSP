import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ejercicio1_8 {


			public static void main(String[] args) throws IOException {
					File fIn=new File("entrada.txt");
					File directorio = new File(".\\bin");
					File fErr=new File("error.txt");
					ProcessBuilder pb = new ProcessBuilder("java", "EjemploLectura");
					pb.directory(directorio);
					
					pb.redirectInput(fIn);
					pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
					pb.redirectInput(fErr);

					// se ejecuta el proceso
					Process p = pb.start();
					
					/*File fOut=new File("salida.txt");
					pb.redirectOutput(fOut);
					Process p2=pb.start();*/
					// lectura -- obtiene la salida
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



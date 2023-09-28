import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio4 {

		public static void main(String[] args) throws IOException {
			

						//creamos objeto File al directorio donde esta Ejemplo2
			File directorio =new File(".\\bin");
						File fichero = new File("ejercicio4.txt");	
						FileWriter filewr=new FileWriter(fichero);
						//El proceso a ejecutar es Ejemplo2			
						ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio3","Hola");

					    //se establece el directorio donde se encuentra el ejecutable
					    pb.directory(directorio);
					        
						System.out.printf("Directorio de trabajo: %s%n",pb.directory());

					    //se ejecuta el proceso
						Process p = pb.start();

					   //obtener la salida devuelta por el proceso
					
							InputStream is = p.getInputStream();
							int c;
							while ((c = is.read()) != -1) {
								System.out.print((char) c);
								filewr.write((char)c);
							
							}
							is.close();
							filewr.close();
					
						
						
						// COMPROBACION DE ERROR - 0 bien - 1 mal
						int exitVal;
						try {
						//se recoge la salida de System.exit()
						exitVal = p.waitFor();
						System.out.println("Valor de Salida: " + exitVal);
						} catch (InterruptedException e) {
						e.printStackTrace();
						}
							
		}
		}


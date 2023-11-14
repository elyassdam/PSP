
import java.io.File;
import java.io.IOException;
public class Generador1M {


		public static void main(String[] args)  {
		File directorio = new File(".\\bin");	

		//El proceso a ejecutar es generadorID		
		ProcessBuilder pb = new ProcessBuilder("java","EJercicio1_GeneradorNumeros");
		
	    //se establece el directorio donde se encuentra el ejecutable
	  pb.directory(directorio);
	        
		System.out.printf("Directorio de trabajo: %s%n",pb.directory());
	int contador=0;
	    //se ejecuta el proceso
		while(contador<10){
			 try {
					System.out.println("parado");

		             Process p = pb.start();
		             System.out.println("hecho");
		           
		            int exitCode = p.waitFor();
		            if (exitCode == 0) {
		                System.out.println("El proceso ha terminado con éxito.");
		                contador++;
		            } else {
		                System.out.println("El proceso ha terminado con errores. Código de salida: " + exitCode);
		            }
		        } catch (IOException | InterruptedException e) {
		            e.printStackTrace();
		        } 
			 
		
		}
		
		

	}
	}


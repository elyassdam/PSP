package practicaevaluable1;

import java.io.File;
import java.io.IOException;

public class Generador1M {
	public static void main(String[] args)  {
		
	
	File directorio = new File(".\\bin");	

	//El proceso a ejecutar es generadorID		
	ProcessBuilder pb = new ProcessBuilder("java","practicaevaluable1.EJ1_GeneradorNumeros.java");

    //se establece el directorio donde se encuentra el ejecutable
  pb.directory(directorio);
        
	System.out.printf("Directorio de trabajo: %s%n",pb.directory());
int contador=0;
    //se ejecuta el proceso
	while(contador<10){
		 try {
	             Process p = pb.start();
	            contador++;
	            p.waitFor();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (InterruptedException IE) {
				IE.printStackTrace();
			}
		 
	
	}
	}
}




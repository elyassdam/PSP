

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo3 {

	public static void main(String[] args) throws IOException {
		/*
		File directorio =new File(".\\bin");
		ProcessBuilder pb=new ProcessBuilder("java","Ejemplo2");
		pb.directory(directorio);
		System.out.printf("El directorio de trabajo es : %s %n",pb.directory());
		Process p=pb.start();
		 
	try {
		InputStream is=p.getInputStream();
		int c;
		while((c=is.read())!=-1){
			System.out.print((char)c);
		}is.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	*/

			//creamos objeto File al directorio donde esta Ejemplo2
			File directorio = new File("C:\\Users\\damSegundo\\eclipse-workspace\\PSP\\bin");	

			//El proceso a ejecutar es Ejemplo2			
			ProcessBuilder pb = new ProcessBuilder("java", "Ejemplo2");

		    //se establece el directorio donde se encuentra el ejecutable
		    pb.directory(directorio);
		        
			System.out.printf("Directorio de trabajo: %s%n",pb.directory());

		    //se ejecuta el proceso
			Process p = pb.start();

		   //obtener la salida devuelta por el proceso
			try {
				InputStream is = p.getInputStream();
				int c;
				/*for (c=is.read(); c !=-1; c=is.read()) {
					System.out.print((char)c);
					
				}*/
				while ((c = is.read()) != -1) 
					System.out.print((char) c);
				is.close();
				} catch (IOException e) {
				e.printStackTrace();
			}
	}
	}



package practicaevaluable1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Generador1M {
	public static void main(String[] args)  {
		
	
	File directorio = new File(".\\bin");	

	//El proceso a ejecutar es generadorID		
	ProcessBuilder pb = new ProcessBuilder("java","practicaevaluable1.EJ1_GeneradorNumeros");

    //se establece el directorio donde se encuentra el ejecutable
  pb.directory(directorio);
        
	System.out.printf("Directorio de trabajo: %s%n",pb.directory());
int contador=0;
    //se ejecuta el proceso
		 try {
	             Process p = pb.start();
	            p.waitFor();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (InterruptedException IE) {
				IE.printStackTrace();
			}
		 try {
			BufferedReader br=new BufferedReader(new FileReader("archivo100K.csv"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("archivo1M.csv"));
			String linea;
			StringBuilder guardar = new StringBuilder();
	while ((linea = br.readLine()) != null) {
                    guardar.append(linea).append("\n");
                   
                }
	while(contador<10) {
		bw.write(guardar.toString());
		contador++;
	}
	
			
		
			System.out.println("Se ha escrito el archivod de 1M de lienas");
		 }catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
	
	}
}
	





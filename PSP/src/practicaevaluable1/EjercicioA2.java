package practicaevaluable1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class EjercicioA2 {
public static void main(String[] args) throws IOException, InterruptedException {
	File directorio=new File(".\\bin");
	
			ProcessBuilder pb = new ProcessBuilder("java","practicaevaluable1.Aleatorios"); 
			pb.directory(directorio);
			Process p=pb.start();
		    //se establece el directorio donde se encuentra el ejecutable
InputStream inAleatorios=p.getInputStream();//Salida 
//OutputStream out=p.getOutputStream();//Entrada
BufferedReader brAleatorios=new BufferedReader(new InputStreamReader(inAleatorios));
String linea="";
List<Integer> numeros=new ArrayList();
try{
	int c = 0;
	while((c=brAleatorios.read()) !=-1){
		char caracter=(char)c;
		 if(caracter!='['&&caracter!=']'){
			if (caracter==',') {
				int numero=Integer.parseInt(linea.trim());
				numeros.add(numero);
				linea="";
		}else {
		
			linea=linea+caracter;
		}
		
	}
	}
	System.out.println("la lista es"+numeros.toString());
			ProcessBuilder pb2=new ProcessBuilder("java","practicaevaluable1.OrdenarNumeros");
			pb2.directory(directorio);
			p=pb2.start();
		OutputStream out=p.getOutputStream();//Entrada

			for (int i = 0; i < numeros.size(); i++) {
				out.write((numeros.get(i) + "\n").getBytes());	
				
			}
			out.write((-1+"\n").getBytes());
			out.close();
			InputStream inOrdenar=p.getInputStream();
			BufferedReader brOrdenar=new BufferedReader(new InputStreamReader(inOrdenar));
			String lineaOrdenados;
			while ((lineaOrdenados=brOrdenar.readLine())!=null) {
				System.out.println(lineaOrdenados);
			}
			brOrdenar.close();
            int exitCode = p.waitFor();
			  if (exitCode == 0) {
                  System.out.println("El proceso ha terminado con éxito.");
              } else {
                  System.out.println("El proceso ha terminado con errores. Código de salida: " + exitCode);
              } 
			
			
			} catch (IOException e) {
			            e.printStackTrace();
			        } 
				 
			
			}
			
			

		}
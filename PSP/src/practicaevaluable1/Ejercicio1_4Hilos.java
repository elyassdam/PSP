package practicaevaluable1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1_4Hilos extends Thread{
	public static void main(String[] args) {
		
	}
	
	
	public static void Proceso() {
		
	}
	public static String[] AbreFichero (File fichero) {
	String datosFichero[] = null;
	try {
		FileReader fr = new FileReader(fichero);
	BufferedReader br=new BufferedReader(fr);
	String linea;
	int contadorLineas=0;
	//contar lineas del archivo 
	while((linea=br.readLine())!=null) {
		contadorLineas++;
	}
	br.close();
	br=new BufferedReader(fr);
	String abierto[]=new String[contadorLineas];
	for (int i = 0; i < abierto.length; i++) {
		abierto[i]=br.readLine();
	}
	br.close();
datosFichero=abierto;
	
	}catch (FileNotFoundException e) {
	System.out.println("NO se encuentra el fichero");
	e.printStackTrace();
	}catch(IOException e) {
	System.out.println("Error E/S");
	e.printStackTrace();
	}
	return datosFichero;
}
}

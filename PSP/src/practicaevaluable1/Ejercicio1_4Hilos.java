package practicaevaluable1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio1_4Hilos extends Thread{
	static List<String>letras=EJ1_GeneradorNumeros.id;
	static List<Integer>nums=EJ1_GeneradorNumeros.suma;
    private String[] datosFichero;
	public static void main(String[] args) {
		EJ1_GeneradorNumeros.main(null);
		
		Ejercicio1_4Hilos hilo=new Ejercicio1_4Hilos();
		hilo.start();
		
	}
		@Override
		public void run() {
			 System.out.println("Abriendo fichero");
		        File fich = new File("archivo100Kresul.csv");
		        datosFichero = AbreFichero(fich);
		        if (datosFichero != null) {
		            System.out.println("Procesando información del fichero ");
		            Proceso();
		            System.out.println("Guardando fichero");
		            Guardar();
		        } else {
		            System.out.println("Error al abrir el fichero.");
		        }
		    }
	
	
	public static String[] AbreFichero (File fichero) {
	String datosFichero[] = null;
	try {
		

		FileReader fr = new FileReader(fichero);
	BufferedReader br=new BufferedReader(fr);
	int contadorLineas=0;
	String linea;
	//contar lineas del archivo 
	while((linea=br.readLine())!=null) {
		//char l=linea.charAt(0);
		//String letra=String.valueOf(l);
		//int numero=Integer.parseInt(linea.substring(1));
		//letras.add(letra);
		//nums.add(numero);
		contadorLineas++;
	}
	br.close();
	BufferedReader br2=new BufferedReader(new FileReader(fichero));
	String abierto[]=new String[contadorLineas];
	for (int i = 0; i < contadorLineas; i++) {
		abierto[i]=br2.readLine();
	}
datosFichero=abierto;
System.out.println(letras.size()+""+nums.size());
	}catch (FileNotFoundException e) {
	System.out.println("NO se encuentra el fichero");
	e.printStackTrace();
	}catch(IOException e) {
	System.out.println("Error E/S");
	e.printStackTrace();
	}
	return datosFichero;
}
	public static Map<String,Integer> Proceso() {
		
		//List<Integer>nums=EJ1_GeneradorNumeros.suma;
		Map<String,Integer > sumaParcial=new HashMap<>();
		try {
		//System.out.println("antes del mapa");
		for (int i = 0; i <letras.size(); i++) {
			String id=letras.get(i);
			int numero=nums.get(i);
			if(sumaParcial.containsKey(id)){
				int sumaAnterior=sumaParcial.get(id);
				sumaParcial.put(id, sumaAnterior+numero);
				
			}else {			
			
				sumaParcial.put(id, numero);

		}
		}
		//System.out.println("despues del mapa"+letras.size()+""+nums.size());
		System.out.println(sumaParcial.toString());
		System.out.println("Proceso realizado correctamente");
		}catch(Exception e) {
		e.printStackTrace();
		System.out.println("No se ha hecho correctamente ");
	}
		return sumaParcial;
	}
	public static void Guardar() {
		 try {
			 BufferedWriter bw=new BufferedWriter(new FileWriter("resultado.csv"));
			 Map<String,Integer> mapaGenerado=Proceso();
			 for (Map.Entry<String, Integer> entry : mapaGenerado.entrySet()) {
				String key = entry.getKey();
				Integer val = entry.getValue();
				bw.write(key+":"+val);
			}
			 bw.close();
				
	System.out.println("size"+mapaGenerado.size());
	                   
	                }
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
}

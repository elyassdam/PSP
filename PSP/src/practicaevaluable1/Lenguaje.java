package practicaevaluable1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lenguaje {
public static void generadorPalabras(int palabras) throws IOException {
	File fich=new File("archivo.txt") ;
	
	String caracteres="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	BufferedWriter bw=new BufferedWriter(new FileWriter(fich,true));
	Random letras=new Random();//caracter para letras
	Random longitud=new Random();//Longitud de la palabra
	int cont = 0;
	String palabra;
	int c = 0;
	while(cont<palabras) {
		int LongPalabra=longitud.nextInt(10)+1;
	for (int i = 0; i<LongPalabra; i++) {
		c=letras.nextInt(caracteres.length());
		char letra=caracteres.charAt(c);
	bw.write(letra);
	}
	bw.newLine();
	cont++;
	}
	bw.close();
}

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Introduce la cantidad de palabras que quiere");
		int palabras=sc.nextInt();
		generadorPalabras(palabras);
		
}
	}

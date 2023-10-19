package ejercicio2_5;

import java.util.Scanner;

public class Ejercicio2_5 {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	MyHilo hilo=new MyHilo();
	String entrada="";
	hilo.start();
	do {
		System.out.println("introduce una cadena :");
		entrada = sc.next();
		System.out.println("Has introducido "+entrada);
		if(entrada.equals("S")) {
			//suspernder hilo
			hilo.suspende();
	}	else if(entrada.equals("R")){
		//reanudar el hilo 
		hilo.reanuda();
	}
	}
	while (!entrada.equals("*")) ;
		System.out.println("El programa se acabó ya que la cadena es un asterisco");
hilo.pararHilo();
	}
}
	


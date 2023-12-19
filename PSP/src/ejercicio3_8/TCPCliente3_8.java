package ejercicio3_8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPCliente3_8 {
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
		String Host = "localhost";
		int Puerto = 6000;// puerto remoto
		int numero=0;
		Scanner sc=new Scanner(System.in);
		Numeros objNum=new Numeros();
		System.out.println("PROGRAMA CLIENTE INICIADO....");
		Socket cliente = new Socket(Host, Puerto);
		ObjectOutputStream numSal = new ObjectOutputStream(cliente.getOutputStream());
		ObjectInputStream numIn=new ObjectInputStream(cliente.getInputStream());

		do {
		System.out.println("introduce el numero");
		numero=sc.nextInt();
objNum.setNumero(numero);

		
		numSal.reset();
		// Se env�a el objeto
		numSal.writeObject(objNum);
		System.out.println("Envio: " + objNum.getNumero());
//Flujod e entrada para objetos
	objNum=(Numeros) numIn.readObject();
	System.out.println("Envio: " + objNum.getNumero()+"*"+objNum.getCubo()+"*"+objNum.getCuadrado());

	
		}while(numero>0);
		// CERRAR STREAMS Y SOCKETS
		numSal.close();
		numIn.close();
		cliente.close();
		
		
	}
}

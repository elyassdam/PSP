package ejercicio3_8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServidor3_8 {
	public static void main(String[] arg) throws IOException, ClassNotFoundException {
		int numeroPuerto = 6000;// Puerto
		ServerSocket servidor = new ServerSocket(numeroPuerto);
		System.out.println("Esperando al cliente.....");
		Socket cliente = servidor.accept();
		Numeros dato =new Numeros();
		ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
		ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
dato.setNumero(1);
		while(dato.getNumero()>0) {
			
		
		// Se obtiene un stream para leer objetos
		 dato = (Numeros) inObjeto.readObject();
		System.out.println("Recibo: " + dato.getNumero());
	int numero=dato.getNumero();
	if(numero>0) {
	dato.setCuadrado(numero*numero);
	dato.setCubo(numero*numero*numero);
	
		

		// Se prepara un flujo de salida para objetos
				outObjeto.reset();
				// Se prepara un objeto y se env�a
				outObjeto.writeObject(dato); // enviando objeto
				System.out.println("Envio: " + dato.getNumero()+"*"+dato.getCuadrado()+"*"+dato.getCubo());
				
				
						
		}
		
		
		
else {
		outObjeto.reset();
		// Se prepara un objeto y se env�a
		outObjeto.writeObject(dato); // enviando objeto
	}
		}
	outObjeto.close();
	inObjeto.close();
	cliente.close();
	servidor.close();
	
}
}
	


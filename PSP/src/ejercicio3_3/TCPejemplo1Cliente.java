package ejercicio3_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPejemplo1Cliente  {
  public static void main(String[] args) throws Exception {
	String Host = "localhost";
	int Puerto = 6000;//puerto remoto	
	
	System.out.println("PROGRAMA CLIENTE INICIADO....");
	Socket Cliente = new Socket(Host, Puerto);

	// CREO FLUJO DE SALIDA AL SERVIDOR	
	DataOutputStream flujoSalida = new
            DataOutputStream(Cliente.getOutputStream());

	// ENVIO UN SALUDO AL SERVIDOR
	Scanner sc=new Scanner(System.in);
	int numero=sc.nextInt();
	flujoSalida.writeUTF("Dame el cuadrado de ste numero");
	flujoSalida.writeInt(numero);

	// CREO FLUJO DE ENTRADA AL SERVIDOR	
	DataInputStream flujoEntrada = new 
            DataInputStream(Cliente.getInputStream());

	// EL SERVIDOR ME ENVIA UN MENSAJE
	System.out.println("Recibiendo del SERVIDOR: \n\t" + 
               flujoEntrada.readInt());

	// CERRAR STREAMS Y SOCKETS	
	flujoEntrada.close();	
	flujoSalida.close();	
	Cliente.close();	
  }// main
}// 

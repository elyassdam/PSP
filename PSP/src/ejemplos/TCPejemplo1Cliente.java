package ejemplos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TCPejemplo1Cliente  {
  public static void main(String[] args) throws Exception {
	String Host = "localhost";
	int Puerto = 6000;//puerto remoto	
	String cadenaRecibida="";
	String cadenaEnviar="";

	System.out.println("PROGRAMA CLIENTE INICIADO....");
	Socket Cliente = new Socket(Host, Puerto);
	// CREO FLUJO DE ENTRADA AL SERVIDOR	
		DataInputStream flujoEntrada = new 
	            DataInputStream(Cliente.getInputStream());

	// EL SERVIDOR ME ENVIA UN MENSAJE
		cadenaRecibida=flujoEntrada.readUTF();
	System.out.println("Recibiendo del SERVIDOR: \n\t" + 
               cadenaRecibida);
	//procesar cadena
	cadenaEnviar=cadenaRecibida.toLowerCase();
	// CREO FLUJO DE SALIDA AL SERVIDOR	
	DataOutputStream flujoSalida = new
            DataOutputStream(Cliente.getOutputStream());
	// ENVIO UN SALUDO AL SERVIDOR
		flujoSalida.writeUTF(cadenaEnviar);
		flujoSalida.writeUTF("recibido");
	// CERRAR STREAMS Y SOCKETS	
	flujoEntrada.close();	
	flujoSalida.close();	
	Cliente.close();	
  }// main
}// 

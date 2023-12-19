

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Servidor {
	public static void main(String[] args) throws IOException {
		int puerto=6000;
		String host="localhost";

while(true) {
			ServerSocket sv=new ServerSocket(puerto);
			Socket scliente=null;
			while(true) {
			System.out.println("Esperando cliente");
			scliente=sv.accept();
			InputStream in=scliente.getInputStream();
			DataInputStream datain=new DataInputStream(in);
			int numero;
			int aleatorio;
			String mensaje = "";
			Random random=new Random();
			aleatorio=random.nextInt(101);

			OutputStream out=scliente.getOutputStream();
			DataOutputStream dataout=new DataOutputStream(out);
	        while (true) {
			numero=datain.readInt();
				System.out.println("Recibiendo mensaje  cliente "+numero);
				if(aleatorio>numero) {
					mensaje="El numero"+numero+" es mayor  ";

				}if(aleatorio<numero){
					mensaje="El numero"+numero+" es menor  ";
				}if(aleatorio==numero) {
					mensaje="El numero es correcto";
					sv.close();
				}
				dataout.writeUTF(mensaje);
				
					sv.close();
				}
			}
	      
	        
	     
			
			}
}
	}


package ejercicio3_9;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPCliente3_9 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] ¡args) throws IOException {

		DatagramSocket clientSocket = new DatagramSocket();// socket cliente

		// DATOS DEL SERVIDOR al que enviar mensaje
		InetAddress IPServidor = InetAddress.getLocalHost();// localhost
		int puerto = 12345; // puerto por el que escucha
Persona per=new Persona("Maria",22);
		// INTRODUCIR DATOS POR TECLADO
		System.out.print("Introduce mensaje: ");
		String cadena = sc.nextLine();

		byte[] enviados = new byte[1024];
		enviados = cadena.getBytes();

		// ENVIANDO DATAGRAMA AL SERVIDOR
		DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPServidor, puerto);
		clientSocket.send(envio);

		// RECIBIENDO DATAGRAMA DEL SERVIDOR
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream (bs);
		out.writeObject(per); //se escribe el objeto en el stream
		out.close(); //se cierra el stream
		byte[] bytes = bs.toByteArray(); // objeto en bytes
		byte[] recibidos = new byte[2];
		/*
		DatagramPacket recibo = new DatagramPacket(recibidos, recibidos.length);
		System.out.println("Esperando datagrama....");
		clientSocket.receive(recibo);

		// Obtener el n�mero e caracteres
		byte[] hh = recibo.getData();
		int numero = hh[0];

		System.out.println("Recibo N� de caracteres que son a=> " + numero);
*/
		clientSocket.close();// cerrar socket
	}
}



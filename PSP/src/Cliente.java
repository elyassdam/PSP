

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws  IOException {
		Scanner sc=new Scanner(System.in);
		String host="localhost";
		int puerto=6000;
		int numero;
		String cadena="";

			Socket scliente=new Socket(host,puerto);
			System.out.println("Iniciando...");
			do {System.out.println("Introduce numero");
				numero=sc.nextInt();
				OutputStream out=scliente.getOutputStream();
				DataOutputStream dataout=new DataOutputStream(out);
				System.out.println("Escribiendo cadena :"+numero);
				dataout.writeInt(numero);
				InputStream in=scliente.getInputStream();
				DataInputStream datain=new DataInputStream(in);
				System.out.println("Recibiendo mensaje"+datain.readUTF());
			}while(!cadena.equals("El numero es correcto"));
			scliente.close();
			System.out.println("es correcto");
		
	}
	}




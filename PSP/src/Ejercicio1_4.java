import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1_4 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
	     System.out.print("Introduce una cadena: ");
	        String cadena = sc.nextLine();
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Ejercicio1_4.txt"));    
            bufferedWriter.write(cadena);
            bufferedWriter.close();
            args[0]=cadena;
            System.out.println(args[0]);
		
		
	}

}

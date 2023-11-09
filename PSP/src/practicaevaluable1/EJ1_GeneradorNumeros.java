package practicaevaluable1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EJ1_GeneradorNumeros {

	public static void main(String[] args) {
		String Identificador = (generadorID(6));
		System.out.print(Identificador);
		generaFicheroCSV(Identificador);
		System.out.println("Antes de generar el archivo CSV");
		generaFicheroCSV(Identificador);
		System.out.println("Después de generar el archivo CSV");

	}

	public static String generadorID(int longitud) {
		Random random = new Random();
		String cadena;
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder(longitud);
		int contador = 0;
		while (contador < 200) {

			for (int i = 0; i < longitud; i++) {
				int identificador = random.nextInt(caracteres.length());
				sb.append(caracteres.charAt(identificador));
			}
			contador++;
		}

		return sb.toString();

	}

	public static void generaFicheroCSV(String ID) {
		try {
			File f = new File("archivoPractica2.csv");
			FileWriter fichero = new FileWriter(f.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fichero);

			String cadena;
			char c;
			Random random = new Random();
			int numero;
			int contador = 0;
			while (contador < 100000) {
				for (int i = 0; i < ID.length(); i++) {
					c = ID.charAt(i);
					numero = random.nextInt(10001);
					cadena = c + "" + numero;
					bw.write(cadena);
					bw.newLine();
					contador++;
				}

			}

			bw.close();
			System.out.println("Tu fichero csv se ha creado correctaemnte en la ruta indicada");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}



import java.io.File;
import java.io.IOException;

public class HacerCopia {
		
public static void main(String[] args) throws IOException {
	

		File fOut = new File("dir.txt");
		File fin=new File("dir_copia.txt");
			File directorio = new File(".\\bin");
			ProcessBuilder pb = new ProcessBuilder("java", "LanzaDirContent");
			pb.directory(directorio);
			pb.redirectOutput(fOut);
			// se ejecuta el proceso
			Process p = new ProcessBuilder("PowerShell", "/C", "Copy-Item -Path C:\\Users\\Yassin\\git\\PSP\\PSP\\dir.txt  –Destination C:\\Users\\Yassin\\git\\PSP\\PSP\\dir_copia.txt").start();
		
			// COMPROBACION DE ERROR - 0 bien - 1 mal
						int exitVal;
						try {
						exitVal = p.waitFor();
						System.out.println("Valor de Salida: " + exitVal);
						} catch (InterruptedException e) {
						e.printStackTrace();
						}
	}
	}




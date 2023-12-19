import java.io.File;
import java.io.IOException;

public class LanzaDirContent {
public static void main(String[] args) throws IOException {
	File fOut = new File("dir.txt");
  		File directorio = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "DirContent");
		pb.directory(directorio);
		// se ejecuta el proceso
	    pb.redirectOutput(fOut);
		Process p = pb.start();
	  
	
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

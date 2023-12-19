

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class DirContent {

		public static void main(String[] args) throws IOException {
			Process p = new ProcessBuilder("PowerShell", "/C", "Get-ChildItem").start();
			try {
			InputStream is = p.getInputStream();
			// mostramos en pantalla caracter a caracter
			int c;
			while ((c = is.read()) != -1)
			System.out.print((char) c);
			is.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
}
  }

	


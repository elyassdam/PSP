import java.util.Iterator;

public class HiloCadena extends Thread {
ObjetoCompartido objeto;
String cadena;
HiloCadena(ObjetoCompartido o,String s){
	this.objeto=o;
	this.cadena=s;
}
public void run() {
	synchronized(objeto) {
		
	
	for (int i = 0; i < 10; i++) {
		objeto.pinta(cadena);
		objeto.notify();
		try {
			objeto.wait();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}objeto.notify();
	}
	System.out.println("\n"+cadena+"finalizado ");
}
}

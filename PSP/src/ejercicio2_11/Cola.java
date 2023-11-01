package ejercicio2_11;
public class Cola {
    private String cadena;
    private boolean disponible = false;//inicialmente cola vacia

    public synchronized String get() {
    	  while (!disponible) {
    	    try {
    	          wait();
    	    } catch (InterruptedException e) { }
    	  }
    	  disponible = false;
    	  notify();
    	  return cadena;
    	}


    public synchronized void put(String cadena) {
    	  while (disponible){
    	    try {
    	          wait();
    	    } catch (InterruptedException e) { }
    	  }
    	  this.cadena = cadena;
    	  disponible = true;
    	
    	  notify();
    	}

     
     
}

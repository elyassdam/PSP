package ejercicio2_11;


public class Productor extends Thread {
    private Cola cola;
    private int n;

    public Productor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
    	 
        for (int i = 0; i < 10; i++) {
            cola.put("PING"); //pone la cadena 
            try {
                sleep(100);
            } catch (InterruptedException e) { }	
            cola.put("PONG");
            try {
                sleep(100);
            } catch (InterruptedException e) { }
			
        }
    }
}




package productorConsumidorSynchronized;


public class Productor extends Thread {
    private Cola cola;
    private int n;

    public Productor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cola.put(i); //pone la cadena 
        
            try {
                sleep(100);
            } catch (InterruptedException e) { }			
			
        }
    }
}


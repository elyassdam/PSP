package practicaevaluable1;

public class Consumidor extends Thread {
	    private Cola cola;
	    private int n;

	    public Consumidor(Cola c, int n) {
	        cola = c;
	        this.n = n;
	    }

	    public void run() {
	        char valor = 0;
	        for (int i = 0; i < 15; i++) {
	            valor = cola.get(); //recoge el caracter
	            System.out.println(i + "=>Consumidor: " + n
	                               + ", consume: " + valor);
	        }
	    }
	}


package ejercicio2_11;


public class Consumidor extends Thread {
    private Cola cola;
    private int n;

    public Consumidor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
    	   for (int i = 0; i < 10; i++) {
               String cadena = cola.get(); // Recoge la cadena
               System.out.println("Consumidor " + n + " recibe: " + cadena);
           }
       }
    }


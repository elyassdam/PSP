package practicaevaluable1;
public class Productor extends Thread {

    private Cola cola;
    private int n;

    public Productor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
        	char carcater=(char)(Math.random()*(126-48+1));
        	cola.put(carcater); //pone el caracter
            System.out.println(i + "=>Productor : " + n
                               + ", produce: " + carcater);
            try {
             sleep(100);
            } catch (InterruptedException e) { 
            	e.printStackTrace();
            }			
            
        }
    }
}
